//A program for linear search
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {33,56,7,8,9};
        int n = arr.length;
        int target = 56;
        for(int i = 0;i<n;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }
    }
}
