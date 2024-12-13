//Maximum pair you can obtain from cards

public class MaximumPoints{
    public static void main(String[] args){
        int[] arr={6,2,3,4,7,2,1,7,1};
        int k=4;
        int lsum=0,rsum=0;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<k;i++){
            lsum=lsum+arr[i];
        }
        max=lsum;
        for(int j=0;j<k;j++){
            lsum=lsum-arr[k-1-j];
            rsum=rsum+arr[n-1-j];
            int currSum=lsum+rsum;
            max=Math.max(max,currSum);
        }
        System.out.println("Max="+max);

    }
}