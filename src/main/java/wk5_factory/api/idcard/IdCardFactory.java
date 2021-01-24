package wk5_factory.api.idcard;

import wk5_factory.api.framework.Factory;
import wk5_factory.api.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void regitsterProduct(Product product) {
        owners.add(((IdCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
