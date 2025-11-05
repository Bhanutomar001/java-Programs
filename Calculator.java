package com.example.corejava;
import java.util.Scanner;

import java.util.Scanner;

public class Calculator {
    public static int add(int a,int b) {
      return a+b;
 }
  public static int sub(int a, int b) {
      return a-b;
  }
 public static int multiple(int a, int b) {
      return a*b;
 }
  public static int divide(int a, int b) {
  return a/b;
 }
 
 public static void main(String[] args) {
  System.out.println("Please frist Enter value of a:");
 Scanner sc=new Scanner(System.in);

int a=sc.nextInt();

System.out.println("Please Second Enter value of b:");
 int b=sc.nextInt();

System.out. println("Press button for performing operation");
System.out.println("1 : Addition");
System.out.println("2 : Subtraction");
System.out.println("3 : Multiplication");
System.out.println("4 : Divide");
System.out.println("Please Enter operation Number:");
 
 int number=sc.nextInt();
  switch(number){
     case 1:
         System.out.print("Addition of a and b"+ " = ");
         System.out.println(add(a,b));
         break;
     case 2:
         System.out.print("Substraction of a and b"+ " = ");
         System.out.println(sub(a,b));
         break;
     case 3:
         System.out.print("Multipulation of a and b"+ " = ");
         System.out.println(multiple(a,b));
         break;
     case 4:
         System.out.print("Division of a and b"+ " = ");
         System.out.println(divide(a,b));
         break;
     default:
     System.out.println("invalid number");
     sc.close();
  }

 }
}
