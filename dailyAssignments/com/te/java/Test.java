package com.te.java;

import java.util.ArrayList;

public class Test {
	  public static void main(String[] args) {
	    ArrayList<Integer> num = new ArrayList<Integer>();

	    num.add(1);
	    num.add(2);
	    num.add(3);
	    num.add(4);
	    num.add(2);

	    System.out.println("ArrayList with duplicate elements: " + num);

	    ArrayList<Integer> NoDupNum = new ArrayList<Integer>();

	    for (Integer n : num) {
	      if (!NoDupNum.contains(n)) {
	        NoDupNum.add(n);
	      }
	    }

	    System.out.println("ArrayList without duplicate elements: " + NoDupNum);
	  }
	}