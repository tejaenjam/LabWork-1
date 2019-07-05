package com.capgemini.Lab9;

import java.util.*;
public class L9E3 {
	
	public Map<Integer,Integer> getSquares(int[] num){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i = 0;i < num.length;i++) {
			int sqr = num[i] * num[i];
			hm.put(num[i], sqr);
		}
		return hm;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int num[] = new int[n];
		sc.nextLine();
		for(int i = 0;i < n;i++) {
			System.out.println("Enter number");
			int s = sc.nextInt();
			
			num[i] = s;
		}
		L9E3 c = new L9E3();
		
		System.out.println(c.getSquares(num));;

	}

}
