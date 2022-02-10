# Java Study : Optional

## Optional의 특징

- Null을 예방하지 못하면 NullPointerExceion이 발생한다. 런타임 에러이기 떄문에 예측하기가 쉽지 않다.
- Optional은 Null일 가능성이 있는 객체를 담는다.

## 초기화

```java
    @Test
    void test_init(){
        User user2 = new User(2, "sonny");
        User user3 =new User(3);

        Optional.of(user2.getName());
        Optional.ofNullable(user3);
        Optional.empty();
    }
```

## 값 꺼내기

```java
    @Test
    void test_orElse(){
        User user3 =new User(3); // 이름이 없는 user
        Optional.of(user3.getName()).orElse("defaultName");
        Optional.of(user3.getName()).orElseGet(() -> "defaultName");
        Optional.of(user3.getName()).orElseThrow(() -> new IllegalArgumentException());
    }
```

## ifPresent

값이 있으면 실행하고 없으면 실행하지 않는 메소드

```java
    @Test
    void test_ifPresent_with_null(){
        Optional<User> user = Optional.ofNullable(null);
        user.ifPresent(u -> System.out.println(u.getName())); // 출력 안함
    }

    @Test
    void test_ifPresent_with_non_null(){
        Optional<User> user = Optional.ofNullable(new User(1, "weno"));
        user.ifPresent(u -> System.out.println(u.getName())); // "weno" 출력
    }
```
