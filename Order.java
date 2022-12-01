import java.util.ArrayList;

public class Order {
    // attributes
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // constructors
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // methods
    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }
        return "Thank you for waiting. Your order will be soon.";
    }
    public double getOrderTotal(){
        double total = 0;
        for(Item item : this.items){
            total += item.getPrice();
        }
        return total;
    }
    public void display(){
        StringBuilder sb = new StringBuilder("Customer Name: ");
        sb.append(this.name).append("\n");
        for(Item item : this.items){
            sb.append(item.getName()).append(" - ").append(item.getPrice()).append("\n");
        }
        System.out.println(sb);
    }

    // getters & setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setReady(){
        this.ready = !ready;
    }
}