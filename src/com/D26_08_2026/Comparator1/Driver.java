package com.D26_08_2026.Comparator1;

import java.util.Map.Entry;
import java.util.Set;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {

		Map<BookTicket, Boolean> data = new TreeMap<BookTicket, Boolean>(new CompareByDate());
		data.put(new BookTicket(26, 2, 2100), true);
		data.put(new BookTicket(27, 2, 2600), false);
		data.put(new BookTicket(24, 2, 2200), true);

		Set<Entry<BookTicket, Boolean>> entry = data.entrySet();
		Iterator<Entry<BookTicket, Boolean>> itr = entry.iterator();
		while (itr.hasNext()) {
			
			Map.Entry<BookTicket, Boolean> entry2 = itr.next();
			BookTicket bookTicket = entry2.getKey();
			
			System.out.println(bookTicket.date + " , "+bookTicket.ticketNum + " , "+bookTicket.price + " , "+entry2.getValue());
			
		}
		System.out.println();
		
		Comparator<BookTicket>comparator1 = (x,y)->Integer.compare(x.price, y.price);
		//this lambda expression use for comparator in same class
		Map<BookTicket, Boolean> data1 = new TreeMap<BookTicket, Boolean>(comparator1);
		data1.put(new BookTicket(26, 2, 2100), true);
		data1.put(new BookTicket(27, 2, 2600), false);
		data1.put(new BookTicket(24, 2, 2200), true);
		
		Set<Entry<BookTicket, Boolean>> entry3 = data1.entrySet();
		Iterator<Entry<BookTicket, Boolean>> itr1 = entry3.iterator();
		while (itr1.hasNext()) {
			
			Map.Entry<BookTicket, Boolean> entry4 = itr1.next();
			BookTicket bookTicket1 = entry4.getKey();
			
			System.out.println(bookTicket1.date + " , "+bookTicket1.ticketNum + " , "+bookTicket1.price + " , "+entry4.getValue());
			
		}
	}

}
