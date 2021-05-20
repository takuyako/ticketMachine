import java.util.Scanner;

public class MainProduct extends Product  {
    Scanner sc = new Scanner(System.in);


    public Product setPrice(Product cartProduct) {
        boolean okFlag = false;
        while (!(okFlag)) {
            System.out.println("サイズはどれですか？");
            String size = sc.next();
            if (size.equals("S")) {
                cartProduct.price -= 50;
                cartProduct.name += "S";
                okFlag = true;
            } else if (size.equals("L")) {
                cartProduct.price += 100;
                cartProduct.name += "L";
                okFlag = true;
            } else if (size.equals("M")) {
                cartProduct.name += "M";
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
