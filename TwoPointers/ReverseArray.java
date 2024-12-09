import java.util.*;
public class ReverseArray{
    public static void main(String[] args){
        int[] arr={1,4,2,6,3};
        int left=0,right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}