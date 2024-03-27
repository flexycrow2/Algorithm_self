import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        int result;
        for(int i = 1; i < 10; i++){
            result = dan * i;
            System.out.println(dan + " * " + i + " = " + result);
        }
    }
}
