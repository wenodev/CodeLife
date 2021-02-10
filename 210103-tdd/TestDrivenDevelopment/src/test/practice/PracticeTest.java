package test.practice;

import main.practice.Practice;
import main.practice.PracticeAbs;
import org.junit.jupiter.api.Test;

class PracticeTest {


    /*
    1. Abstract 클래스에서 일반 메소드를 작성한다는 것은 미리구현을 한다는 의미이다.
    2. Abstract 메소드를 작성시 구현은 자식 클래스에게 구현을 하라는 의미이다.
     */
    @Test
    void test(){
        PracticeAbs practice = new Practice();
        practice.printLog();
        practice.hello();
    }
}