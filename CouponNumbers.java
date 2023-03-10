package com.bridzelabz.logicalproblems;
import java.util.*;
public class CouponNumbers {
	public static int distinctCouponcollect(int num) {
		boolean[] isCollected=new boolean[num];
		int count =0;
		int distinctNumber=0;
		while(distinctNumber < num) {
			int couponNumber = (int) ((Math.random()*10) % num);
			count++;
			if(!isCollected[couponNumber])
			{
				distinctNumber++;
				isCollected[couponNumber]=true;
				System.out.println(" Distinct coupon number " + couponNumber);
			}
		}
		return count++;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int countValue = distinctCouponcollect(num);
		System.out.println("Total random numbers generated " + countValue);

	}

}
