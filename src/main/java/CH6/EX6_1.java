package CH6;

    class Tv {
        String color;
        boolean power;
        int channel;

        void power() {power=!power;} // TV on/off 기능
        void channelUp() {++channel;} // channel을 하나 올림(전위증가 먼저 ++함)
        void channelDown() {--channel;} // channel을 하나 내림
    }

    class TvTest {
        public static void main(String args[]) {
            Tv t; // Tv인스턴스(객체)를 참조하기 위한 변수 t 선언
            t = new Tv(); // Tv인스턴스(객체)를 생성
            t.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 선언
            t.channelDown(); // Tv인스턴스의 메서드 channelDown을 호출
            System.out.println("현재 채널은 " + t.channel + "입니다.");
        }
    }

