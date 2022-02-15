package red.part9;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

public class ClosureTest {

    @Test
    void test_closure(){
        Supplier<String> supplier = getStringSupplier();
        assertThat(supplier.get()).isEqualTo("HelloWorld");
    }

    private Supplier<String> getStringSupplier() {
        String hello = "Hello";
        Supplier<String> supplier = () -> {
            String world = "World";
            return hello + world;
        };
        return supplier;
    }
}
