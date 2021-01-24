package wk4_template.api;

public class CharDisplay extends AbstractDisplay {
    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    /**
     * 문자열 << 를 표시한다.
     */
    @Override
    public void open() {
        System.out.print("<<");
    }

    /**
     * 문자열  >> 를 표시한다.
     */
    @Override
    public void close() {
        System.out.print(">>");
    }

    /**
     * 문자열을 출력한다.
     */
    @Override
    public void print() {
        System.out.print(this.ch);
    }
}
