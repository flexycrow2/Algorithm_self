
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        /*같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.*/

        if(a == b && b == c)
            System.out.println(10000 + a * 1000);

        if (a == b && b != c)
            System.out.println(1000 + a * 100);
        if (a == c && b != c)
            System.out.println(1000 + a * 100);
        if (b == c && a != c)
            System.out.println(1000 + b * 100);

        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;

        if (a != b && b != c && a != c)
            System.out.println(max * 100);
    }
}
