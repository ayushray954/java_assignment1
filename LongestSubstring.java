/***
 * Question: Longest substring.
 * Owner name: Ayush Ray
 * Date: 3-9-2024
 */
import java.util.Scanner;
public class LongestSubstring {
    public static int max(int a,int b) {
        if(a > b) return a;
        else return b;
    }
    public static void main(String[] args) {
        System.out.println(Constant.EnterString);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = lengthOfLongestSubstring(s);
        System.out.println(len);
    }

    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i = 0,j = 0;
        int mx = 0;
        int[] arr = new int[255];
        for(int k = 0; k < 255; k++) {
            arr[k] = 0;
        }

        while(j<n){
            int ascii = (int)s.charAt(j);
            if(arr[ascii] == 0){
                arr[ascii]++;
                mx = max(mx,j-i+1);
                j++;
            }
            else{
                while(s.charAt(i) != s.charAt(j)){
                    arr[(int)s.charAt(i)]--;
                    i++;
                }
                i++;
                arr[ascii]--;
            }
        }
        return mx;
    }
}

