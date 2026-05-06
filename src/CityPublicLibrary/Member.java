package CityPublicLibrary;

import java.util.ArrayList;

public class Member {

    public static final int MAX_BORROW_LIMIT = 5;
    public static int memberCount = 0;

    private final String memberId;
    private String name;
    private String email;
    private ArrayList<String> borrowedItems;

    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        setName(name);
        this.email = (email != null) ? email : "Not provided";
        borrowedItems = new ArrayList<String>();
        memberCount++;
    }

    public Member(String memberId, String name) {
        this(memberId , name , "Not Provided");
    }


    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be blank.");
        this.name = name;
    }


    boolean borrowItem(String itemId){
        if (borrowedItems.size() < MAX_BORROW_LIMIT){
            borrowedItems.add(itemId);
            return true;
        }else{
            System.out.println("You have reached max borrow limit.");
            return false;
        }
    }

    void returnItem(String itemId){
        borrowedItems.remove(itemId);
    }

    void displayMember(){
        System.out.println("Member Id: " + memberId + " | Name: " + this.name + " | Email: " + this.email );
        System.out.println("Borrowed Item List : ");
        for(String i : borrowedItems){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static int getMemberCount(){
        return memberCount;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}