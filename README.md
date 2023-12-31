# 해드 퍼스트 디자인 패턴

&nbsp;

## 01 디자인 패턴 소개와 전략 패턴 | 디자인 패턴의 세계로 떠나기
변화하는 부분과 그대로 있는 부분

각 행동을 나타낼 클래스 집합을 새로 만들어야 한다

⇒ 구현보다는 인터페이스에 맞춰서 프로그래밍 한다

인터페이스, 구현 클래스, 행동 인터페이스

상위 형식에 맞춰서 프로그래밍 한다

다형성..

구체적으로 구현된 객체를 실행 시에 대입..

행동을 구현하는 클래스..

나는 행동 + 꽥꽥거리는 행동 → 다른 클래스에 위임

flyBehavior, quackBehavior

인스턴스 변수, 구상 클래스

얼마든지 유연하게 초기화할 수 있다

Page 54 → 직접 코드 쳐서 해보기

동적으로 행동 지정하기

setFlyBehavior()

setQuackBehavior()

실행 중에 행동을 바꾸고 싶으면 원하는 행동에 해당하는 Duck의 setter 메서드를 호출

캡슐화된 행동 살펴보기

클래스 다이어그램을 직접 그려보면 좋아

⇒ 상속보다는 구성을 활용한다

행동을 상속 받는 대신, 올바른 행동 객체로 구성하여 행동 부여받기


💡 **전략 패턴** : 알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해준다. 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있다.

디자인패턴 만나기

공통으로 아는 전문 용어 → 디자인 패턴, 효율적인 의사소통

아키텍처를 생각하는 수준을 올려준다.

라이브러리와 프레임워크가 도와주지 못하는 부분을 도와주는 것이 디자인패턴

비관적인 의견 → 간단하지 않다

패턴의 밑바닥 → 객체지향 패턴 (추상화, 캡슐화, 상속, 다형성)

&nbsp;

## 02 옵저버 패턴 | 객체들에게 연락 돌리기
새 소식을 알려줄 수 있는 패턴

차세대 인터넷 기반 기상 스테이션 구축 프로젝트?

실시간 갱신 → 기상 모니터링 어플리케이션

weatherData 클래스, measurementsChanged() 메서드

소프트웨어 개발에서 바뀌지 않는 단 하나 : 변화!

확장성, 게터 메서드

💡 **옵저버 패턴** : 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의


신문사 (주제 객체) + 구독자 (옵저버 객체)

느슨한 결합 : 의존도가 낮은 관계 (Lose Coupling)

사용할 수 있을 것 같은 기능 : 퀘스트 (공통), 알림, 구독, 브로드포스 아록리즘

⇒ 상호작용하는 객체 사이에는 가능하면 느슨한 결합을 사용해야 한다

주제 [WeatherData 객체] : 옵저버 [디스플레이 요소]

스윙 라이브러리

자바 GUI 툴킷

JButton 객체 ⇒ JFrame에 추가

푸시를 풀 방식으로 코드 바꾸기

→ 옵저버가 필요할 때마다 주제로부터 데이터를 당겨오도록 하는 방식

→ getter 메서드로 주제의 날씨 데이터를 가져오도록 각 Observer 구상 클래스를 수정

MVC 패턴에도 응용이 가능하다

&nbsp;

## 03 데코레이터 패턴 | 객체 꾸미기
데코레이터 패턴

실행 중에 클래를 꾸미는 방법

“커피 주문 시스템”

처음엔 슈퍼 클래스 하나를 만들고 모든 음료를 서브 클래스로 만들어 구현 → 너무 많아짐

어떤 원칙을 지키지 않았을까?

재사용, 분리 // 구성으로 객체의 행동 확장하자

변경에는 닫혀있고 확장에는 열려있어야 한다

⇒ OCP(Open-Closed Principle)

클래스는 확장에는 열려있어야 하지만 변경에는 닫혀있어야 한다

(수정이 아닌 추가..?) 라는 의미인 것 같다

코드에서 확장할 부분을 선택할 때는 세심한 주의를 기울여야 한다

💡 **데코레이션 패턴** : 이 패턴으로 객체에 추가 요소를 동적으로 더할 수  있다. 데코레이터를 사용하면 서브클래스를 만들 때보다 훨씬 유연하게 기능을 확장할 수 있다


클래스 다이어그램

데코레이터 형식이 그 데코레이터로 감싸는 객체의 형식과 같다

“커피 주문 시스템 코드 만들기”

추상 구성 요소 (Beverage), 구상 구성 요소 (HouseBlend)

추상 데코레이터 (Condiment Decorator), 구상 데코레이터 (Mocha)

