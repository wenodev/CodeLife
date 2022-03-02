# Java Study : Reflection

## Relfection�̶�?

[reflect package ���Ĺ���]()���� �Ʒ��� ���� ����Ǿ� �ִ�.

> Provides classes and interfaces for obtaining reflective information about classes and objects.

Ŭ������ ��ü�� ���� �Ӽ��� �����ִ� ������ ��� ���� Ŭ���� �� �������̽��� �����մϴ�.

> Reflection allows programmatic access to information about the fields, methods and constructors of loaded classes, and the use of reflected fields, methods, and constructors to operate on their underlying counterparts, within encapsulation and security restrictions.

Refelction�� ����ϸ� �ε�� Ŭ������ �ʵ�, �޼ҵ�, �����ڿ� ���� ������ programmatic �ϰ� ������ �� �ְ�, ĸ��ȭ�� security restriction ������ �ٺ����� �������� �۵��ϱ� ���� ��Ÿ���� �ʵ�, �޼ҵ�, �����ڸ� ����� �� �ִ�.

## Class ����

- Object Ŭ������ getClass() �޼ҵ带 ȣ���Ͽ� ������ �� �ִ�.
- Class Ŭ������ forName() �޼ҵ带 ȣ���Ͽ� ������ �� �ִ�. forName()�� ���ڷδ� ��θ� ������ Ŭ���� �̸��� �ʿ��ϴ�.

## Class ������

ClassŬ������ getModifiers() ��� native�� ȣ���ϸ� �Լ��� ���������� ���� �������� ���� �� �ִ�.  
�̸� Modifier��� Ŭ������ �Լ�(isPublic, isPrivate..)�� ȣ���Ͽ� and ������ ���� ���������ڸ� Ȯ���� �� �ִ�.
Modifier���� ���������� ���� �������� int ���·� ����Ǿ� �ְ� and �����ϸ� 0�̸� �ش� �������ƿ� �ش��ϰ� �ȴ�. �ڼ��� ������ [Modifier ���Ĺ���](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Modifier.html)�� �����ϸ� �ȴ�.

```java
@Test
void test_Modifier(){
    Class<?> sampleClass = Class.forName("com.example.deom.Sample"); // public �̶�� �����Ѵ�.
    int sampelMods = goatClass.getModifiers();
    assertThat(Modifier.isPublic(sampelMods)).isTrue();
}
```

## Constructors, Methods, Fields

```java
Class<?> sampleClass = Class.forName("com.example.deom.Sample");
Constructor<?>[] constructors = sampleClass.getConstructors(); // ������ ���� ��������
Method[] methods = sampleClass.getDeclaredMethods(); // �޼ҵ� ���� ��������
Field[] fields = sampleClass.getDeclaredFields(); // �ʵ� ���� ��������
```

### getDeclaredFields vs getFields

- getFields() : �ش� Ŭ������ public �ʵ忡�� ������ �� ������ �θ� Ŭ���� �ʵ忡 ������ �� �ִ�.
- getFields() : �ش� Ŭ������ ��� �ʵ忡 ������ �� �ְ�, �θ� Ŭ������ ������ �� ����.

����1: https://www.baeldung.com/java-reflection
