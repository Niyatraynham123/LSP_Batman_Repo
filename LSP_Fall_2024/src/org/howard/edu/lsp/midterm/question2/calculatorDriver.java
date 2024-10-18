package org.howard.edu.lsp.midterm.question2;

public class calculatorDriver {
	 public static void main(String[] args) {
	        System.out.println(Calculator.sum(5, 10));                   /**Sum of two ints: should return 15 */
	        System.out.println(Calculator.sum(3.5, 7.8));                /**Sum of two doubles: should return 11.3*/
	        System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5})); /**Sum of array of ints: should return 15*/
	    }

}