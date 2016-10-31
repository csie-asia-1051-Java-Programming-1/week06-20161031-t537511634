package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int m=scn.nextInt(),n=scn.nextInt();
		C(m,n);
		
		// TODO Auto-generated method stub

	}
	public static void C(int m,int n){
		System.out.println(P(m)/(P(n)*P(m-n)));
	}
    public static int P(int v){
    	int sum=1;
		for(int i=1;i<=v;i ++){
			sum*=i;
		}
		return sum;
	}

}
