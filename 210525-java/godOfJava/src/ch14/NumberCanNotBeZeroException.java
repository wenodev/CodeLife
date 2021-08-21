package ch14;

public class NumberCanNotBeZeroException extends RuntimeException{
    public NumberCanNotBeZeroException(String message){
        super(message);
    }
}
