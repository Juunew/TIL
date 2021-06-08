# StringBuffer 와 StringBuilder



## 사용환경

- **String** : `불변`  `문자열 연산이 적을 때`  `멀티쓰레드 환경`  `불변하는 문자열을 자주 읽어들이는 경우`
- **StringBuffer** : `가변`   `문자열 연산이 많을 때`   `멀티쓰레드 환경`
- **StringBuilder** : `가변`  `문자열 연산이 많을 때`   `싱글쓰레드 환경`   `동기화를 고려하지 않아도 되는 경우`

---



## 차이점

|     StringBuffer     |     StringBuilder      |
| :------------------: | :--------------------: |
|       동기화 O       |        동기화 X        |
|      멀티쓰레드      |       싱글쓰레드       |
| 멀티쓰레드 환경 안전 | 멀티쓰레드 환경 불안전 |

> **StringBuffer*의 동기화 처리를 빼고*** 만들어진 클래스 = **StringBuilder**
>
> 성능 = StringBuilder > StringBuffer > String
>
> 공통점 = String(문자열)을 저장하고 관리하는 클래스들
>
> 멀티쓰레드 환경에서 StringBuilder를 사용하면 여러 쓰레드에서 동시에 접근하게 되어 안전에 문제가 생김

---



## 주요 메소드

|        stringbuffer.         | StringBuilder도 동일한 메소드                                |
| :--------------------------: | :----------------------------------------------------------- |
|           append()           | 매개변수로 입력된 값을 문자열로 변환하여 해당 문자열의 마지막에 추가 |
|          capacity()          | 인스턴스의 버퍼 크기를 알려줌 ( StirngBuffer의 경우 default 크기는 16 ) |
|           delete()           | 인덱스에 해당하는 부분 문자열을 해당 문자열에서 제거         |
|        deleteCharAt()        | 지정된 위치의 문자를 제거                                    |
|    insert( index, value )    | 두 번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치(index)에 삽입 |
|          reverse()           | 인스턴스에 저장되어 있는 문자열의 순서를 역순으로 변경       |
|         int length()         | 인스턴스에 저장되어 있는 문자열의 길이를 반환                |
| replace(index, index, value) | 지정된 범위(index,index)의 문자들을 주어진 문자열로 변환(start<= x < end) |
|      String toString()       | 인스턴스의 문자열을 String으로 변환                          |
|   substring(index, index)    | 지정된 범위 내의 문자열을 String으로 뽑아서 반환             |
|                              | 시작위치만 정하면 시작위치부터 문자열 끝까지 뽑아서 반환     |

