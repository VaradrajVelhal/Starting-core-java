// WAP to find max element in an array.
public class Array1 {
    public static void main(String[] args) {
        int arr[]={2,3,6,8,4,1,7};
        int largest =Integer.MIN_VALUE;
       
        for(int i =0;i<arr.length;i++){
            if (arr[i]>largest) {
                largest=arr[i];
            }
        }
        System.out.println("The largest element is : "+largest);
    
        //We can use same logic to find minimum element 

         int smallest=Integer.MAX_VALUE;
         
        for(int i =0;i<arr.length;i++){
            if (arr[i]<smallest) {
                smallest=arr[i];
            }
        }
        System.out.println("The smallest element is : "+smallest);

        // Output : -
        // The largest element is : 8
        // The smallest element is : 1
    }
}
