public abstract class Product implements Cloneable {
    String name;
    int price;
    Product cartProduct;

    public abstract Product setPrice(Product cartProduct);

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public Product clone() {
        Product product = null;
        // CloneNotSupportedExceptionを返す可能性があるので例外処理が必要
        try {
            // Object型で返ってくるのでキャストが必要
            product = (Product)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
