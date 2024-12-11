package SlidingWindow;

import java.util.Arrays;


//smallest subarray with sum greater than a given value.
public class SmallestSubArraySum {
    public static void main(String[] args) {
        int arr[]={1,4,45,6,0,19};
    int x=51;
    int start=-1,end=-1;
    int minLength=arr.length+1;
    int curr_sum=0,left=0,right=0;
    while(right<arr.length){
        while(curr_sum<=x && right<arr.length){
            curr_sum=curr_sum+arr[right];
            right++;
        }
        while(curr_sum>x&&left<arr.length){
            if(right-left<minLength){
                minLength=right-left;
                start=left;
                end=right;
            }
            curr_sum=curr_sum-arr[left];
            left++;
        }
    }
    System.err.println(Arrays.toString(Arrays.copyOfRange(arr, start, end)));
    System.out.println(minLength);
    }
    


}
