package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(fun1(scn.nextInt(),scn.nextInt()));
		// TODO Auto-generated method stub

	}
	public static float fun1(int type,float v1){
		float a =0;
		if(type==1){
			a = (v1-170)* 0.6f+62;
		}else if(type==2){
			a = (v1-158)*0.5f+52;
		}
		return a;
	}
		// TODO Auto-generated method stub

	}


