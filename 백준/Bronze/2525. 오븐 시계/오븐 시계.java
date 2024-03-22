import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentH = sc.nextInt();
        int currentM = sc.nextInt();

        int cookM = sc. nextInt();

        int tempM = currentM + cookM;
        int realM = tempM % 60;
        int tempH = tempM / 60;

        int realH = currentH + tempH;

        if(realH > 24)
            realH -= 24;
        else if(realH == 24)
            realH = 0;

        System.out.println(realH + " " + realM);
    }
}
