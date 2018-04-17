/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc.finalproject;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;


public class MaterialManager extends Manager<Material> {
	@Override
	protected void parse() {
		int id;
		Reader in;
		Iterable<CSVRecord> records;
		try {
			in = new FileReader("src/storage/Material.csv");
			records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
			for (CSVRecord record : records) {
				id = Integer.valueOf(record.get("id"));
				add(new Material(id, record.get("name"), 
					SubstrateType.valueOf(record.get("substrateType")), 
					Color.valueOf(record.get("color")), 
					Double.valueOf(record.get("width")), 
					Double.valueOf(record.get("height")),
					Double.valueOf(record.get("thickness"))));
				
				if (nextId <= id)
					nextId = id + 1;
			}
		} catch (IOException ex) {
			Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@Override
	public void save() {
		BufferedWriter writer;
		CSVPrinter csvPrinter;
		try {
            writer = new BufferedWriter(new FileWriter("src/storage/Employee.csv"));
            csvPrinter = new CSVPrinter(writer, CSVFormat.RFC4180
                   .withHeader("id", "name", "substrateType", "color",
						"width", "height", "thickness"));
			
			for (Material material : list())
				csvPrinter.printRecord(
					material.getId(),
					material.getName(),
					material.getSubstrateType(),
					material.getWidth(),
					material.getHeight(),
					material.getThickness());
			
            csvPrinter.flush();            
        } catch (IOException ex) {
			Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
