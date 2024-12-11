package SlidingWindow;
import java.util.*;

//TO Find maximum sum of all subarrays of size k



public class MaximumSum {
    public static void main(String[] args) {
        int arr[]={1,4,2,10,2,3,1,0,20};
        int k=4;
        int left=0,right=k-1;
        int maxSum=0;
        for(int i=0;i<k;i++){
            maxSum=maxSum+arr[i];
        }
        int sum=maxSum;
        while(right<arr.length-1){
            sum=sum-arr[left]+arr[right+1];
            left++;
            right++;
            maxSum=Math.max(sum, maxSum);
        }
        int maxSubArray[]=Arrays.copyOfRange(arr, left, left+k);
        System.out.println("Maximum SubArray="+Arrays.toString(maxSubArray));
        System.out.println("Max Sum="+maxSum);
    }
}
