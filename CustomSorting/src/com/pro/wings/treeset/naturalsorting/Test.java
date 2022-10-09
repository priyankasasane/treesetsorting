package com.pro.wings.treeset.naturalsorting;
import java.util.TreeSet;
public class Test {
	public static void main(String[] args) {

		Student s1=new Student(10,"zzz");
		Student s2=new Student(20,"xxx");
		Student s3=new Student(30,"ccc");
		Student s4=new Student(40,"mmm");
		
		TreeSet t=new TreeSet();
		t.add(s2);
		t.add(s4);
		t.add(s1);
		t.add(s3);

		System.out.println(t);
	}
}
