package wk3_adapter.ex1;

/**
 * 継承を使ったAdapterパターン
 */
public class AdapterMain1 {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello"); // Print Interface
        p.printWeak();
        p.printStrong();
    }
}
