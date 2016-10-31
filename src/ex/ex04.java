package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String n = scn.nextLine();
		String arr[] =n.split(" ");		
		square(arr);
		// TODO Auto-generated method stub

	}
	public static void square(String arr[]){
		int v=0;
		for(int i =0;i<arr.length;i++){
			v =Integer.parseInt(arr[i]);
			System.out.print((int)Math.pow(v,2)+" ");
		}
		
	}

}
