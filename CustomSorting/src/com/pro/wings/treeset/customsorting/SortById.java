package com.pro.wings.treeset.customsorting;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
		
		public int compare(Employee d1, Employee d2) {
			
			if(d1.id==d2.id)
			    return 0;
			else if(d1.id>d2.id)
				return 1;
			else
				return -1;
		}
}
