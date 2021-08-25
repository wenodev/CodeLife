package ch15;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String address[] = new String[]{
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동",
        };
        sample.checkAddress(address);
    }

    private void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";
        for (String address : addresses){
            if (address.startsWith(startText)){
                startCount++;
            }
            if (address.endsWith(endText)){
                endCount++;
            }
        }

        System.out.println(startCount);
        System.out.println(endCount);
    }
}
