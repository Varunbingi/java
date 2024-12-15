public class LongestOnes {
  public static void main(String[] args) {
    int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
    int k = 2;
    int left = 0, n = nums.length, right;

    for (right = 0; right < n; right++) {
        if (nums[right] == 0)
            k -= 1;
            
        if (k < 0) {
            if (nums[left] == 0)
                k += 1;
                
            left += 1;
        }
    }

    System.out.println(right - left); 
    }
    
}