public class Task2 {
    public static void print(int N) {
        for (int i=1; i<=N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int N){
        System.out.print("*");
        for (int i = 1; i<=(N-2); i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }

    public static void printRows(int N) {
        for (int i = 1; i<=(N-2); i++) {
            printSpaces(N);
        }
    }

    public static void printHollowSquare(int N){
        print(N);
        printRows(N);
        for (int i=1; i<=N; i++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        printHollowSquare(4);
        System.out.println();
    }
}
