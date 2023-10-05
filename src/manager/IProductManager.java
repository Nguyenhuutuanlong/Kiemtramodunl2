package manager;

import model.Product;

import java.util.ArrayList;

public abstract class IProductManager<P> {
    public abstract void add(Product product);

    public abstract void update(int id, Product product);

    public abstract void remove(int id);

    public abstract ArrayList<Product> finAll();

    public abstract ArrayList<Product> searchName(String name);

    public abstract ArrayList<Product> searchId(int id);

    public abstract int findById(int id);

    public abstract ArrayList<Product> searchProductType(String productType);


}