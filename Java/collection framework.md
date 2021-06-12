# 컬렉션 프레임워크(collection framework)

### 컬렉션 프레임워크란?

👉 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합

👉 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화 하여 클래스로 구현해놓은 것

---

### 컬렉션 프레임워크 주요 인터페이스

1. List
2. Set
3. Map

| 인터페이스 | 특징                                                         | 구현 클래스                                 |
| ---------- | ------------------------------------------------------------ | ------------------------------------------- |
| List       | 순서가 있는 데이터의 집합, 데이터의 중복을 허용함            | Vector, ArrayList, LinkedList, Stack, Queue |
| Set        | 순서가 없는 데이터의 집합으로, 데이터의 중복을 허용하지 않음 | HashSet, TreeSet                            |
| Map        | 키(key)와 값(value)의 한 쌍으로 이루어지는 데이터의 집합<br />순서는 유지되지 않으며, 키는 중복을 허용하지 않지만, 값은 중복될 수 있음 | HashMap, TreeMap, Hashtable, Properties     |

---

### Collection 인터페이스

👉 List와 Set 인터페이스의 많은 공통된 부분을 Collection 인터페이스에 정의하고, List와 Set 인터페이스가 상속 받는다.

##### Collection 인터페이스의 주요 메소드

| 메소드                                                       | 설명                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| boolean add(Object o)<br />boolean addAll(Collection c)      | 해당 객체와 컬렉션에 전달된 요수를 추가함(선택적 기능)       |
| void clear()                                                 | 해당 컬렉션의 모든 요소를 제거함(선택적 기능)                |
| boolean contains(Object o)<br />boolean containsAll(Collection c) | 해당 컬렉션이 전달된 객체 또는 컬렉션이 포함되어 있는지를 확인함 |
| boolean equals(Object o)                                     | 해당 컬렉션과 동일한지 비교함                                |
| int hashCode()                                               | 해당 컬렉션의 hash code를 반환함                             |
| boolean isEmpty()                                            | 해당 컬렉션이 비어있는지를 확인함                            |
| Iterator<`E`> iterator()                                     | 해당 컬렉션의 반복자를 반환함                                |
| boolean remove(Object o)                                     | 해당 컬렉션에서 지정된 객체를 삭제함                         |
| int size()                                                   | 해당 컬렉션에 저장된 객체의 개수를 반환함                    |
| Object[] toArray()                                           | 해당 컬렉션의 모든 요소를 Object 타입의 배열로 반환함        |

