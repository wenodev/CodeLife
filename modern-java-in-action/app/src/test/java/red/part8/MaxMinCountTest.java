package red.part8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxMinCountTest {
    @Test
    void test_min(){
        List<Integer> numbers = Arrays.asList(1,2,3);
        Integer result =  numbers.stream().max(Integer::compareTo).orElse(0);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void test_max(){
        List<Integer> numbers = Arrays.asList(1,2,3);
        Integer result =  numbers.stream().min(Integer::compareTo).orElse(0);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test_count(){
        List<Integer> numbers = Arrays.asList(1,2,3);
        Long result =  numbers.stream().filter(n -> n < 3).count();
        assertThat(result).isEqualTo(2L);
    }
}
