import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,3,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int maxIndex = max(arr, 0, last);
            swap(arr, maxIndex, last);
        } 
    }

    static int max(int arr[], int start, int last){
        int maxIndex = start;
        for (int i = start; i <= last; i++) {
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
