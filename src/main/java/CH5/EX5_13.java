package CH5;

public class EX5_13 {
    public static void main(String[] args) {
        char[] hex = {'C', 'A', 'F', 'E'}; // 16진수 배열 선언 및 초기화

        String[] binary = {"0000", "0001", "0010", "0011",
                           "0100", "0101", "0110", "0111",
                           "1000", "1001", "1010", "1011",
                           "1100", "1101", "1110", "1111"};
        // 2진수 배열 선언 및 초기화

        String result="";
        // 결과값을 저장하기 위한 result변수 선언

        for(int i=0; i<hex.length; i++) {
            if(hex[i] >= '0' && hex[i] <='9') {
                // 16진수 문자가 숫자인지를 확인함 0~9사이 이면
                result +=binary[hex[i]-'0'];
                // 해당문자를 숫자로 변환하여 2진수 배열에서 인덱스로 사용 / 2진수로 변환한 값을 문자열(result)에 추가함
                // -'0'을 해주어서 숫자를 그대로 가져와 2진수로 바꾸어 result에 저장
            } else {
                // 16진수 문자가 숫자가 아닐 경우
                result +=binary[hex[i]-'A'+10];
                // 문자의 값에서 'A'값을 빼준 뒤 10을 더함 / C-A=67-65=2 + 10 >> 12
            }
        }
        System.out.println("hex:" + new String(hex));
        // new String(hex)는 char배열을 문자열로 변환하는 방법
        // String클래스의 생성자를 이용
        // char배열의 각 문자를 합하여 문자열로 바꾼 뒤 반환
        System.out.println("binary:" + result);
    }
}