데코레이터가 적용된 예 : 자바 I

java.io 패키지는 데코레이터 패턴을 바탕으로 만들어졌다

자바 I/O 데코레이터도 만들어 볼 수 있다

단점 : 자잘한 클래스가 엄청나게 추가된다, 형식 문제, 초기화하는데 필요한 코드가 훨씬 복잡해진다, Factory, Builder 패턴이 도와줄 듯

&nbsp;

## 04 팩토리 패턴 | 객체지향 빵 굽기
불필요한 의존성을 없애서 결합 문제를 해결하는 방법

new → 인스턴스 

구상 클래스 : 추상 클래스를 구현한 클래스

인터페이스를 사용하고 싶은 것인가?

구상 클래스의 인스턴스를 만드는 과정 중에 문제가 발생 → OCP에 위배.. 캡슐화 해보자

팩토리 : 객체 생성을 처리하는 클래스..

클라이언트에서 그대로 옮길 수 있다..?

객체를 동적으로 바꾸는 방법

인터페이스를 구현한다 → 어떤 상위 형식 (클래스와 인터페이스)에 있는 구성클래스는 그 상위 형식의 ‘인터페이스를 구현하는’ 클래스이다

피자 가게 프레임워크 만들기

SimplePizzaFactory가 삭제됨

PizzaStore이 추상 클래스가 됨

서브클래스 ChicagoStylePizzaStore, NYStylePizzaStore 구현

→ 특성에 맞게 createPizza() 메서드 구현 (팩토리 메서드)

orderPizza() 메서드는 피자 객체가 어느 구상 클래스의 객체인지 모름

생산자 클래스 - 제품 클래스

💡 **팩토리 메서드 패턴** : 객체를 생성할 때 필요한 인터페이스를 만듭니다. 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정합니다. 팩토리 메서드 패턴을 사용하면 클래스 인스턴스를 만드는 일을 서브클래스에게 맡기게 됩니다.

느슨한 결함? 바뀌는 부분을 캡슐화하라

객체 의존성 살펴보기

⇒ 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다

DIP(Dependency Inversion Principle) 의존성 뒤집기 원칙

추상화를 더 많이 강조한다

고수준 구성 요소가 저수준 구성 요소에 의존하면 안되낟.

추상 클래스에 의존하자 → 생각 뒤집기

- 의존성 뒤집기 원칙을 지키는 방법

변수에 구상 클래스의 레퍼런스를 저장하지 맙시다. 구상 클래스에서 유도된 클래스를 만들지 맙시다. 베이스 클래스에 이미 구현되어 있는 메서드를 오버라이드하지 맙시다.

원재료군 묶기 → 원재료를 생산하는 팩토리용 인터페이스 정의

ingredient Factory 새로운 형식의 팩토리

💡 **추상 팩토리 패턴** : 구상 클래스에 의존하지 않고도 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생산하는 인터페이스를 제공합니다. 구상 클래스는 서브 클래스에서 만듭니다.

&nbsp;

## 05 싱글턴 패턴 | 하나뿐인 특별한 객체 만들기
인스턴스를 하나만 만들어야 하는 클래스

💡 **싱클턴 패턴** : 클래스 인스턴스를 하나만 만들고, 그 인스턴스의 전역 접근을 제공합니다.


동기화 문제

클래스 로딩 문제

리플렉션

직렬화, 역직렬화 문제

전역변수

enum..? 신경쓸 것들이 존재한다

&nbsp;

## 06 커맨드 패턴 | 호출 캡슐화하기
캡슐화를 더 높은 수준으로..

IoT 리모컨, 다양한 기기 조작 가능

작업을 요청하는 쪽과 그 작업을 처리하는 쪽을 분리

Command Object

주문서는 여기저기 전달될 수 있다.

커맨드 인터페이스 구현 excute() 구현

💡 **커맨드 패턴** : 요청 내역을 객체로 캡슐화해서 객체를 서로 다른 요청 내역에 따라 매개변수화할 수 있습니다. 이러면 요청을 큐에 저장하거나 로그로 기록하거나 작업 취소 기능을 사용할 수 있습니다.


NoCommand 객체 : 일종의 널 객체

캡슐화 짱이다, 람다 표현식

undo 기능 추가 String Buffer

단계가 있는 명령일 때

→ prevSpeed 상태 지역 변수 사용

여러 동작을 한 번에 처리할 때

→ 새로운 종류의 커맨드 만듦

→ 배열을 그 커맨드로 전달 (매크로 커맨드)

큐 (작업 스레드), 로그 (복구, 기록) → 커맨드 패턴 활용 가능!

