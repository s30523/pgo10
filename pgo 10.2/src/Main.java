import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items=new ArrayList<>();
        items.add(new Item(1,"Telephone"));
        items.add(new Item(2,"Computer"));
        items.add(new Item(3,"Headphones"));
        items.add(new Item(4,"TV"));
        items.add(new Item(5,"Tablet"));

        for(int i = 0; i < items.size(); i++){
            items.get(i).show();
        }

        HashMap<Integer,String> itemMap = new HashMap<>();
        for(Item item: items){
            itemMap.put(item.getId(), item.getName());
        }
        for(Map.Entry<Integer,String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + "," + " Name: " + entry.getValue());
        }







    }
}