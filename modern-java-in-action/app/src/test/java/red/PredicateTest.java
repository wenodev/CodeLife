package red;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class PredicateTest {
    @Test
    void test_predicate(){
        Predicate<Integer> isPositive = x -> x > 0;
        assertThat(isPositive.test(10)).isTrue();
    }

    @Test
    void test_predicate_negate(){
        Predicate<Integer> isPositive = x -> x > 0;
        assertThat(isPositive.negate().test(10)).isFalse();
    }

    @Test
    void test_predicate_or(){
        Predicate<Integer> isPositive = x -> x > 0;
        assertThat(isPositive.or( x -> x == 0 ).test(10)).isTrue();
        assertThat(isPositive.or( x -> x == 0 ).test(0)).isTrue();
        assertThat(isPositive.or( x -> x == 0 ).test(-1)).isFalse();
    }

    @Test
    void test_predicate_and(){
        Predicate<Integer> isPositive = x -> x > 0;
        assertThat(isPositive.and( x -> x == 0 ).test(10)).isFalse();
        assertThat(isPositive.and( x -> x == 0 ).test(0)).isFalse();
        assertThat(isPositive.and( x -> x == 0 ).test(-1)).isFalse();
    }

}
