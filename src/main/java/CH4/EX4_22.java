package CH4;

public class EX4_22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i=0; i<arr.length; i++)
            System.out.printf("%d", arr[i]);
        System.out.println();

        for(int tmp : arr) {
            System.out.printf("%d", tmp);
            sum += tmp;
        }
        // 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용 가능

        System.out.println();
        System.out.println("sum="+sum);
    }
}
