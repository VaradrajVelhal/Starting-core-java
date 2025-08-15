//WAP to find max1 and max 2 element from array.
public class Array2 {
    public static void main(String[] args) {
         int arr[] = {2,-3,4,1,6,-5,3,9,2};
        int max1 = arr[0];
        int max2 = arr[0];
        int i=1;
       while(i<arr.length){
        if(arr[i]>=max1){
            max2=max1;
            max1=arr[i];
        }else if(arr[i]>max2){
            max2=arr[i];
        }
        i++;
       }
        System.out.println("Max 1 is : "+max1);
        System.out.println("Max 2 is : "+max2);
        // Output :-
        // Max 1 is : 9
        // Max 2 is : 6

    }
}
