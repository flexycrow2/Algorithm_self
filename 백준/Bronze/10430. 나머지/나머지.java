import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A, B, C;
        A = in.nextInt();       //5
        B = in.nextInt();       //8
        C = in.nextInt();       //4

        System.out.println((A+B)%C);        //1
        System.out.println(((A%C)+(B%C))%C);        //1+0   4   1
        System.out.println((A*B)%C);        //0
        System.out.println(((A%C)*(B%C))%C);//1*0       0
    }
}