/**
 * 
 */
package edu.unlv.kilo.web;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.ui.ModelMap;

import edu.unlv.kilo.domain.MoneyValue;
import edu.unlv.kilo.domain.TransactionDescription;
import edu.unlv.kilo.domain.TransactionEntity;

/**
 * @author Shane
 * 
 * Generates HTML for tagging system
 * Lists transactions provided and allows options for filtering the transactions
 * Has option to mark all of the visible filtered transactions to an expense (/deprecated: itemEntity)
 *
 */
public class TaggingView {
	List<TransactionEntity> transactions;
	
	/**
	 * Debug constructor
	 * uses a demonstration list of transactions
	 * not to be used in release
	 */
	TaggingView() {
		this.transactions = new LinkedList<TransactionEntity>();
		
		{
			TransactionEntity a = new TransactionEntity();
			a.setAmount(new MoneyValue(300));
			a.setTimeof(new Date(2012,03,01));
			TransactionDescription desc = new TransactionDescription();
			desc.setDescription("Test transaction A");
			a.setDescription(desc);
			
			transactions.add(a);
		}
		
		{
			TransactionEntity a = new TransactionEntity();
			a.setAmount(new MoneyValue(300));
			a.setTimeof(new Date(2012,03,05));
			TransactionDescription desc = new TransactionDescription();
			desc.setDescription("Test transaction B");
			a.setDescription(desc);
			
			transactions.add(a);
		};
	}
	
	/**
	 * Creates a tagging view for the specified list of transactions
	 * This view will be used to put said transactions into expenses (deprecated name: itemEntities)
	 * @param transactions List of transactions to prompt for sorting into expenses
	 */
	TaggingView(List<TransactionEntity> transactions) {
		this.transactions = transactions;
	}
	
	/**
	 * Generates HTML string for rendering by client
	 * @param modelMap
	 */
	void render(ModelMap modelMap) {
		List<TransactionEntity> transactions = new LinkedList<TransactionEntity>();
		
		{
			TransactionEntity a = new TransactionEntity();
			a.setAmount(new MoneyValue(300));
			a.setTimeof(new Date(2012,03,01));
			TransactionDescription desc = new TransactionDescription();
			desc.setDescription("Test transaction A");
			a.setDescription(desc);
			
			transactions.add(a);
		}
		
		{
			TransactionEntity a = new TransactionEntity();
			a.setAmount(new MoneyValue(300));
			a.setTimeof(new Date(2012,03,05));
			TransactionDescription desc = new TransactionDescription();
			desc.setDescription("Test transaction B");
			a.setDescription(desc);
			
			transactions.add(a);
		}
		
		modelMap.addAttribute("transactions", transactions);
		
		String output = "<table>" +
				"	<tr>" +
				"		<th>Date</th>" +
				"		<th>Description</th>" +
				"		<th>Amount</th>" +
				"	</tr>" +
				"";
		
		for (TransactionEntity transactionEntity : transactions) {
			output += "<tr>";
			output += transactionEntity.getTDset();
			output += "</tr>";
		}
		
		output += "</table>";
		
		modelMap.addAttribute("output", output);
		modelMap.addAttribute("transactions", transactions);
	}
}