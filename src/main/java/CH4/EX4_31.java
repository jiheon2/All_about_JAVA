package CH4;

public class EX4_31 {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++) {
            if(i%3==0)
                continue; // cotinue문이 수행되면
            System.out.println(i);
        } //이곳으로 이동 / 출력문이 수행되지 않음
     }
}
