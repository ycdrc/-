import java.util.Scanner;

public class jiou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        long a;
        a = new  Scanner(System.in).nextLong();
        if (a%2==0){System.out.println("a为偶数");}
                else{System.out.println("a为奇数");}
    }
}
