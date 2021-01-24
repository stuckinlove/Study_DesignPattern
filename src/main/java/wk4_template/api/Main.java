package wk4_template.api;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay ad_c = new CharDisplay('A');
        AbstractDisplay ad_s1 = new StringDisplay("A");
        AbstractDisplay ad_s2 = new StringDisplay("Template Method Pattern");

        ad_c.display();
        ad_s1.display();
        ad_s2.display();

    }
}
