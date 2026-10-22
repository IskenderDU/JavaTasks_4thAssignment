public class Task5 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i<= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        if (isPrime(13)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}