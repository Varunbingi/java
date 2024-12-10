//Find the closest pair in two sorted arrays

import java.util.Arrays;

public class ClosestPair {
    public static void main(String[] args) {
        int[] arr1={1,4,5,7};
        int[] arr2={10,20,30,40,50};
        int x=23;
        int difference=Integer.MAX_VALUE;
        int left=0,right=arr2.length-1;
        int result[]=new int[2];
        while(left<arr1.length && right>=0 ){
            int sum=arr1[left]+arr2[right];
            int currentDifference=Math.abs(x-sum);
            if(currentDifference<difference){
                difference=Math.abs(x-sum);
                result[0]=arr1[left];
                result[1]=arr2[right];

            }
            if(sum>x){
                right--;
            }else{
                left++;
            }
            
        }
        System.out.println(Arrays.toString(result));
    }
}
