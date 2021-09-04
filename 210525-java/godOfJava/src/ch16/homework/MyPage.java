package ch16.homework;

public class MyPage {

    InputBox input;

    public static void main(String[] args) {
        MyPage page = new MyPage();
        page.setUI();
        page.pressKey();
    }
    void setUI(){
        input = new InputBox();
        KeyEventListener listener = new KeyEventListener() {
            @Override
            public void onKEyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKEyUp() {
                System.out.println("Key Up");
            }
        };
        input.setKeyListener(listener);
    }

    void pressKey(){
        input.listenerCalled(2);
        input.listenerCalled(4);
    }
}
