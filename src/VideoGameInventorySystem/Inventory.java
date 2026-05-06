import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> itemArrayList;

    void addItem(Item item){
        itemArrayList.add(item);
    }

    void showAllItems(){
        for(Item i: itemArrayList){
            i.displayInfo();
        }
    }

    void addItem(String name, int quantity, int damage, String weaponType){
        Item weaponItem = new Weapon(name, quantity, damage, weaponType);
        itemArrayList.add(weaponItem);
    }
}
