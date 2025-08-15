//WAP to count the frequency of each number.

class Array3{
    public static void main(String args[]){
        int arr[]={2,5,6,5,1,2,3,2,5,6,2};
        int freq[]=new int[100];
        for(int i : arr){
            freq[i]++;
        }
        System.out.println(freq[6 ]);
    }
}