package com.orb;

import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		Get password length from the User
		System.out.println("Enter the password length ?");
		int length = sc.nextInt();
		
//		Generate Password
		String pswd = genpswd(length);
		System.out.println("Generate password :" + pswd);
	}
	
	public static String genpswd(int length) 
	{
//		Set of Characters
		String Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$&";
		
//		Initialize secure random generator
		SecureRandom rd = new SecureRandom();
		
		StringBuilder pswd = new StringBuilder(length);
		for (int i = 0; i <length; i++) 
		{
			int rdIndex = rd.nextInt(Characters.length());
			pswd.append(Characters.charAt(rdIndex));
		} 
		return pswd.toString(); 
	}

}
