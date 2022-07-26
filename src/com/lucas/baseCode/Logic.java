package com.lucas.baseCode;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Logic {
  public static void main(String[] args) {
    // if (condition) {
    // // do something
    // } else {
    // // do something else
    // }
    System.out.println("---------------- start running -------------");
    Scanner sc = new Scanner(System.in);
    int num = -1;
    while (num != 0) {
      System.out.println("enter a number");
      num = sc.nextInt();
      String end = String.valueOf(num);
      if (num == 0) {
        System.out.println("end");
      } else if (end.indexOf('7') != -1 || num % 7 == 0) {
        System.out.println("pass");
      } else {
        System.out.println("lose");
      }
    }
    sc.close();
  }
}
