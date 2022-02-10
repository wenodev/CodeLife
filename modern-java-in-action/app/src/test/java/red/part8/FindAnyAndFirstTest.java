package red.part8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FindAnyAndFirstTest {
    @Test
    void test_findAnyAndFindFirst(){
        List<Integer> numbers = Arrays.asList(1,2,3);
        int anyResult1 = numbers.stream().filter(n -> n >= 0).findAny().orElse(0);
        int anyResult2 = numbers.stream().filter(n -> n >= 0).findAny().orElse(0);

        assertThat(anyResult1).isEqualTo(1);
        assertThat(anyResult2).isEqualTo(1);
    }
}
