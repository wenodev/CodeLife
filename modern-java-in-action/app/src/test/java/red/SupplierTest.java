package red;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

public class SupplierTest {
    @Test
    void test_supplier(){
        Supplier<String> mySupplier = () -> "hello supplier";
        assertThat(mySupplier.get()).isEqualTo("hello supplier");
    }

    @Test
    void test_supplier_with_method(){
        Supplier<String> mySupplier = () -> "hello supplier";
        process(mySupplier, 5);
    }

    void process(Supplier<String> mySupplier, int count){
        for (int i=0; i<count; i++){
            System.out.println(mySupplier.get() + " " + i);
        }
    }
}
