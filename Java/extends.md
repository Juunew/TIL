# 상속

👉 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것

👉 **코드의 재사용성**을 높이고 **코드의 중복을 제거**하여 프로그램의 **생산성과 유지보수**에 기여

👉 **extends** 예약어를 사용❗❗

👉 자바에서는 **단일 상속(single inheritance)**만을 지원❗❗

---

### 클래스 상속

- 상속하는 클래스 : 상위 클래스, parent class
- 상속받는 클래스 : 하위 클래스, child class

```java
class Child extends Parent {
    // A class = parent class, 조상클래스
    // B class = child class, 자손 클래스
}
```

> extends 키워드 뒤에는 단 하나의 클래스만 올 수 있음❗❗
>
> 단일 상속❗❗
>
> ( 다중 상속을 허용하면 여러 클래스로부터 상속받을 수 있기 때문에 복합적인 기능을 가진 클래스를 쉽게 작성할 수 있다는 장점이 있지만, **중복되는 변수와 메서드를 구별할 수 있는 방법이 없다는 단점**때문에 **클래스 간의 관계를 보다 명확하게 하고 코드를 더욱 신뢰할 수 있게 단일 상속만을 허용**❗❗)
>
> extends의 사전적 의미를 떠올리면 이해하기가 조금 더 쉽다  👉 extends : 확장하다

- child class는 parent class의 모든 멤버를 상속받지만, child class에 새로운 코드가 추가되어도 parent class는 아무런 영향도 받지않는다.
- child class의 멤버 개수는 parent class 보다 항상 같거나 많다

---

### 상속을 구현하는 경우

- Parent class는 Child class보다 일반적인 개념과 기능을 가짐
- Child class는 Parent class보다 구체적인 개념과 기능을 가짐
- Parent class가 Child class를 통해 속성과 기능을 확장(extends), 구체화

```java
class Animal {
       
}

class Dog extends Animal {
    
}

class Cat extends Animal {
    
}
```



