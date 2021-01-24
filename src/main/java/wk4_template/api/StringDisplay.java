package wk4_template.api;

public class StringDisplay extends AbstractDisplay {
    private String str;
    private Integer strWidth;
    public StringDisplay(String str) {
        this.str = str;
        this.strWidth = str.length();
    }

    /**
     * 문자열 +-----+ 를 출력한다.
     */
    @Override
    public void open() {
        printLint();
    }

    /**
     * 문자열 +-----+ 를 출력한다.
     */
    @Override
    public void close() {
        printLint();
    }

    private void printLint() {
        System.out.print("+");
        for (int i = 0; i < strWidth; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    /**
     * 생성자에서 주어진 문자열을 :문자열: 형태로 출력한다.
     */
    @Override
    public void print() {
        System.out.println(":" + this.str + ":");
    }
}
