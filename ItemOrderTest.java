public class ItemOrderTest{
    public static void main(String[] args){
        Order ord = new Order("Anthony");
        Item cof = new Item("Coffee", 1.50);
        Item bag = new Item("Bagel", 3.75);
        Item oj = new Item("Orange Juice", 1.00);

        System.out.println("---TEST 1---");
        ord.addItem(cof);
        ord.addItem(bag);
        ord.addItem(oj);
        ord.display();

        System.out.println("---TEST 2---");
        System.out.println(ord.getStatusMessage());
        ord.setReady();
        System.out.println(ord.getStatusMessage());

        System.out.println("---TEST 3---");
        System.out.println(ord.getOrderTotal());
    }
}