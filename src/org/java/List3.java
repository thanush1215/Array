package org.java;

import java.util.Arrays;

public class List3 {

	
	    public static void main(String[] args) {
	        int[] a = {10, 10, 20, 50, 60, 80, 60, 50};

	    Arrays.sort(a);

	        int n = a.length;
	
	        int uniqueCount = 0;

	        for (int i = 0; i < n; i++) {
	
	        	 if (i == n - 1 || a[i] != a[i + 1]) {
	                 a[uniqueCount] = a[i]; 
	                 uniqueCount++;
	             }
	         }    	
	        int[] result = Arrays.copyOf(a, uniqueCount);     	
	        	
	        System.out.print("Output a[] = {");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i]);
	            if (i < result.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("}"); 
	        
	        
	        
	    }
	}	

