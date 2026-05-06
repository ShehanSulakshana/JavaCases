public class Weapon extends Item{


    private int damage;
    private String weaponType;


    Weapon(String name ,int quantity , int damage , String weaponType ){
        super(quantity, name);
        this.damage = damage;
        this.weaponType =weaponType;
    }


    @Override
    void displayInfo(){
        System.out.println("Weapon : " + this.getName()
                + " | Quantity : "+ this.getQuantity()
                + " | Damage : "+this.damage
                + " | Type : " + this.weaponType
        );

    }





}
