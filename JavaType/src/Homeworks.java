import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0, sum1=0;
        int run = scanner.nextInt();
        for (int i = 1; i <= run; i++) {
            if (i % 2 == 0) {
                sum = sum + i;

            }
            sum1 += i;

        }
        System.out.println("Juft :" + sum);
        System.out.println("Toq :" + sum1);

    }
}