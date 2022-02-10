package red.part8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AllAnyMatchTest {
    @Test
    void test_allMatch(){
        List<Integer> numbers = Arrays.asList(1,2,3);
        boolean result = numbers.stream().allMatch(n -> n >= 0);
        assertThat(result).isTrue();
    }

    @Test
    void test_anyMatch(){
        List<Integer> numbers = Arrays.asList(1,2,3);
        boolean result = numbers.stream().anyMatch(n -> n >= 3);
        assertThat(result).isTrue();
    }
}
