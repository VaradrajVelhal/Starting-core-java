//When number are given from 1 to n use cyclic sort.

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 4};
       cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int arr[]){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }


    static void swap(int arr[],int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
