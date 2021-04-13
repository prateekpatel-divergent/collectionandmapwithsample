package com.divergent.collections.assignment;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetUsed {

	enum days{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}
	public static void main(String[] args) {
		Set<days> set = EnumSet.of(days.TUESDAY,days.WEDNESDAY);
		set.forEach((itr)->System.out.println(itr));
		
		Set<days> set1 = EnumSet.allOf(days.class);
		System.out.println("All Days: "+set1);
	}

}
