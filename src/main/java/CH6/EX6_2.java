package CH6;

class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv(); // Tv인스턴스를 t1으로 생성
        Tv t2 = new Tv(); // Tv인스턴스를 t2으로 생성
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다");
    }
}