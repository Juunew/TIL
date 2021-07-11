# List 인터페이스

👉 **중복을 허용**하면서 **저장순서가 유지**되는 컬렉션을 구현하는데 사용

👉 객체를 **인덱스로 관리**하기 때문에 **객체 저장 시 자동 인덱스가 부여**되고 **인덱스로 객체를 검색, 삭제**할 수 있다

- ArrayList
- Vector
- LinkedList

---

### List 인터페이스의 메소드

- add() : 객체 추가
- get() : 객체 가져오기
- remove() : 객체 삭제

---

### 1. ArrayList

- List 인터페이스를 상속받음
- 배열은 크기가 고정이지만 ArrayList는 **가변적**
- 객체가 저장될 때 **Object 타입으로 변환되어 저장**되기 때문에 **모든 종류의 객체를 저장**할 수 있음
- 특정 인덱스의 **객체를 제거하게 되면**, 제거한 객체의 인덱스부터 마지막 인덱스까지 모두 **1칸씩 앞으로 이동**
- 특정 인덱스에 **객체를 삽입하면 모두 1칸씩 뒤로** 이동

```java
import java.util.ArrayList
    
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        // add() 메소드를 이용한 객체 저장
        list.add("Java");			// 1번 인덱스 = Java 저장
        list.add("JDBC");			// 2번 인덱스 = JDBC 저장
        list.add("Servlet/JSP");
        list.add("Database");
        list.add("iBATIS");
        
        int size = list.size();		// 저장된 총 객체 수 얻기
        System.out.println("총 객체수 : " + size);		// 결과값 = 총 객체수 : 5
        
        for(int i = 0; i < list.size(); i++) {		   
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        // 결과값
        // 0:Java
        // 1:JDBC
        // 2:Servlet/JSP
        // 3:Database
        // 4:iBATIS
        
        list.remove(1);		// 1번 인덱스 JDBC 삭제 -> 기존에 2번이었던 객체부터 앞으로 1칸씩 이동
        list.remove(2);		// 2번 인덱스 Database 삭제
        list.remove(iBATIS);
        
        for(int i = 0; i < list.size(); i++) {		   
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        // 결과값
        // 0:Java
        // 1:Servlet/JSP
    }
}
```



