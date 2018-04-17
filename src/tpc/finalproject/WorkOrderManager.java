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
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;


public class WorkOrderManager extends Manager<WorkOrder> {
	@Override
	protected void parse() {
		int id;
		Reader in;
		Iterable<CSVRecord> records;
		try {
			in = new FileReader("src/storage/WorkOrder.csv");
			records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
			
			for (CSVRecord record : records) {
				id = Integer.valueOf(record.get("id"));
				add(new WorkOrder(id, 
					Integer.valueOf(record.get("accountId")), 
					new SimpleDateFormat("MM/dd/yyyy").parse(record.get("dueDate")),
					Machine.valueOf(record.get("machine")),
					WorkMethod.valueOf(record.get("workMethod")),
					Integer.valueOf(record.get("materialId")),
					Double.valueOf(record.get("width")),
					Double.valueOf(record.get("height")),
					Integer.valueOf(record.get("producedById")),
					Integer.valueOf(record.get("revisedById")),
					record.get("notes")));
				
				if (nextId <= id)
					nextId = id + 1;
			}
		} catch (IOException | ParseException ex) {
			Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@Override
	public void save() {
		BufferedWriter writer;
		CSVPrinter csvPrinter;
		try {
            writer = new BufferedWriter(new FileWriter("src/storage/WorkOrder.csv"));
            csvPrinter = new CSVPrinter(writer, CSVFormat.RFC4180
                   .withHeader("id", "accountId", "dueDate", "machine",
						   "workMethod", "materialId", "width", "height",
						   "producedById", "revisedById", "notes"));
			
			String pattern = "MM/dd/yyyy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			
			for (WorkOrder workOrder : list())
				csvPrinter.printRecord(
					workOrder.getId(),
					workOrder.getAccountId(),
					simpleDateFormat.format(workOrder.getDueDate()),
					workOrder.getMachine(),
					workOrder.getWorkMethod(),
					workOrder.getMaterialId(),
					workOrder.getWidth(),
					workOrder.getHeight(),
					workOrder.getProducedById(),
					workOrder.getRevisedById(),
					workOrder.getNotes());
			
            csvPrinter.flush();            
        } catch (IOException ex) {
			Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