지금까지 배웠던 것 중에 가장 유용한 것 같다.

&nbsp;

## 07 어댑터 패턴과 퍼사드 패턴 | 적응시키기
실제와 다른 인터페이스를 가진 것처럼 보이도록 객체 감싸기

어댑터 → 연결이 가능하게 해줌, 중개인 역할

<aside>
💡 **어댑터 패턴**
특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환합니다. 인터페이스가 호환되지 않아 같이 쓸 수 없었던 클래스를 사용할 수 있게 도와줍니다.

</aside>

객체 어댑터 → 구성 사용

클래스 어댑터 → 다중 상속이 가능한 언어에서 사용

Enumeration 인터페이스

Iterator 인터페이스

Facade : 겉모양, 외관

💡 **퍼사드 패턴** : 서브 시스템에 있는 일렬의 인터페이스를 통합 인터페이스로 묶어줍니다. 또한 고수준 인터페이스도 정의하므로 서브 시스템을 더 편리하게 사용할 수 있습니다.


⇒ 진짜 절친에게만 이야기해야 한다

최소 지식 원칙 : 시스템을 디자인할 때 상호작용을 하는 클래스의 개수와 상호작용 방식에 주의를 기울여야 한다.

- 다른 경우 호출 피하기

객체 자체

메서드에 매개변수로 전달된 객체

메서드를 생성하거나 인스턴스를 만든 객체

객체에 속하는 구성 요소

&nbsp;

## 08 템플릿 메서드 패턴 | 알고리즘 캡슐화하기
Coffee class

Tea class

코드 중복이 발생

제조법의 알고리즘이 똑같다 → 템플릿을 만든다.

prepareRecipe() 메서드 : 템플릿 메서드 → 알고리즘 관리

추상 메서드는 추상 클래스에서만 사용될 수 있는 것인가?

💡 **템플릿 메서드 패턴** : 알고리즘의 골격을 정의합니다. 템플릿 메서드를 사용하면 알고리즘의 일부 단계를 서브 클래스에서 구현할 수 있으며, 알고리즘의 구조는 그대로 유지하면서 알고리즘의 특정 단계를 서브 클래스에서 재정의할 수도 있습니다.

후크를 사용할 수도 있음!

선택적으로 적용되는 알고리즘

⇒ 할리우드 원칙, 먼저 연락하지 마세요. 저희가 먼저 연락드리겠습니다.

의존성 부패 방지

솔직히 잘 와닿지는 않는다.

템플릿 메서드 패턴 → API 프레임워크에 쓰이는 도구, 의존하다? 패턴이 꼭 책과 동일하지는 않다

sort(), paint(), subList(), compareTo()

&nbsp;

## 09 반복자 패턴과 컴포지트 패턴 | 컬렉션 잘 관리하기
컬렉션에 접근하는 방법

메뉴 합병 → 배열, ArrayList

- printMenu()
- printBreakfastMenu()
- printLunchMenu()
- printVegetarianMenu()
- isItemVegeterian(name)

반복을 캡슐화하기 ← 바뀌는 부분을 캡슐화하자

Iterator 객체 → next()

배열, 리스트, 해시테이블 모든 종류의 객체 컬렉션에 반복자를 구현 가능

💡 **반복자 패턴** : 컬렉션의 구현 방법을 노출하지 않으면서 집합체 내의 모든 항목에 접근하는 방법을 제공합니다.

⇒ 어떤 클래스가 바뀌는 이유는 하나 뿐이어야 한다.

지키기 위해서 디자인을 열심히 살펴보고, 점검하기

향상된 for 순환문 ⇒ but 배열은 컬렉션이 아님..

Iterable, Iterator, 반복자 패턴

3번이나 호출해야 하는 문제 → 한꺼번에 관리할 수 있는 방법 필요

서브 메뉴 추가 → 리팩터링 준비하기

💡 **컴포지트 패턴** : 객체를 트리 구조로 구성해서 부분-전체 계층 구조를 구현합니다. 컴포지트 패턴을 이용하면 클라이언트에서 개별 객체와 복합 객체를 똑같은 방법으로 다룰 수 있습니다.

복합 객체와 개별 객체를 대상으로 똑같은 작업을 적용할 수 있다.

복합 객체는 잎과 복합 노드 모두에서 쓰이는 인터페이스 역할을 한다.

UnsupportedOperationException

메뉴에서 print() 메서드 → 재귀적인 방법으로 출력하는 코드로 수정

&nbsp;

## 10 상태 패턴 | 객체의 상태 바꾸기
최첨단 뽑기 기계 → 상태와 행동이 있다.

