package red.part6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {
    @Test
    void test_map(){
        List<Integer> numberList = Arrays.asList(3, 6, -4)
                .stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

        assertThat(numberList).contains(6, 12, -8);
    }
}
