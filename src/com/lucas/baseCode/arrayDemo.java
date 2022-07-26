package com.lucas.baseCode;

import com.lucas.utils.myArrayTools;

public class arrayDemo {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    System.out.println(myArrayTools.printArray(arr));
    System.out.println(myArrayTools.max(arr));
    arr = myArrayTools.push(arr, 5);
    System.out.println(myArrayTools.printArray(arr));
    System.out.println(myArrayTools.isExit(arr, 100));
    System.out.println(myArrayTools.indexOf(arr, 3));
    System.out.println(myArrayTools.indexOf(arr, 100));
    System.out.println(myArrayTools.printArray(myArrayTools.subArray(arr, 1, 100)));
  }
}
