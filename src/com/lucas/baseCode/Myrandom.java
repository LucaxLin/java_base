package com.lucas.baseCode;

import java.util.Random;

public class Myrandom {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum =(int) (r.nextFloat() * 100);
    // int num =(int) 1.3;
    System.out.println(randomNum);
  }
}
