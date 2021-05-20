import java.util.ArrayList;

public class ProductList {
    ArrayList<Product> productList;

    public void showAllList() {
        for(Product pd : productList){
        System.out.println(pd.name + " " + pd.price);
        }
    }

    public void showMainList() {
        for(Product pd : productList){
            if(pd instanceof MainProduct){
                System.out.println(pd.name + " " + pd.price);
            }
        }
    }

    public void showSideList() {
        for(Product pd : productList){
            if(pd instanceof SideProduct){
                System.out.println(pd.name + " " + pd.price);
            }
        }
    }

    public Product getProduct(int number){
        return productList.get(number);
    }

    public ProductList(){
        productList = new ArrayList<>();
        productList.add(new MainProduct("牛丼", 380));
        productList.add(new MainProduct("豚丼", 400));
        productList.add(new MainProduct("カレー", 450));
        productList.add(new SideProduct("ポテトサラダ", 200));
        productList.add(new SideProduct("グリーンサラダ", 150));
        productList.add(new SideProduct("味噌汁", 50));
        productList.add(new SideProduct("豚汁", 150));
    }
}
