package red.part6;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class DistinctTest {
    @Test
    void test_distinct(){
        List<Integer> numbers = Stream.of(1, 3, 2, 4, 3, 4)
                .distinct()
                .collect(Collectors.toList());

        assertThat(numbers).containsExactly(1, 3, 2, 4);
    }
}
