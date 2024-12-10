import java.util.*;

class TwoSum{
    public static boolean twoSum(int[] arr,int target){
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return true;

            }else if(sum<target){
                left++;
            }else{
                right--;
            }
            
        }return  false;
    }
    public static void main(String[] args) {
        int[] arr={0,-1,2,-3,1};
        int target=3;
        if(twoSum(arr, target)){
            System.out.println("True");
        }else{
            System.err.println("False");
        }
    }
}