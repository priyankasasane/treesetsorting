package com.pro.wings.treeset.customsorting;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>{

		public int compare(Employee n1, Employee n2) {
			
			return n1.name.compareTo(n2.name);
		}

	}

