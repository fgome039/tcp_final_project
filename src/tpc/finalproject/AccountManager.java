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
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;


public class AccountManager extends Manager<Account> {	
	@Override
	protected void parse() {
		int id;
		Reader in;
		Iterable<CSVRecord> records;
		try {
			in = new FileReader("src/storage/Account.csv");
			records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
			for (CSVRecord record : records) {
				id = Integer.valueOf(record.get("id"));
				add(new Account(id, record.get("name"), record.get("contactName"), 
					record.get("contactEmail"), record.get("phoneNumber"), 
					record.get("street"), record.get("suite"), record.get("city"), 
					record.get("state"), record.get("zipcode")));
				
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
            writer = new BufferedWriter(new FileWriter("src/storage/Account.csv"));
            csvPrinter = new CSVPrinter(writer, CSVFormat.RFC4180
                   .withHeader("id", "name", "contactName", "contactEmail",
						"phoneNumber", "street", "suite", "city", "state", "zipcode"));
			
			for (Account account : list())
				csvPrinter.printRecord(
					account.getId(),
					account.getName(),
					account.getContactName(),
					account.getContactEmail(),
					account.getPhoneNumber(),
					account.getStreet(),
					account.getSuite(),
					account.getCity(),
					account.getState(),
					account.getZipcode());
			
            csvPrinter.flush();            
        } catch (IOException ex) {
			Logger.getLogger(AccountManager.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
