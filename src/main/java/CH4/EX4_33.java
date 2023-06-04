package CH4;

public class EX4_33 {
    public static void main(String[] args) {
        Loop1 : for(int i=2; i<=9; i++) { // for문에 Loop1이라는 이름을 붙임
                for(int j=1; j<=9; j++) {
                    if(j==5)
                        break Loop1; // 1번
//                        break; // 2번
//                        continue Loop1; // 3번
//                        continue; // 4번
                    System.out.println(i+"*"+j+"="+i*j);
            } // 4번 continue / for i의 끝
            System.out.println(); // 2번 break
        } // 3번 continue Loop1 / Loop1의 끝
        // 1번 break Loop1
    }
}
