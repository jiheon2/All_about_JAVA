package CH6;

public class EX6_7 {
    public static void main(String[] args) {
        firstMethod(); // static메서드는 객체생성없이 호출이 가능함!
    }

    static void firstMethod() {
        System.out.println("firstMethod()이 시작되었음.");
        secondMethod();
        System.out.println("firstMethos()이 끝났음.");
    }

    static void secondMethod() {
        System.out.println("secondMethod()이 시작되었음.");
        System.out.println("secondMethod()이 끝났음.");
    }
}
