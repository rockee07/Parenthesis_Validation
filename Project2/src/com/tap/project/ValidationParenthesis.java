package com.tap.project;

import java.util.Scanner;

public class ValidationParenthesis {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		System.out.print(validParenthesis(s));
		}
	public static String validParenthesis(String s) {
		if(s.length()<2) {
			return "Invalid Parenthesis";
		}
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)=='[' && s.charAt(j)==']') {
				i++;
				j--;
			}
			else if(s.charAt(i)=='{' && s.charAt(j)=='}') {
				i++;
				j--;
			}
			else if(s.charAt(i)=='(' && s.charAt(j)==')') {
				i++;
				j--;
			}
			else {
				return "Invalid Parenthesis";
			}
		}
		return "Valid Parenthesis";
	}

}
