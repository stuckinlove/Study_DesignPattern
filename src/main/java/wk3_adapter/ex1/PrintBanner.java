package wk3_adapter.ex1;

import wk3_adapter.common.Banner;

/**
 * Adapterの役割
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        System.out.println("[printWeak Start]");
        showWithParen();
        System.out.println("[printWeak End]");
    }

    @Override
    public void printStrong() {
        System.out.println("[printStrong Start]");
        showWithAster();
        System.out.println("[printStrong End]");
    }
}
