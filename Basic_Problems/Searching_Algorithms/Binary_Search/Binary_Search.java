package Binary_Search;
//WAP to search for a element in array using binary search....

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        //When we have sorted array ,in binary search we search from middle of array, if the middle element
        //is greater then search element we search on left side from middle element, if the middle element smaller 
        //we search on right side.
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the element you want to search :- ");
        int num = sc.nextInt();
        int arr[] = {1, 6, 8, 10, 15, 20, 35, 40, 80, 90, 112, 113};
        int l = 0,r=arr.length - 1;
        boolean flag = false;
        while (l <= r) {
            int mid= (l + r)/2;
            if (arr[mid] == num) {
                System.out.println("Element found at index :- " + mid);
                flag =true;
                break;
            }else if(num < arr[mid]){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        if (!flag) {
            System.out.println("Element not present......");
        }
    }
}
