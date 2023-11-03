public class zhuijia {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("text: ");

        // 使用循环追加1到10的数字
        for (int i = 1; i <= 10; i++) {
            str.append(i).append(" ");
        }

        System.out.println(str.toString());
    }
}
