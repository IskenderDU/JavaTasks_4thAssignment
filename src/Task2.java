public class Task2 {
    public static void print(int N, char c) {
        for (int i=1; i<=N; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void printSpaces(int N, char c1){
        System.out.print(c1);
        for (int i = 1; i<=(N-2); i++) {
            System.out.print(" ");
        }
        System.out.print(c1);
        System.out.println();
    }

    public static void printRows(int N, char c2) {
        for (int i = 1; i<=(N-2); i++) {
            printSpaces(N, c2);
        }
    }

    public static void printHollowSquare(int N, char c){
        print(N, c);
        printRows(N, c);
        for (int i=1; i<=N; i++) {
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        printHollowSquare(8, '-');
    }
}
