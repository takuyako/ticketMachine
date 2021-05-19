import java.util.ArrayList;

public class CartList {
    ArrayList<Product> cartList = new ArrayList<>();;
    Product product;
    Product cartProduct;
    int totalPrice;

    public void addCart(Product product) {
        Size size = new Size();
        Product cartProduct = product.clone();
        cartList.add(cartProduct);

        if (cartProduct.name.equals("牛丼") || cartProduct.name.equals("豚丼") || cartProduct.name.equals("カレー")) {
            size.changePrice(cartProduct);
        }
        System.out.println(cartProduct.name + " " + cartProduct.price);
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

    // public CartList(){
    // ArrayList<Product> cartList = new ArrayList<>();
    // }

}
