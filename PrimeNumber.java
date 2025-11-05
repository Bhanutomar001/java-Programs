package com.example.corejava;

public class PrimeNumber {
  public static void main(String[] args) {
	  int a=8;
	  int b=1;
	  int c=a;
	  if(a%b==0 && a%c==0) {
		  System.out.println("prime number");
	  }else {
		  System.out.println("prime is not number");
	  }
  }
}
