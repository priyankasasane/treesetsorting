package com.pro.wings.treeset.customsorting;
import java.util.TreeSet;
public class Test {
public static void main(String[] args) {
			
			Employee e1 = new Employee(100,"Ram","Thane");
			Employee e2 = new Employee(101,"Priti","Pune");
			Employee e3 = new Employee(102,"Sham","Mumbai");
			
			SortById si1= new SortById(); 
			TreeSet ts = new TreeSet(si1);
			ts.add(e2);
			ts.add(e1);
			ts.add(e3);
			System.out.println("Sorting by Id : "+ts);
			
			SortByName sn1 = new SortByName(); 
			TreeSet ts1 = new TreeSet(sn1);
			ts1.add(e2);
			ts1.add(e1);
			ts1.add(e3);
			System.out.println("Sorting by name : "+ts1);
			
			SortByCity sc1 = new SortByCity(); 
			TreeSet ts2 = new TreeSet(sc1);
			ts2.add(e2);
			ts2.add(e1);
			ts2.add(e3);
			System.out.println("Sorting by city : "+ts2);
			
		}
	}