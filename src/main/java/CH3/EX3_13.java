package CH3;

public class EX3_13 {
    public static void main(String[] args) {
            char c1 = 'a';
//            char c2 = c1 + 1; // 컴파일에러발생 형변환(char)을 사용해야 에러 안남 bcz 리터럴 연산이기 때문
            char c2 = 'a' + 1;

            System.out.println(c2);
    }
}
