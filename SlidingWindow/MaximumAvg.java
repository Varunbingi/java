package SlidingWindow;

public class MaximumAvg {
        public static void main(String[] args) {
            int[] nums={1,12,-5,-6,50,3};
            int k=4;
            int n=nums.length;
            int maxSum=0;
            int left=0,right=nums.length-1;
            for(int i=0;i<k;i++){
                 maxSum=maxSum+nums[i];
            }
            int sum=maxSum;
            for(int j=k;j<n;j++){
                sum=sum-nums[j-k];
                sum=sum+nums[j];
                maxSum=Math.max(sum,maxSum);
            }
            double result=(double)maxSum/k;
            System.out.println(result);
        }
    
}
