import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
    System.out.print("请输入您的身高(单位为m)：");
    double height;
    height = new  Scanner(System.in).nextDouble();
    System.out.print("请输入您的体重(单位为kg)：");
    double weight = new  Scanner(System.in).nextDouble();
    getBMI(height, weight);
}
    public static void getBMI(double h,  double w) {
        double bmi = w / (h * h);
        String r = " ";
        if (bmi < 18.5) {
            r = "过轻";
        } else if (bmi <= 23.99) {
            r = "正常";
        } else if (bmi <= 28) {
            r = "过重";
        } else if (bmi <= 32) {
            r = "肥胖";
        } else {
            r = "非常肥胖";
        }

        System.out.println("您的BMI指数：" + bmi);
        System.out.println("您的体重属于：" + r);

    }

}