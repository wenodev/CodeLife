package red;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class ConsumerTest {
    @Test
    void test_consumer(){
        Consumer<String> myConsumer = str -> System.out.println(str);
        myConsumer.accept("hello");
    }
}
