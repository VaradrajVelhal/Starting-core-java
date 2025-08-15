//Find the ceiling of the target number.
//Ceiling = Smallest element in array greater then or equal to target.
public class Q1 {
    public static void main(String[] args) {
        int arr[]={2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(search(arr, target));
       
    }    
    static int search(int arr[],int target){
        int s = 0;
        int e = arr.length -1;
        while (s <= e) {
            int mid = s + (e - s)/2;
            if (target == arr[mid]) {
                return mid;
            }else if(target > arr[mid]) {
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return arr[s];
    }
}
