package red.part6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
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

    // 클래스 옮기기

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

    @Test
    void test_findAnyAndFindFirst(){
        List<Integer> numbers = Arrays.asList(1,2,3);
        int anyResult1 = numbers.stream().filter(n -> n >= 0).findAny().orElse(0);
        int anyResult2 = numbers.stream().filter(n -> n >= 0).findAny().orElse(0);

        assertThat(anyResult1).isEqualTo(1);
        assertThat(anyResult2).isEqualTo(1);
    }

}
