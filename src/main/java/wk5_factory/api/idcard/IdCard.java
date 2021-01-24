package wk5_factory.api.idcard;

import wk5_factory.api.framework.Product;

public class IdCard extends Product {
    private String owner;
    public IdCard(String owner) {
        System.out.println("owner의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this.owner + "의 카드를 사용합니다.");
    }

    public String getOwner(){
        return this.owner;
    }
}
