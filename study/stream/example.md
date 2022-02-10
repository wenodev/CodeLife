# Stream으로 배열 객체이서 요소의 합 구하기

## Java

```java
public class ArrayObjectTest {

    private List<CustomProduct> customProducts = List.of(
            CustomProduct.builder().name("name1").price(1.0D).build(),
            CustomProduct.builder().name("name2").price(2.0D).build()
    );

    @Test
    void test_with_reduce(){
        // 실행
        Double totalPrice = customProducts.stream().map(CustomProduct::getPrice).reduce(0D, Double::sum);

        // 검증
        assertThat(totalPrice).isEqualTo(3D);
    }

    @Test
    void test_with_mapToDouble(){
        // 실행
        Double totalPrice = customProducts.stream().map(CustomProduct::getPrice).mapToDouble(price ->price).sum();

        // 검증
        assertThat(totalPrice).isEqualTo(3D);
    }
}

@Builder
@Data
class CustomProduct{
    private String name;
    private Double price;
}
```

## TypeScript

```typescript
const sum: number = productList
  .map((product: ProductType): number => product.totalPrice)
  .reduce((prev: number, curr: number): number => prev + curr, 0);
```
