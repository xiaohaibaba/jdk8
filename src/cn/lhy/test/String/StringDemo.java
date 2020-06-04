package cn.lhy.test.String;


public class StringDemo {

    public static void main(String[] args) {
        String a = null;
        String b = null;
        System.out.println(new String().equals(b));
    }

    /**
     * 字符串转换
     */
    private static void stringChange() {
        String str  ="nihao 你好 喬亂";
        byte[] bytes = str.getBytes();

        String result = new String(bytes);
        System.out.println(result);
    }
}
