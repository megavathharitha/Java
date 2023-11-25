//Time complexity --O(log n)
public class BinarySearch1 {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int x = 50;
        binarySearch(arr,x,0,arr.length-1);

    }
    static void binarySearch(int arr[],int x,int start,int end){
        if(arr.length==0){
            return;
        }
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==x){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<x){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
    }
}
