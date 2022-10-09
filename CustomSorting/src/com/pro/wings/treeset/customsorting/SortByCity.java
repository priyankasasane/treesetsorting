package com.pro.wings.treeset.customsorting;

import java.util.Comparator;

public class SortByCity implements Comparator<Employee> {

		public int compare(Employee c1, Employee c2) {
			
			return c1.city.compareTo(c2.city);
		}
}
