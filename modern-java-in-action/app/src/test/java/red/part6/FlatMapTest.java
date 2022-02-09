package red.part6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class FlatMapTest {
    @Test
    void test_flat_map(){
        String[][] strArray = new String[][]{
                {"a1, a2"},
                {"b1, b2"},
                {"c1, c2"},
        };
       List<String> stringList = Arrays.stream(strArray)
                .flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());

      assertThat(stringList).containsExactly("a1, a2", "b1, b2", "c1, c2");
    }
}
