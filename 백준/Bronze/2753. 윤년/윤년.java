import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Yyear = sc.nextInt();

        if(Yyear % 4 == 0 && Yyear % 100 != 0)
            System.out.println("1");
        else if(Yyear % 400 ==0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