- 상태들 모으기
- 각 상태의 값을 정의 (인스턴스 변수로)
- 일어날 수 있는 행동 모으기
- 상태 기계 역할을 하는 클래스 만들기

WINNERR 상태 추가 (당첨 후 2개 뽑음), 상태별 행동을 별도의 클래스에 넣기, State 인터페이스 구현

💡 **상태 패턴** : 상태 패턴을 사용하면 객체의 내부 상태가 바뀜에 따라서 객체의 행동을 바꿀 수 있습니다. 마치 객체의 클래스가 바뀌는 것과 같은 결과를 얻을 수 있습니다.

다이어그램은 같지만 상태 패턴(알아서 행동)과 전략 패턴(행동과 알고리즘 설정)은 다르다

정상성 점검 : 체크해야 할 몇 가지들

각 상태를 클래스로 표현, Context 객체는 현태 상태에게 행동을 위임

&nbsp;

## 11 프록시 패턴 | 객체 접근 제어하기
proxy, 대변하는 객체??

재고와 현재 상태를 알려주는 기능 + 위치

원격 모니터링, 원격 프록시?

프록시 : 진짜 객체를 대신하는 역할

원격 프록시 : 원격 객체의 로컬 대변자 역할 → 자바에 내장되어 있다.

<RMI (원격 메서드 호출) 기초>

클라이언트 객체 → 클라이언트 보조 객체 (RMI 스텁) → 서비스 보조 객체 (RMI 스켈레톤) → 서비스 객체

1. 원격 인터페이스 만들기 (호출할 원격 메서드를 정의)
2. 서비스 구현 클래스 만들기 (실제 작업을 처리하는 메서드)
3. RMI 레지스트리 실행하기 (전화번호부와 비슷, 이 레지스트리로 프록시 받아감)
4. 원격 서비스 실행하기

→ 클라이언트는 룩업(lookup)으로 스텁 객체를 요청합니다.

💡 **프록시 패턴** : 특정 객체로의 접근을 제어하는 대리인(특정 객체를 대변하는 객체)을 제공합니다.


원격 프록시 → 다른 JVM에 들어있는 객체의 대리인에 해당하는 로컬 객체

가상 프록시 → 생성하는데 많은 비용이 드는 객체를 대신

동적 프록시 → 패키지 사용, 실행 중에 생성

보호 프록시 → 접근 권한을 바탕으로 객체로의 접근을 제어하는 프록시 (핸들러 사용)

&nbsp;

## 12 복합 패턴 | 패턴을 모아 패턴 만들기
패턴 섞어 쓰기 MVC(모델-뷰-컨트롤러)

오리 시뮬레이션 게임 → 다양한 패턴 적용하기

→ 오리 클래스 (인터페이스) → 거위 클래스 (어댑터) → 꽥꽥 소리를 낸 횟수 (데코레이터)

→ 오리 객체 생성 한번에 (팩토리) → 관리 한번에 (컴포지트) → 1마리씩 실시간 추적 (옵저버)

안정성 vs 투명성 → 적당히 조절

💡 **Model-View-Controller** : 클라이언트→컨트롤러→모델→뷰


- 모델 → 비트 관리 : 옵저버 패턴 사용
- 뷰 → 모델용 뷰 (현재 BPM과 비트 막대 표시) : 컴포지트 패턴 사용 (버튼), 인터페이스 제어용 뷰 (BPM 입력, BPM 조절)
- 컨트롤러 → 뷰에 쓰이는 전략 (start, stop, BPM 조절) : 전략 패턴 사용

&nbsp;

## 13 실전 디자인 패턴 | 패턴과 행복하게 살아가기
적절한 시점

패턴 : 특정 컨텍스트 내에서 주어진 문제의 해결책

but 패턴은 반복적으로 등장하는 문제에 적용 가능해야 함, 공유할 수 있어야 함, 이름이 있어야 함

새로운 디자인 패턴 발견하기 → 많이 심사숙고 해라

<디자인 패턴 분류하기>

생성 → 객체 인스턴스를 생성하는 패턴

행동 → 클래스와 객체들이 상호작용하는 방법과 역할 분담을 다루는 패턴

구조 → 더 큰 구조로 만들 수 있게 구상을 사용하는 패턴

클래스 → 클래스 사이의 관계 다룸

객체 → 객체 사이의 관계 다룸

💡 **안티 패턴** : 어떤 문제의 나쁜 해결책에 이르는 길을 알려준다

**※** 최대한 단순하게 하자, 변경을 예측해보자, 적재적소에 쓰자
