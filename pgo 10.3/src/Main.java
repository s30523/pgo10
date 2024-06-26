import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items=new ArrayList<>();
        items.add(new Item(1,"Telephone"));
        items.add(new Item(2,"Computer"));
        items.add(new Item(3,"Headphones"));
        items.add(new Item(4,"TV"));
        items.add(new Item(5,"Tablet"));
        items.add(new Item(6,"Brush"));
        items.add(new Item(7,"Rug"));
        items.add(new Item(8,"Shirt"));
        items.add(new Item(9,"Laptop"));
        items.add(new Item(10,"Blanket"));

        List<Item> firstFiveItems= items.subList(0,5);
        Set<Item> itemSet = new HashSet<>(firstFiveItems);

        for(Item item:itemSet){
            System.out.println("ID: "+ item.getId()+ "name: "+item.getName());
        }
    }
}