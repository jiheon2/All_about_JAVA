package CH5;

public class EX5_4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);
        // arraycopy 메소드 : 지정된 범위의 값들을 복사함(배열의 형태)
        // arraycopy(배열명(복사할), 위치, 배열명(복사될), 위치, 길이)

        System.arraycopy(abc, 0, num, 0, abc.length);
        // abc배열의 0번쨰값부터 복사해서 num배열에 0번쨰 값부터 넣는데, abc의 길이만큼 복사해서 넣음
        System.out.println(num);

        System.arraycopy(abc, 0, num, 6, 3);
        // abc배열의 0번째 값을 num배열에 6번째부터 복사해서 3개를 출력하겠음
        System.out.println(num);
    }
}
