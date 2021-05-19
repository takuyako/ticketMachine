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
            if(pd.name.equals("牛丼") || pd.name.equals("豚丼") || pd.name.equals("カレー")){
                System.out.println(pd.name + " " + pd.price);
            }
        }
    }

    public void showSideList() {
        for(Product pd : productList){
            if(pd.name.equals("ポテトサラダ") || pd.name.equals("グリーンサラダ") || pd.name.equals("味噌汁") || pd.name.equals("豚汁")){
                System.out.println(pd.name + " " + pd.price);
            }
        }
    }

    public Product getProduct(int number){
        return productList.get(number);
    }

    public ProductList(){
        productList = new ArrayList<>();
        productList.add(new Product("牛丼", 380));
        productList.add(new Product("豚丼", 400));
        productList.add(new Product("カレー", 450));
        productList.add(new Product("ポテトサラダ", 200));
        productList.add(new Product("グリーンサラダ", 150));
        productList.add(new Product("味噌汁", 50));
        productList.add(new Product("豚汁", 150));
    }
}
