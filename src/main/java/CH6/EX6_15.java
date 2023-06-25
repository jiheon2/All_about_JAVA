package CH6;

public class EX6_15 {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int n) {
        int result=0;

        if(n==1)
            result = 1;
        else
            result = n * factorial(n-1); // 메서드 자신을 한번 더 호출함

        return result;
    }
}
