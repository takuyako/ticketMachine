import java.util.ArrayList;

public class CartList {
    ArrayList<Product> cartList = new ArrayList<>();;
    Product product;
    Product cartProduct;
    int totalPrice;

    public void addCart(Product product) {

        Product cartProduct = product.clone();
        cartProduct.setPrice(cartProduct);
        cartList.add(cartProduct);

        for(Product cartP : cartList){
            System.out.println(cartP.name + " " + cartP.price);
        }
    }

    public int showTotalPrice() {
        int sum = 0;
        for (Product cartProduct : cartList) {
            sum += cartProduct.price;
        }
        System.out.println(sum);
        totalPrice = sum;
        return sum;
    }

}
