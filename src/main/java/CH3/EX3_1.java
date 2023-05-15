package CH3;

public class EX3_1 {
    public static void main(String[] args) {
        int i = 5;
        i++; //후위(postfix) i=i+1과 같음
        System.out.println(i);

        i = 5;
        ++i; //전위(prefix)
        System.out.println(i);
    }
}
