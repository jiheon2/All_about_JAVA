package CH6;

class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열

        for(int i=0; i<tvArr.length; i++) {
            tvArr[i] = new Tv(); // Tv객체를 생성
            tvArr[i].channel = i+10; // tvArr[i]의 channel에 i+10을 저장
        }

        for(int i=0; i<tvArr.length; i++) {
            tvArr[i].channelUp(); // tvArr[i]의 channelup 메서드를 호출 / 채널이 1증가
            System.out.printf("tvArr[%d].channel=%d\n", i, tvArr[i].channel);
        }
    }
}
