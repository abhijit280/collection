package com.D26_08_2026.Comparator1;

import java.util.Comparator;

public class CompareByDate implements Comparator<BookTicket>{

	@Override
	public int compare(BookTicket o1, BookTicket o2) {
		int result = Integer.compare(o1.date, o2.date);
		return result;
	}
	
}
