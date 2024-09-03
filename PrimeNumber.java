/***
 * Question: Prime number
 * Owner name: Ayush Ray
 * Date: 3-9-2024
 */
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Constant.EnterNumber);
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid number.");
            sc.next();
        }
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(Constant.NotPrime);
            return;
        }
        boolean flag = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        if(flag == true) System.out.println(Constant.PrimeNum);
        else System.out.println(Constant.NotPrimeNumb);
    }
}
