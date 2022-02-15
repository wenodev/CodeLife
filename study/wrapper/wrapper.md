# Java Study : Wrapper Class

- 래퍼 클래스란 무엇인가?
- 사용 시기?
- 기본타입, 래퍼 클래스 대응표
- 박싱과 언박싱 & 오토 박싱과 오토 언박싱

## 래퍼 클래스란

8개의 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스이며, java.lang 패키지에 포함되어 있다.

- 정수형 : byte, short, int, long, char
- 실수형 : float, double
- 기타 : boolean

## 사용 시기

기본 타입의 데이터를 객체로 취급해야 할 때 사용합니다.

```java
List<int> intList = new ArrayList() // List에 기본 타입을 사용할 수 없다.
```

## 기본타입에 대응하는 래퍼 클래스

| 기본타입 | 래퍼 클래스 |
| -------- | ----------- |
| byte     | Byte        |
| short    | Short       |
| int      | Integer     |
| long     | Long        |
| float    | Float       |
| double   | Double      |
| char     | Character   |
| boolean  | Boolean     |

_래퍼 클래스 중 Integer와 Character는 기본타입과 스펠링이 다르다._

## 박싱과 언박싱 & 오토 박싱과 오토 언박싱

- 기본 타입의 데이터를 래퍼 클래스의 인스턴스로 변환하는 과정을 박싱(Boxing) 이라고 한다.
- 래퍼 클래스의 인스턴스를 기본 타입으로 변환하는 과정을 언박싱(UnBoxing) 이라고 한다.

JDK 1.5 이후부터는 박싱과 언박싱을 자바 컴파일러가 자동으로 처리해 주고 이를 오토 박싱과 오토 언박싱이라고 한다.

참고1 : http://www.tcpschool.com/java/java_api_wrapper  
참고2 : 자바의신
