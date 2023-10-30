import java.util.Scanner;

public class renyilingxing {
    public static void main(String[] args) {
        System.out.println("请输入1个数字");
        Scanner scanner = new Scanner(System.in);
        int a;
        a = new Scanner(System.in).nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a -i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a - 1; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
