package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println(fun1(scn.nextInt(),scn.nextInt()));
		// TODO Auto-generated method stub

	}
	public static float fun1(float v1,int type){
		float a =0;
		if(type==1){
			a = (v1-32)* 5f/ 9f;
		}else if(type==2){
			a = v1*9f/5f+32;
		}
		return a;
	}

}
