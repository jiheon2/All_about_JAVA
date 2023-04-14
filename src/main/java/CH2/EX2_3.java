package CH2;

public class EX2_3 {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7); // 기본형 타입을 문자열로 변환할 때 ""사용
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + ""); // 기본 + 기본 + 문자열 > 14
        System.out.println("" + 7 + 7); // 문자열 + 문자열 + 문자열 > 77
    }
}
