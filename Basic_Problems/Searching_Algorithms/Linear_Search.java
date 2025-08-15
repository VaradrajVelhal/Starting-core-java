//WAP to search for a element using linear search.

import java.util.Scanner;

public class Linear_Search {
  //Linear search is used to search for a element line by line....
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {1, 6, 8, 10, 15, 20, 35, 40, 80, 90, 112, 113};
    int n = arr.length;
    boolean flag =false;
    System.out.println("Enter the element that you want to search :- ");
    int num=sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (arr[i]==num) {
        System.out.println("Element found on index :- "+i);
        flag=true;
        break;
      }
    }
    if (!flag) {
      System.out.println("Element is not present in array....");
    }
  }  
}
