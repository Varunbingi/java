//Length of the Longest subString without any repeating character.
import java.util.*;
public class LengthOfLongestSubstring{
    public static void main(String[] args) {
        String s="abcabccc";
        int maxAns=Integer.MIN_VALUE;
        Set <Character> se=new HashSet<>();
        int l=0;
        for(int r=0;r<s.length();r++){

            if(se.contains(s.charAt(r))){
                while(l<r &&se.contains(s.charAt(r))){
                    se.remove(s.charAt(l));
                    l++;
                }   
            }
            se.add(s.charAt(r));
            maxAns=Math.max(maxAns, r-l+1);
           
        }
        System.out.println(maxAns);
    }
}


