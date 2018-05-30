package com.CharBoolean;

public class Main {

	public static void main(String[] args) {
		//width 16 (2 bytes)
		char myCharNumber = '0';
		char myCharChar = 'a';
		char myCharSpec = '\u00A9';
		System.out.println("unicode out was: " + myCharSpec);
		
		boolean myBoolean = false;
		boolean isMale = true;
		
		char myQuizSpec = '\u00AE';
		System.out.println("unicode out was: " + myQuizSpec);
	}

}
