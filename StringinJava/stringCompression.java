package StringinJava;
import java.util.*;
public class stringCompression {
    public static void main(String[] args) {
        String str = "aaabbbbccdddee";
        String ans = ""+str.charAt(0);
        int count = 1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count++;
            }else{
                ans+=count;
                count = 1;
                ans+=curr;

            }
        }
        if(count>1)ans+=count;
        System.out.println(ans);
    }
}
