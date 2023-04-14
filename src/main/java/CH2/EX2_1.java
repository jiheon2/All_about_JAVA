package CH2;

public class EX2_1 {
    public static void main(String[] args) {
        int year = 0; // 정수형 변수 year의 값이 0
        int age = 14; // 정수형 변수 age의 값이 14

        System.out.println(year); //println : print + \n
        System.out.println(age);

        year = age + 2000; // 위에 선언했던 정수형 변수 year에 변수 age에 2000을 더한 값을 저장하라는 코드
        age = age + 1; // age에 1을 더한 다음 age에 저장하라는 코드 >> age += 1 로도 표현 가능

        System.out.println(year);
        System.out.println(age);
    }
}
