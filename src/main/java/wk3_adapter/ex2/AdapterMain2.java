package wk3_adapter.ex2;

/**
 * 委任を利用したAdapterパターン
 */
public class AdapterMain2 {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
