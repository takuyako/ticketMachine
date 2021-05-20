public class SideProduct extends Product {

    public Product setPrice(Product cartProduct) {
        return cartProduct;
    }
    
    public SideProduct(String name, int price){
        super(name, price);
    }
}
