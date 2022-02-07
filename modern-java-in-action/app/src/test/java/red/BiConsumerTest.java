package red;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {
    @Test
    void test_bi_consumer(){
        BiConsumer<Integer, Double> myBiConsumer = (index, input) -> {
            System.out.println("myBiConsumer " + input + " at index " + index);
        };
        List<Double> inputs = Arrays.asList(1.1, 2.2, 3.3);
        process(inputs, myBiConsumer);
    }

    <T> void process(List<T> inputs, BiConsumer<Integer, T> processor){
        for (int i=0; i < inputs.size(); i++){
            processor.accept(i, inputs.get(i));
        }
    }

    @Test
    void test(){
        List<Integer> integers = Arrays.asList(1,2,3);
        process(integers);
    }

    <T> void process(List<T> inputs){
    }


}
