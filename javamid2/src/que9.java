import java.util.Scanner;

public class que9 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how much fibonacci number you want");
        int n = sc.nextInt();
        System.out.print(a + " " + b);

        for (int i = 0; i < n - 2; i++) {
            temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
            temp = a;
        }

    }
}
