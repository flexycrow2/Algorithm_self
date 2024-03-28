import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A, B;
        int result;
        for(int i = 1; i < T+1; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            result = A + B;
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + result);
        }
    }
}
