package CH5;

public class EX5_12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for(int i=0; i<names.length; i++) {
            System.out.println("names[" + i + "]:" + names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp:"+tmp);
        names[0] = "Yu";

        for(String str : names) { // names를 순차적으로 String str에 할당하는 for문(향상된 for문)
            System.out.println(str);
        }
    }
}
