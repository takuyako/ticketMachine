import java.util.ArrayList;

public class CartList {
    ArrayList<Product> cartList = new ArrayList<>();;
    Product product;
    Product cartProduct;
    private int totalPrice;

    public void addCart(Product product) {

        Product cartProduct = product.clone();
        cartProduct.setPrice(cartProduct);
        cartList.add(cartProduct);

        for(Product cartP : cartList){
            System.out.println(cartP.getName() + " " + cartP.getPrice());
        }
    }

    public int showTotalPrice() {
        int sum = 0;
        for (Product cartProduct : cartList) {
            sum += cartProduct.getPrice();
        }
        System.out.println(sum);
        totalPrice = sum;
        return sum;
    }

    public int getTotalPrice(){
        return this.totalPrice;
    }
}
