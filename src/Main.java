import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        if (a >= 0)
            System.out.println(a);
        if (a <= 0)
            System.out.println(-a);
    }
}