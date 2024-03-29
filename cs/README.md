# Computer Science

- [자료구조](#자료구조-data-structure)<br>
  - [선형 자료구조](#선형-자료구조)<br>
  - [배열](#배열)<br>
  - [연결 리스트](#연결리스트-linkedlist)
  - [ArrayList](#arraylist)
  - [Stack](#stack)
  - [Queue](#queue)
  - [비선형 자료구조](#비선형-자료구조)
  - [트리](#트리---tree)
  - [이진트리](#이진트리---binary-tree)

---
# 자료구조 (Data Structure)

## **자료구조란?**

자료(데이터)에 효율적으로 접근하고 수정할 수 있도록 저장, 조직, 관리하는 방법에 대한 이론

자료의 특성과 크기, 주요 사용법과 수행하는 연산의 종류, 구현에 필요한 공간 크기에 따라 하나를 선택할 수 있다.

**자료구조의 종류**

![자료구조_종류](https://user-images.githubusercontent.com/80582237/216812671-c5c3436a-8d34-4348-8a21-1f29f2919642.png)

자료구조는 크게 4가지로 분류할 수 있다.
- **단순 구조** : boolean(true/false), 정수, 실수, 문자 및 문자열과 같이 프로그래밍 언어에서 기본적으로 제공하는 자료 
- **선형 구조** : 데이터들이 순차적으로 일렬로 저장되어 있는 형태
- **비선형 구조** : 선형구조처럼 나열되어 있지는 않지만 하나의 자료가 다른 자료와 연결되는 형태의
- **파일 구조** : 같은 성질을 가지는 데이터들을 모아 놓은 파일을 일정한 규칙에 따라 저장하는 형태

---
## 선형 자료구조

### **배열**

배열(Array)은 데이터를 나열하고, 각 데이터를 인덱스에 대응하도록 구성한 데이터 구조이다. 같은 종류의 데이터를 순차적으로 저장하며 데이터를 효율적으로 관리하기 위해 사용한다.

배열은 참조 객체이므로 배열을 가리키는 **참조 변수는 스택 영역에 할당**되며, 주소값(인덱스)은 **힙 영역에 생성되는 배열의 주소값**이다.

- 장점 
  - 빠른 접근이 가능함. (인덱스를 이용해 접근하기 때문)
  - 데이터의 크기가 확정적일 때 메모르리나 처리속도 면에서 좋다.
- 단점
  - 선언할 때 크기가 고정되기때문에 데이터 추가/삭제의 어려움이 있다. (사이즈를 넘어가면 배열을 새로 만들어야 함)
  - 중간에 요소를 삽입하거나 삭제할 경우에는 해당 요소 뒤에 있는 요소들의 위치를 이동시켜야 한다.

> element : 배열을 구성하는 각각의 값. 요소 혹은 원소라고 부른다.
> 
> index : 배열에서의 주소를 가리키는 숫자값 (배열의 index는 0부터 시작)

~~~ java
// 배열의 선언 방법
public class Array {

  // 배열을 선언하면서 동시에 크기 할당
  int[] arrA = new int[10];
  
  // 배열을 선언하면서 동시에 값을 할당
  int[] arrB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
}
~~~

int 자료형 뿐만 아니라 String, char, boolean 등 다른 자료형의 배열도 선언할 수 있다.

배열의 길이는 중괄호 { } 사이에 제공되고 쉼표 , 로 구분된 값의 수에 따라 결정된다.


**배열의 시간복잡도**

**접근**

배열 내에서 n번째 인덱스에 해당하는 값을 찾는 접근 연산은 O(1)의 시간복잡도를 갖는다.

**검색**

배열의 검색은 순차검색으로 인덱스를 알지 못할 때 원하는 값을 찾기 위해서는 배열을 하나하나 확인해봐야 하기 때문에 O(n)의 시간복잡도를 갖는다.

**추가, 삭제**

추가하거나 빼려는 인덱스를 정확하게 알고 있다면 O(1), 그게 아니라면 O(n)

---
### List

리스트는 어떠한 순서를 가지고 원소들이 나열된 형태의 자료구조이다. 리스트는 순차 리스트와 연결 리스트 두 종류로 구분된다.
보통 순차 리스트는 배열(Array)을 사용해 표현하지만 자바에서는 ArrayList라는 Java API가 따로 존재한다.

순차 리스트는 데이터를 삽입하거나 삭제하고 나면, 연속적인 물리적 위치를 유지하기 위해 원소를 옮기는 추가 작업을 해야 하므로 삽입이나 삭제 연산이 많다면 그만큼 시간이 오래 걸린다. (대신 조회 시에는 해당 인덱스만 조회하면 되므로 시간이 단축된다.)

연결리스트는 특정 노드를 삽입하거나 삭제할 때 순차 리스트에 비해 연산 속도가 빠르며, 조회 시에는 index[0] 부터 시작되어 연산 속도가 느리다.

### 연결리스트 (LinkedList)

Linked List는 순차 리스트와 달리 물리적 위치와 논리적 위치가 다를 수 있으며, 각 원소는 자신 다음 원소의 물리적 위치를 가지고 있다.

![LinkedList](https://user-images.githubusercontent.com/80582237/217576251-cc161482-c65e-49b0-9cc6-a396a63024ef.png)

🌟 Node(노드) : 데이터 저장 단위 (데이터값, 포인터)로 구성되어 있다.

🌟 Pointer(포인터) : 각 노드 안에서, 다음이나 이전의 노드와의 연결 정보를 가지고 있는 공간.

장점
- 미리 데이터 공간을 할당하지 않아도 된다. (순차 리스트 - 배열은 미리 데이터 공간을 할당해야 한다.)

단점
- 연결 정보를 찾는 시간이 필요하므로 접근 속도가 느리다.
- 중간 데이터를 삭제하거나 새로 추가할 경우 앞뒤 데이터의 연결을 재구성해야 하는 부가적인 작업이 필요하다.

Linked List의 종류
1. 단일 연결리스트 : 각 노드 당 한 개의 포인터가 있고 포인터는 다음 노드의 위치를 가리킨다. (테일은 가장 마지막이므로 포인터를 가지고 있지 않다.)
2. 이중 연결리스트 : 포인터를 두 개 가지고 있어 이전 노드와 다음 노드를 가리킨다.
3. 원형 연결리스트 : 단일 연결리스트와 같으며 다만 테일에 포인터가 추가된 형태로 테일의 포인터는 헤더를 가리켜 원형이 되도록 한다.

![연결리스트_종류](https://user-images.githubusercontent.com/80582237/217576390-dbc7b8c9-9eb2-4d8f-b793-dc5b633a553c.png)

### ArrayList
자바의 ArrayList는 List 인터페이스를 상속받은 클래스이며, 배열을 이용해 리스트를 구현했다.
배열은 처음에 할당된 만큼의 공간을 사용할 수 있는 반면, ArrayList는 계속해서 데이터를 추가할 수 있고 그에 따라 크기가 가변적으로 변한다.

장점
- 배열을 이용하기 때문에 인덱스를 이용할 수 있으며, 그 덕에 조회연산이 빠르다.

단점
- 데이터의 추가/삭제 연산이 느리다. -> 중간에 데이터를 삭제하거나 추가하면 한 칸씩 당기거나 미뤄야 함 (shift)
---
### Stack

![stack](https://user-images.githubusercontent.com/80582237/217596839-62fe6df9-e5bc-41cb-9eb0-e010c337865e.png)

스택은 한쪽 끝으로만 데이터를 넣고 뺄 수 있는 **후입선출(Last-In-First-Out) - [나중에 들어온 데이터가 가장 먼저 빠져나간다]** 형태의 자료구조이다.

대표적으로 컴퓨터 내부 프로세스 구조의 함수 동작 방식이 스택이다. 가장 쉬운 예시로 실행 취소(ctrl + z)를 생각할 수 있다. 실행취소를 여러번 할 때 가장 최근에 수행되었던 작업부터 취소되는 것을 떠올리면 된다.

```java
class Stack<T> {
    class Node<T> {
        private T data;
        private Node<T> nextNode;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public T pop() {
        // 맨 위에 값이 null -> Exception
        if (top == null) {
            throw new EmptyStackException();
        }

        // 맨 위 node의 data값을 item 변수에 담고, 반환! (top node의 다음 node data를 다시 top으로 설정)
        T item = top.data;
        top = top.nextNode;

        return item;
    }

    public void push(T item) {
        Node<T> topNode = new Node<>(item);
        topNode.nextNode = top;
        top = topNode;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class TestStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack.isEmpty());
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.isEmpty());
  }
}
```

---
### Queue

![queue](https://user-images.githubusercontent.com/80582237/218985676-560cb1a8-940d-4618-9091-946df42f18ae.png)

큐는 스택과 반대로 **선입선출(First-In-First-Out) - [먼저 들어온 데이터가 먼저 빠져나간다]** 형태의 자료구조이다.

맛집의 웨이팅을 생각하면 편하다! (먼저 온 사람이 먼저 먹고 퇴장!)

```java
class Queue<T> {
    class Node<T> {
        private T data;                 // 데이터
        private Node<T> nextNode;       // 다음 노드

        // 생성자를 통해 data를 전달받은 뒤 내부 변수에 저장
        public Node(T data) {
            this.data = data;
        }
    }

    // 앞과 뒤의 주소를 알기위한 변수
    private Node<T> first;
    private Node<T> last;

    public void add(T item) {
        // 노드 생성!
        Node<T> t = new Node<>(item);

        // 맨 마지막 노드가 null이 아니면 노드 추가
        if (last != null) {
            last.nextNode = t;
        }

        last = t;

        // first == null 이면 비어있는 노드이기 때문에 맨 처음 값을 t로 설정해준다.
        if (first == null) {
            first = last;
        }
    }

    public T remove() {
        // first == null 이면 비어있는 노드이기 때문에 삭제할 노드가 없다. 따라서 throw Exception
        if (first == null) {
            throw new NoSuchElementException();
        }

        // 맨 앞 노드를 삭제하면 그 다음 노드를 맨 앞 노드로 바꿔주는 작업
        T data = first.data;
        first = first.nextNode;

        // 모든 요소가 삭제되었을 경우 마지막 노드도 null로 변경
        if (first == null) {
            last = null;
        }

        return data;
    }

    // 맨 앞 노드의 data를 반환
    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}

public class TestQueue {
  public static void main(String[] args) {
    Queue<Integer> q = new Queue<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);

    System.out.println(q.remove());     // 맨 처음 노드가 추출되고 제거된다. (기댓값 : 1)
    System.out.println(q.peek());       // 맨 처음 노드 확인 (기댓값 : 2 - 기존 맨 처음 값인 1이 제거된 후)
    System.out.println(q.remove());     // 맨 처음 노드가 추출되고 제거된다. (기댓값 : 2)
    System.out.println(q.remove());     // 맨 처음 노드가 추출되고 제거된다. (기댓값 : 3)
    System.out.println(q.peek());       // 맨 처음 노드 확인 (기댓값 : 4)
    System.out.println(q.isEmpty());    // Queue 가 비어있는지 확인 (기댓값 : false - 4와 5가 남았기때문)
    System.out.println(q.remove());     // 맨 처음 노드가 추출되고 제거된다. (기댓값 : 4)
    System.out.println(q.peek());       // 맨 처음 노드 확인 (기댓값 : 5)
    System.out.println(q.remove());     // 맨 처음 노드가 추출되고 제거된다. (기댓값 : 5)
    System.out.println(q.isEmpty());    // Queue 가 비어있는지 확인 (기댓값 : true - 5까지 다 제거가 되었다.)
    System.out.println(q.remove());     // 맨 처음 노드가 추출되고 제거된다. (기댓값 : Exception - 더 이상 제거할 노드가 없다)
  }
}
```
![queueTest](https://user-images.githubusercontent.com/80582237/218985608-3d23a1bd-6def-42f8-8aa7-201ade3eea1d.png)
---
## 비선형 자료구조

### 트리 - Tree

![tree](https://user-images.githubusercontent.com/80582237/225566180-d029155c-6547-41d0-827e-74976c81c2ab.png)

트리는 비선형 자료구조 중 하나로 노드로 이루어져있으며 데이터들이 계층적으로 연결되어 저장된다.

또한 트리 내에 다른 하위 트리가 있고 그 하위 트리 안에는 또 다른 하위 트리가 있는 **재귀적 자료구조** 이기도 하다.

#### 트리 구조에서 사용되는 기본 용어

노드 (Node)
- 트리를 구성하고 있는 기본 요소
- 루트 노드 : 트리에서 부모가 없는 최상위 노드, 트리의 시작점
- 부모 노드 : 루트 노드 방향으로 직접 연결된 노드
- 자식 노드 : 루트 노드 반대방향으로 직접 연결된 노드
- 형제 노드 : 같은 부모 노드를 갖는 노드들
- 리프 노드 : 루트 노드를 제외하고 차수가 1인 정점. 자식이 없는 노드.

간선 (Edge)
- 노드와 노드 간의 연결선

레벨 (level)
- 루트에서 기준 노드까지 연결된 간선(Edge) 수의 합

깊이 (depth)
- 루트에서 기준 노드까지의 간선(Edge) 수

높이 (height)
- 기준 노드에서 리프 노드까지 가장 긴 경로의 간선(Edge) 수

차수 (degree)
- 각 노드의 자식 노드의 개수

트리의 차수 (degree of tree)
- 트리의 최대 차수

너비 (width)
- 가장 많은 노드를 갖고 있는 레벨의 크기

---
### 이진트리 - Binary Tree

![binaryTree](https://user-images.githubusercontent.com/80582237/225905447-6d75b5df-f713-40b3-8d6e-48738247c8c6.png)

이진트리는 각 노드가 최대 두 개의 자식 노드를 갖는 트리를 말한다. 각 노드는 자식 노드가 없거나, 한 개 또는 두 개 만을 갖는다.

이진트리에는 다음과 같은 종류가 있다.

![binaryTreeType](https://user-images.githubusercontent.com/80582237/225905494-c6da148d-b5ab-44c5-b3e5-98b57390ae6b.png)

- 포화 이진 트리(Full binary tree)
  - 모든 레벨의 노드가 자식 노드를 가지고 있는 이진 트리
  - 모든 리프 노드의 높이가 같다.
  - 트리의 노드 개수가 2^h-1 개여야 한다. (h = 트리의 높이)
- 완전 이진 트리(Complete Binary Tree)
  - 마지막 레벨을 제외하고 모든 레벨이 완전히 채워져 있다
  - 노드가 왼쪽에서 오른쪽으로 순차적으로 채워져야 한다
- 편향 이진 트리(Skewed Binary Tree)
  - 부모 노드의 왼쪽이나 오른쪽 한 곳만 노드가 존재하는 트리
  - 같은 높이의 이진 트리 중에서 최소 개수의 노드 개수를 가진다.

---
### 이진탐색트리 - Binary Search Tree

![bst.png](..%2F..%2F%EB%B8%94%EB%A1%9C%EA%B7%B8%2FDataStructure%2Fbst.png)

이진탐색트리는 이진트리의 한 종류로 아래와 같은 특징을 가진다.

- 각 노드에는 중복되지 않는 키가 있다.
- 루트 노드의 **왼쪽 서브 트리는 루트 노드의 키보다 작은 키**를 갖는 노드들로 이루어져 있다.
- 루트 노드의 **오른쪽 서브 트리는 루트 노드의 키보다 큰 키**를 갖는 노드들로 이루어져 있다.
- 좌우 서브 트리도 모두 위와 같은 이진탐색트리의 특징을 갖는다.

내가 찾으려는 키가 루트 노드의 키보다 작으면 왼쪽 트리로, 루트 노드의 키보다 크면 오른쪽 트리로 가면되기 때문에 기존의 이진트리보다 **탐색이 빠르다**는 장점이 있다.

예를 들어 내가 키가 6인 노드를 찾아보려한다. 가장 먼저 루트 노드와의 비교가 이루어지고 6은 8보다 작은 키이기 때문에 루트노드에서 왼쪽에 존재하는 서브트리로 탐색을 옮긴다.
그 후 6은 3보다 큰 키이기 때문에 오른쪽 방향으로 탐색이 진행되고 마침내 찾게 되었다.

이진탐색트리에서는 무조건 트리의 높이(h) 이하의 탐색이 이루어진다.

~~~java
public class BinarySearchTree {
  public static void main(String[] args) {

  }

  Node root = null;

  public class Node {
    int value;
    Node leftNode;
    Node rightNode;

    public Node(int data) {
      this.value = data;
      this.leftNode = null;
      this.rightNode = null;
    }
  }

  public boolean searchNode(int data) {
    // root == null 이면 비어있는 트리!
    if (root == null) {
      return false;
    }

    Node findNode = root;

    while (findNode != null) {
      if (findNode.value == data) {
        return true;
        // data 가 root 보다 작으면 root 의 왼쪽 트리 root 로 다시 초기화 한 후 while 문!
      } else if (data < findNode.value) {
        findNode = findNode.leftNode;
        // data 가 root 보다 크다면 root 의 오른쪽 트리 root 로 다시 초기화 한 후 while 문!
      } else {
        findNode = findNode.rightNode;
      }
    }

    // while 문을 다 돌았으면 찾으려는 값이 없기때문에 false
    return false;
  }

  public boolean insertNode(int data) {
    // CASE 1 : Node 가 하나도 없을 때
    if (root == null) {
      root = new Node(data);
    } else {
      // CASE 2 : Node 가 하나 이상 들어가 있을 때
      Node findNode = root;
      while (true) {
        // CASE 2-1 : 현재 Node 의 왼쪽에 Node 가 insert
        if (data < findNode.value) {
          // 왼쪽 Node 가 존재하면 다시 한번 data 와 Node 의 value 비교!
          if (findNode.leftNode != null) {
            findNode = findNode.leftNode;
            // 왼쪽 Node 가 비어있으면 data 를 value 로 가지는 Node 생성 && while 문 break!!
          } else {
            findNode.leftNode = new Node(data);
            break;
          }
          // CASE 2-2 : 현재 Node 의 오른쪽에 Node 가 insert
        } else {
          // 오른쪽 Node 가 존재하면 다시 한번 data 와 Node 의 value 비교!
          if (findNode.rightNode != null) {
            findNode = findNode.rightNode;
            // 오른쪽 Node 가 비어있으면 data 를 value 로 가지는 Node 생성 && while 문 break!
          } else {
            findNode.rightNode = new Node(data);
            break;
          }
        }
      }
    }
    return true;
  }

}
~~~