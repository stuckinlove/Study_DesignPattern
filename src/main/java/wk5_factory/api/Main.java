package wk5_factory.api;

import wk5_factory.api.framework.Factory;
import wk5_factory.api.framework.Product;
import wk5_factory.api.idcard.IdCard;
import wk5_factory.api.idcard.IdCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product louis_card = factory.create("Louis");
        Product julia_card = factory.create("Julia");

        louis_card.use();
        julia_card.use();

    }
}
