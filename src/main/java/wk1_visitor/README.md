# Visitor Pattern

Visitor패턴에서는 데이터 구조와 처리를 분리한다.
다시 말하면, 데이터 구조와 (그 데이터 구조를 방문하는)방문자로 나눈다.
이후 소스엫서는 데이터 구조는 element, 방문자는 visitor로 작성한다. 

결국 서로 호출하는 것.
Visitor.visit(Element e)
Element.accept(Visitor v)

N:M(다대다)의 의존관계임을 주의

## 클래스 다이어 그램
TODO 이미지로 넣을 것

## 클래스와 인터페이스 종류
이름 해설
VisitorMain 동작용 메인 클래스
AbVisitor 파일과 디렉토리를 방문하는 방문자를 나타내는 추상 클래스
IElement Visitor 클래스의 생성자를 받아들이는 데이터 구조를 나타내는 인터페이스
AbElementImpl File과 Directory의 상위 클라스가 되는 추상 클래
ListVisitor AbVisitor의 하위 클래스
File 파일클래스
Director 디렉토리클래스
FileTreatmentException 예외 처리 클래스

## +Double Dispatch?

 


  




