import java.util.ArrayList;
import java.util.List;

public class Function {

  public static void main(String[] args) {
    int result =  factorial(4);
    System.out.println(result);

    System.out.println("No is prime"+isPrime(7));
    System.out.println("Prime numbers up to 30: " + listPrimeNo(30));
  }

   static int factorial(int n){
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
  
    static List<Integer> listPrimeNo(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
    



