package com.rohit.july18;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*double number = 20000005;
		NumberFormat formatter = new DecimalFormat("#0");

		System.out.println(number);
		System.out.println(formatter.format(number));*/
		
		String str="Message with sequence number :151738 created successfully";
		
		str=str.substring(str.indexOf(':')+1, str.length()-20);
		System.out.println(str);
		System.out.println(str.trim());
		
		
	}

}
