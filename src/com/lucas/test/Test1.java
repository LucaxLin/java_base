package com.lucas.test;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    System.out.println("---------------- start running ----------------");
    Scanner sc = new Scanner(System.in);
    /* System.out.println("How much in your pocket? ");
    int money = sc.nextInt();
    if(money>100){
    System.out.println("let's go shopping");
    } else {
    System.out.println("let's go home");
    } */
    System.out.println("enter a number which is greater than 5 and less than 10");
    int num = sc.nextInt();
    switch (num) {
      case 5:
        System.out.println("num is 1");
        break;
    
      default:
      System.out.println("entered invalid");
        break;
    }
    sc.close();
  }

}
