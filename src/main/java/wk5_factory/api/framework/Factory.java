package wk5_factory.api.framework;

public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        regitsterProduct(p);
        return p;
    };
    protected abstract Product createProduct(String owner);
    protected abstract void regitsterProduct(Product product);
}
