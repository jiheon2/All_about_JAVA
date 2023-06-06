package CH5;

public class EX5_14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for(int i=0; i<src.length(); i++) {
            char ch = src.charAt(i);
            // charAt 메서드 : i번째에 있는 문자를 반환하는 메서드
            System.out.println("src.charAt(" + i + "):" + ch);
        }
        char[] chArr = src.toCharArray();
        // toCharArray 메서드 : 문자열을 문자배열(char[])로 변환해서 반환하는 메서드
        System.out.println(chArr);
    }
}
