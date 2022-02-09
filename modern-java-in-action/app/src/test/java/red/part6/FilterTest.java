package red.part6;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class FilterTest {
    @Test
    void test_filter(){
        List<Integer> positiveList = Stream.of(1, -3, 4, 10, -2)
                .filter(n -> n > 0)
                .collect(Collectors.toList());

        assertThat(positiveList).contains(1,4,10);
    }
}
