package red.part6;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class SorTest {
    @Test
    void test_sort_number(){
        List<Integer> numbers = Stream.of(1, -3, 4, 10, -2)
                .sorted()
                .collect(Collectors.toList());
        assertThat(numbers).containsExactly(-3, -2, 1, 4, 10);
    }

    @Test
    void test_sort_string(){
        List<String> stringList  = Stream.of("james", "sonny", "anny")
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        assertThat(stringList).containsExactly("anny", "james", "sonny");
    }

    @Test
    void test_limit(){
        List<String> result = List.of("a", "b", "c").stream().limit(2).collect(Collectors.toList());
        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void test_skip(){
        List<String> result = List.of("a", "b", "c").stream().skip(2).collect(Collectors.toList());
        assertThat(result.size()).isEqualTo(1);
    }

}
