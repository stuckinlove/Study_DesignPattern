package wk3_adapter.ex2;

import wk3_adapter.common.Banner;

/**
 * Adapterの役割
 */
public class PrintBanner extends Print{
    private Banner banner;

    public PrintBanner(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        System.out.println("[printWeak Start]");
        banner.showWithParen();
        System.out.println("[printWeak END]");
    }

    @Override
    public void printStrong() {
        System.out.println("[printWeak Start]");
        banner.showWithAster();
        System.out.println("[printWeak END]");
    }
}
