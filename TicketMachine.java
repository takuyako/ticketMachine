public class TicketMachine {
    static ProductList productList;
    CartList cartList;

    public void showAllList() {
        productList.showAllList();
    }

    public void showMainList() {
        productList.showMainList();
    }

    public void showSideList() {
        productList.showSideList();
    }

    public void addCart(Product product) {
        cartList.addCart(product);
    }

    public int showTotalPrice(){
        int totalPrice = cartList.showTotalPrice();
        return totalPrice;
    }

    public int payMoney(int payment) {
        int change = payment - cartList.totalPrice;
        System.out.println(change);
        return change;
    }

    public TicketMachine(){
        productList = new ProductList();
        cartList = new CartList();
    }

    // int totalPrice = cartList.showTotalPrice();
    // ticketMachine.payMoney(1000, totalPrice);

    public static void main(String[] args){
        TicketMachine tm = new TicketMachine();
        tm.showAllList();
        tm.showMainList();
        tm.showSideList();
        Product product1 = productList.getProduct(0);
        Product product2 = productList.getProduct(4);
        tm.addCart(product1);
        tm.addCart(product2);
        tm.showTotalPrice();
        tm.payMoney(1000);
    }

}