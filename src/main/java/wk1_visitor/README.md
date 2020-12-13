# Visitor Pattern

알고리즘을 객체구조에서 분리시키는 디자인패턴이다.
구조를 수정하지 않고도 새로운 동작을 기존 객체에 추가하기 쉽다.
개방폐쇄원칙을 적용한 패턴.

결국 서로 호출하는 것.
Visitor.visit(Element e)
Element.accept(Visitor v)

N:M(다대다)의 의존관계이기 때문에 주의가 필요하다.

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

 


  




