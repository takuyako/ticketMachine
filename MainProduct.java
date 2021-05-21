import java.util.Scanner;

public class MainProduct extends Product  {
    Scanner sc = new Scanner(System.in);


    public Product setPrice(Product cartProduct) {
        boolean okFlag = false;
        while (!(okFlag)) {
            System.out.println("サイズはどれですか？");
            String size = sc.next();
            if (size.equals("S")) {
                int cartProductPrice = cartProduct.getPrice() - 50;
                cartProduct.setPrice(cartProductPrice);
                String cartProductName = cartProduct.getName() + "S";
                cartProduct.setName(cartProductName);
                okFlag = true;
            } else if (size.equals("L")) {
                int cartProductPrice = cartProduct.getPrice() + 100;
                cartProduct.setPrice(cartProductPrice);
                String cartProductName = cartProduct.getName() + "L";
                cartProduct.setName(cartProductName);
                okFlag = true;
            } else if (size.equals("M")) {
                String cartProductName = cartProduct.getName() + "M";
                cartProduct.setName(cartProductName);
                okFlag = true;
            } else {
                System.out.println("もう一度入力してください");
            }
        }
        return cartProduct;
    }

    public MainProduct(String name, int price){
        super(name, price);
    }
}
