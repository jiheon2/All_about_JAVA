package CH3;

public class EX3_23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b\n", "abc"=="abc");
        System.out.printf("str1==\"abc\" ? %b\n", str1=="abc");
        System.out.printf("str2==\"abc\" ? %b\n", str2=="abc");
        System.out.printf("str1.equals(\"abc\") ? %b\n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b\n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b\n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b\n", str2.equalsIgnoreCase("ABC"));
        // %b 는 boolean 함수의 결과로 출력하는 것
        // equalsIgnoreCase() 메서드는 대소문자를 구별하지 않고 비교하는 기능
    }
}
