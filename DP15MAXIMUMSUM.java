import java.util.*;

public class DP15MAXIMUMSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int aCount = 0; 
        int abCount = 0;
        int abcCount = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a') {
              aCount=2*aCount +1;

            } else if(ch == 'b') {
                abCount =2 *abCount +aCount; // Each 'b' can combine with 'a's seen so far to form 'ab'.
            } else if(ch == 'c') {
                abcCount =2*abcCount +abCount; // Each 'c' can combine with 'ab's seen so far to form 'abc'.
            }
        }
        System.out.println(abcCount);
    }
}

