package wk4_template.api;

public abstract class AbstractDisplay {
    public abstract void open(); // 하위 클래스에서 구현
    public abstract void close();
    public abstract void print();

    public final void display(){ // 추상 클래스에서 구
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
        System.out.println();
    }
}
