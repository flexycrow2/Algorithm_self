import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int realH = H;
        int realM = M - 45;
        if(realM < 0){
            realM = realM + 60;
            realH = H - 1;
        }
        if(realH < 0)
            realH = 23;
        System.out.println(realH + " " + realM);
    }
}