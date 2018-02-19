/*
    Выводит простые числа от 2 до 100
*/
public class Primes {
    public static void main(String[] args) {
        int n = 100;

        for (int i = 3; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    //Проверяет является ли число n простым
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
 } 