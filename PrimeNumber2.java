import java.util.*;

public class PrimeNumber2 {
    static void checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime Number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a Prime Number");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(n + " is a prime Number");
            }
        }

        }
        public static void main(String args[]){
        checkPrime(1);
        checkPrime(4);
        checkPrime(76);
        checkPrime(17);
        }

    }


