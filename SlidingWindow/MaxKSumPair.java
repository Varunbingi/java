//Maxi Number of k-sum pair
import java.util.Arrays;

public class MaxKSumPair {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int k=5;
        int count=0;
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
                count++;
                right--;
                left++;
            }else if(sum>k){
                right--;
            }else{
                left++;
            }
        }
        System.out.println(count);
    }
}
