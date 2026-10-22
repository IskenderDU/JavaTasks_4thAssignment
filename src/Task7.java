public class Task7 {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial = " + result);
        return result;
    }

    public static void main(String[] args) {
        factorial(5);
    }
}