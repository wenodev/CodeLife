# Java Study : Reflection

## Relfection이란?

[reflect package 공식문서]()에는 아래와 같이 설명되어 있다.

> Provides classes and interfaces for obtaining reflective information about classes and objects.

클래스와 객체에 대한 속성을 보여주는 정보를 얻기 위한 클래스 및 인터페이스를 제공합니다.

> Reflection allows programmatic access to information about the fields, methods and constructors of loaded classes, and the use of reflected fields, methods, and constructors to operate on their underlying counterparts, within encapsulation and security restrictions.

Refelction을 사용하면 로드된 클래스의 필드, 메소드, 생성자에 대한 정보에 programmatic 하게 접근할 수 있고, 캡슐화와 security restriction 내에서 근본적인 대응에서 작동하기 위해 나타나는 필드, 메소드, 생성자를 사용할 수 있다.

## Class 정보

- Object 클래스의 getClass() 메소드를 호출하여 가져올 수 있다.
- Class 클래스의 forName() 메소드를 호출하여 가져올 수 있다. forName()의 인자로는 경로를 포함한 클래스 이름이 필요하다.

## Class 접근자

Class클래스의 getModifiers() 라는 native를 호출하면 함수의 접근제어자 별로 정수값을 얻을 수 있다.  
이를 Modifier라는 클래스의 함수(isPublic, isPrivate..)를 호출하여 and 연산을 통해 접근제어자를 확인할 수 있다.
Modifier에는 접근제어자 별로 고유값이 int 형태로 저장되어 있고 and 연산하며 0이면 해당 접근제아에 해단하게 된다. 자세한 내용은 [Modifier 공식문서](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Modifier.html)를 참고하면 된다.

```java
@Test
void test_Modifier(){
    Class<?> sampleClass = Class.forName("com.example.deom.Sample"); // public 이라고 가정한다.
    int sampelMods = goatClass.getModifiers();
    assertThat(Modifier.isPublic(sampelMods)).isTrue();
}
```

## Constructors, Methods, Fields

```java
Class<?> sampleClass = Class.forName("com.example.deom.Sample");
Constructor<?>[] constructors = sampleClass.getConstructors(); // 생성자 정보 가져오기
Method[] methods = sampleClass.getDeclaredMethods(); // 메소드 정보 가져오기
Field[] fields = sampleClass.getDeclaredFields(); // 필드 정보 가져오기
```

### getDeclaredFields vs getFields

- getFields() : 해당 클래스의 public 필드에만 접근할 수 있으며 부모 클래스 필드에 접근할 수 있다.
- getFields() : 해당 클래스의 모든 필드에 접근할 수 있고, 부모 클래스에 접근할 수 없다.

참고1: https://www.baeldung.com/java-reflection
