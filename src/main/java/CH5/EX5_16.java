package CH5;

public class EX5_16 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수:" + args.length);
        for(int i=0; i<args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
/* 커맨드라인을 통해 입력받는 방법
 프로그램을 실행할 때 클래스 이름뒤에 공백문자로 구분하여 여러개의 문자열을 쓸 경우
 ex) c:\jdk1.8\work\ch5>java EX5_16 abc 1234 "hello Java World"
 총 'abc' '1234' '"hello Java World"' 3개의 매개변수를 전달할 수 있다
 args[0]은 abc args[1]은 1234이다
 */
