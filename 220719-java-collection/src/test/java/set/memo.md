# ArrayList 초기화 할 때 지네릭
```java
public ArrayList(Collection<? extends E> c) {
        Object[] a = c.toArray();
        if ((size = a.length) != 0) {
            if (c.getClass() == ArrayList.class) {
                elementData = a;
            } else {
                elementData = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            // replace with empty array.
            elementData = EMPTY_ELEMENTDATA;
        }
    }
```
- arraylist 생성자 종류 정리 
- 지네릭 정확히 이해하기

# Equals and Hashcode

# 이진트리와 이진탐색트리

# 레드-블랙 트리(Red-Black tree)
