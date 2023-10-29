import java.util.Scanner;

public class sizeyunsuan {
    public static void main(String[] args) {
        System.out.println("请输入两个数字");
        Scanner scanner= new Scanner(System.in);
        double a;
        a = new  Scanner(System.in).nextDouble();
        double b= new  Scanner(System.in).nextDouble();
        double c=a+b,d=a-b,e=a*b,f=a/b,g=a%b;
        System.out.println("求和="+c);
        System.out.println("做差="+d);
        System.out.println("相乘="+e);
        System.out.println("相除="+f);
        System.out.println("取余="+g);
    }
}
