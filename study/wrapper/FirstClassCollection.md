# Java Study : First Class Collection

1. 일급 콜렉션이란?

- Collection을 Wrapping 하면서, 그 외 다른 멤버 변수가 없는 상태 (from [앤트웍 생활체조](https://developerfarm.wordpress.com/2012/02/01/object_calisthenics_/))

2. 일급 콜렉션의 장점

## 비지니스에 종속적인 자료구조

비지니스에 종속적인 자료구조라는 것을 이해하려면 비지니스 로직을 처리하는 두 가지 패턴인 **도메인 모델**과 **트랜잭션 스크립트**를 알아야 한다.

트랜잭션 스크립트는 하나의 트랜잭션 안에서 모든 로직을 처리하는 것으로 단순한 구조로 구현이 쉽다는 장점이 있지만 로직이 복잡해 질수록 복잡도가 올라간다는 단점이 있다.  
도메인 모델은 데이터와 프로세스가 같이 존재하는 것으로 각 객체가 수행해야 하는 업무를 분담시켜 복잡도를 낮춘다는 장점이 있다. 하지만 객체들간의 설계를 잘 못한다면 오히려 코드 관리가 어려워 질 수 있다는 단점이 있다.

코드를 작성해 보면 두 개의 차이는 비지니스 코드를 도메인 영역에 둘지 서비스 영역에 둘지의 차이인데 도메인 영역이 맞다는 의견에 공감을 해야 일급 콜렉션이 좋다는 것을 받아들일 수 있게 된다.

즉, 일급 콜렉션을 만다는 이유는 도메인 모델 방식으로 코드를 짤 때 좋다는 것이다.

### AS-IS

```java
public class LottoService {

    private static final int SIZE = 6;

    public void createLottoNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        LottoTicket lottoTicket = new LottoTicket(numbers);
    }

    private void validateSize(List<Integer> numbers){
        if (numbers.size() != SIZE){
            throw new IllegalArgumentException("6자리만 가능합니다.");
        }
    }

}
```

### TO-BE

```java
public class LottoService {

    private static final int SIZE = 6;

    public void createLottoNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        LottoTicket lottoTicket = new LottoTicket(numbers);
    }
}

public class LottoTicket {
    private static final int SIZE = 6;

    private final List<Integer> lottoNumbers;

    public LottoTicket(List<Integer> lottoNumbers) {
        validateSize(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }

    private void validateSize(List<Integer> numbers){
        if (numbers.size() != SIZE){
            throw new IllegalArgumentException("6자리만 가능합니다.");
        }
    }
}
```

## Collcetion의 불변성 보장

자바에서 final은 불변성을 보장해주지 않고 재할당만 막아준다. 또한 setter를 사용하지 않는다고해서 불변이 지켜지지 않는다. 따라서 'final이라서', 혹은 'setter가 없어서' 일급 콜렉션이 불변성을 보장해 준다는 말은 틀린말이다.

```java
public class LottoService {
    public LottoTicket createLottoNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        LottoTicket lottoTicket = new LottoTicket(numbers);
        return lottoTicket;
    }
}

public class LottoTicket {
    private final List<Integer> lottoNumbers;

    public LottoTicket(List<Integer> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }
}

class LottoServiceTest {

    @Test
    void test_createLottoNumbers(){
        LottoService lottoService = new LottoService();
        LottoTicket lottoTicket = lottoService.createLottoNumbers();

        System.out.println(lottoTicket.getLottoNumbers().size()); // 3
        lottoTicket.getLottoNumbers().clear();
        System.out.println(lottoTicket.getLottoNumbers().size()); // 0? 불변이 아니네?
    }

}

```

어떻게 일급 콜렉션을 만드느냐에 따라 불변이 될수도 그렇지 않을수도 있다.  
또한 일급 콜렉션이 꼭 불변이여야 한다는 정의는 없다. 따라서 불변이면 좋은 상황에는 불변을 만들면 되고 그렇지 않은 경우에는 안만들어도 된다.

불변을 만들고 싶다면 일급콜렉션의 getter를 사용하지 않거나 Collection을 만들때 Collections.unmodifiableList() 메소드를 활용하면 된다.

## 상태와 행위를 한 곳에서 관리

상태와 행위를 한곳에 둘 수 있어서 코드의 응집도가 올라갑니다.

## 이름이 있는 콜렉션

일급 콜렌션을 사용의 주 목적은 아니지만 코드의 가독성이 올라간다는 점에서는 큰 장점이라고 불 수 있다.

참고1 : https://jojoldu.tistory.com/412  
참고2 : https://tecoble.techcourse.co.kr/post/2020-05-08-First-Class-Collection/  
참고3 : https://jins-dev.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%EC%9D%98-2%EA%B0%80%EC%A7%80-%EB%A1%9C%EC%A7%81-%ED%8C%A8%ED%84%B4-%EB%8F%84%EB%A9%94%EC%9D%B8-%EB%AA%A8%EB%8D%B8Domain-Model-%ED%8A%B8%EB%9E%9C%EC%9E%AD%EC%85%98-%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8Transaction-Script
