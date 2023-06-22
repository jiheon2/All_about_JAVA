package CH6;

public class EX6_13 {
    public static void main(String[] args) {
        EX6_13 r = new EX6_13(); //클래스를 객체화함

        int result = r.add(3,5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(4,5,result2);
        System.out.println(result2[0]);
    }

    // 오버로딩
    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[]result) {
        result[0] = a + b;
    }
}
