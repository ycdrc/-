public class zifujiequ {
    public static void main(String[] args) {

        String str1 = "Hello, World!";
        String str2 = "hello, world!";

        // 截取str1的子串（不包括空格）
        String subStr1 = str1.substring(0, 5);
        // 截取str2的子串（不包括空格）
        String subStr2 = str2.substring(0, 5);

        // 判断截取后的两个子串是否相同（不区分大小写）
        if (subStr1.equalsIgnoreCase(subStr2)) {
            System.out.println("两个字串相同");
        } else {
            System.out.println("两个字串并不相同");
        }
    }
}
