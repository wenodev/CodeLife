package ch16.homework;

public class InputBox {

    KeyEventListener listener;
    public static final int KEY_DOWN = 2;
    public static final int KEY_UP = 4;

    public InputBox(){}

    public void setKeyListener(KeyEventListener listener){
        this.listener = listener;
    }

    public void listenerCalled(int eventType){
        if (eventType == KEY_DOWN){
            listener.onKEyDown();
        }else if (eventType == KEY_UP){
            listener.onKEyUp();
        }
    }
}
