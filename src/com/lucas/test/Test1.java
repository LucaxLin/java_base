package com.lucas.test;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    System.out.println("---------------- start running -------------");
    Scanner sc = new Scanner(System.in);
    System.out.println("How much in your pocket? ");
    int money = sc.nextInt();

    if(money>100){
      System.out.println("let's go shopping");
    } else {
      System.out.println("let's go home");
    }
  }

}
