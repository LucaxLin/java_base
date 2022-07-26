package com.lucas.utils;

public class myArrayTools {
  public static void main(String[] args) {
    String[] arr = { "1", "2", "3", "4" };
    System.out.println(printArray(arr));
  }

  public static String printArray(String[] arr) {
    String str = "[";
    for (int i = 0; i < arr.length; i++) {
      str += arr[i];
      if (i < arr.length - 1) {
        str += ", ";
      }
    }
    str += "]";
    return str;
  }

  public static String printArray(int[] arr) {
    String str = "[";
    for (int i = 0; i < arr.length; i++) {
      str += arr[i];
      if (i < arr.length - 1) {
        str += ", ";
      }
    }
    str += "]";
    return str;
  }

  public static int max(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int[] push(int[] arr, int num) {
    int[] newArr = new int[arr.length + 1];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    newArr[newArr.length - 1] = num;
    return newArr;
  }
  public static String[] push(String[] arr, String element) {
    String[] newArr = new String[arr.length + 1];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    newArr[newArr.length - 1] = element;
    return newArr;
  }

  public static boolean isExit(int[] arr, int num) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        return true;
      }
    }
    return false;    
  }

  public static boolean isExit(String[] arr, String str) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == str) {
        return true;
      }
    }
    return false;    
  }

  public static int indexOf(int[] arr, int num) {
    int res = -1;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == num){
        res = i;
        break;
      }
    }
    return res;
  }
  public static int indexOf(String[] arr, String str) {
    int res = -1;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == str){
        res = i;
        break;
      }
    }
    return res;
  }

  public static int[] subArray(int[] arr, int from, int to) {
    if(from<0 || to>arr.length || from>to){
      return new int[0];
    }
    int[] newArr = new int[to - from];
    for (int i = from; i < to; i++) {
      newArr[i-from] = arr[i];
    }
    return newArr;    
    
  }
}
