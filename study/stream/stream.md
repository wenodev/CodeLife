# Java Study : Stream

## 목차

1. 생성하기
2. 가공하기
3. 결과만들기
4. 예제

## 1. 생성하는 방법

1. stream()

- Collection
- Array

```java
List<String> list = List.of("a", "b");
Stream<String> stream = list.stream(); // Collection

String[] arr = new String[]{"a", "b"};
Stream<String> arrStream = Arrays.stream(arr); // Array
```

2. parallelStream()

```java
List<String> list = List.of("a", "b");
Stream<String> stream = list.parallelStream();
```

3. XXXStream

```java
IntStream intStream = IntStream.range(0, 2); // 0, 1
IntStream closedIntStream = IntStream.rangeClosed(0, 2); // 0, 1, 2
LongStream longStream = LongStream.range(0, 2); // 0, 1
DoubleStream doubleStream = DoubleStream.of(0, 2); // 0.0, 2.0
```

4. builder()

```java
Stream<String> stream = Stream.<String>builder()
    .add("a").add("b").build();
```

5. iterate()

```java
Stream<Integer> stream = Stream.iterate(0, x -> x + 1).limit(2); // 0, 1
```

6. generate()

```java
Stream<Integer> stream = Stream.generate(() -> 1).limit(2); // 1, 1
```

## 2. 가공하기

1. Filter
   내부가 Predicate로 되어있기 때문에 내부적으로 boolean 값에 따라처리한다.

```java
    Stream<T> filter(Predicate<? super T> predicate);
```

조건이 true인 데이터만 남게된다.
예제)

```java
    @Test
    void test_filter(){
        List<Integer> positiveList = Stream.of(1, -3, 4, 10, -2)
                .filter(n -> n > 0)
                .collect(Collectors.toList());

        assertThat(positiveList).contains(1,4,10);
    }
```

2. Map

매개변수로 Function 인터페이스를 받기 때문에 apply 라는 메소드에 할당한다.

```java
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
```

<br/>
apply 메소드는 원하는 값을 받고 원하는 값을 리턴할 수 있다.

```java
 R apply(T t);
```

예제)

```java
    @Test
    void test(){
        List<Integer> numberList = Arrays.asList(3, 6, -4)
                .stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

        assertThat(numberList).contains(6, 12, -8);
    }
```

3. sorted

정렬할 때 사용한다.
예제)

```java
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
```

4. distinct

중복값을 제거할 때 사용합니다.

```java
    @Test
    void test_distinct(){
        List<Integer> numbers = Stream.of(1, 3, 2, 4, 3, 4)
                .distinct()
                .collect(Collectors.toList());

        assertThat(numbers).containsExactly(1, 3, 2, 4);
    }
```

5. flat

- Map + Flatten 구조이다.
- 중첩된 Stream을 해소할 떄 사용한다.
  예제)

```java
    @Test
    void test_flat_map(){
        String[][] strArray = new String[][]{
                {"a1, a2"},
                {"b1, b2"},
                {"c1, c2"},
        };
       List<String> stringList = Arrays.stream(strArray)
                .flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());

        System.out.println(stringList);

      assertThat(stringList).containsExactly("a1, a2", "b1, b2", "c1, c2");
    }
```

5. peek  
   연산없이 중간 결과를 확인할 떄 사용합니다.  
   공식문서에 아래와 같이 나와있습니다.
   > In cases where the stream implementation is able to optimize away the production of some or all the elements (such as with short-circuiting operations like findFirst, or in the example described in count), the action will not be invoked for those elements.

```java
Stream<T> peek(Consumer<? super T> action);
```

6. limit  
   개수를 제한할 떄 사용합니다.

```java
    @Test
    void test_limit(){
        List<String> result = List.of("a", "b", "c").stream().limit(2).collect(Collectors.toList());
        assertThat(result.size()).isEqualTo(2);
    }
```

7. skip  
   요소를 무시하고 지나갈 때 사용합니다.

```java
    @Test
    void test_skip(){
        List<String> result = List.of("a", "b", "c").stream().skip(2).collect(Collectors.toList());
        assertThat(result.size()).isEqualTo(1);
    }
```

## 3. 결과만들기

1. max, min, count
   max는 최대값, min은 최소값, count는 요소의 갯수를 리턴한다. (count의 리턴값은 long 타입니다.)

```java
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
```

2. allMatch, anyMatch
   allMatch는 and조건이 '참', anyMatch는 or조건인 '참' 일때 true를 리턴한다.

```java
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
```

3. findAny, findFirst
   순차적으로 진행될 때는 두 메소드는 첫번쨰 요소를 리턴한다. 하지만 병렬처리(parallel)를 한다면 findAny는 실행할 때 마다 다른값을 리턴한다.

```java
    @Test
    void test_findAnyAndFindFirst(){
        List<Integer> numbers = Arrays.asList(1,2,3);
        int anyResult1 = numbers.stream().filter(n -> n >= 0).findAny().orElse(0);
        int anyResult2 = numbers.stream().filter(n -> n >= 0).findAny().orElse(0);

        assertThat(anyResult1).isEqualTo(1);
        assertThat(anyResult2).isEqualTo(1);
    }
```

4. [예제보러가기](https://github.com/wenodev/CodeLife/blob/main/study/stream/example.md)

[참고]

1. https://madplay.github.io/post/introduction-to-java-streams
2. https://madplay.github.io/post/java-streams-intermediate-operations
3. https://madplay.github.io/post/java-streams-terminal-operations
