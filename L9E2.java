package com.capgemini.Lab9;

import java.util.*;
public class L9E2 {
	public Map<Character,Integer> countCharacter(char[] ch) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(char c:ch) {
			//System.out.println(c);
			if(hm.containsKey(c)) {
				int value = hm.get(c) + 1;
				hm.put(c, value);
			}
			else {
				hm.put(c, 1);
			}
		}
		return hm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of character u want in array");
		int n = sc.nextInt();
		char ch[] = new char[n];
		sc.nextLine();
		for(int i = 0;i < n;i++) {
			System.out.println("Enter character");
			String s = sc.nextLine();
			char c = s.charAt(0);
			ch[i] = c;
		}
		L9E2 e = new L9E2();
		System.out.println(e.countCharacter(ch));
		
	}

}

