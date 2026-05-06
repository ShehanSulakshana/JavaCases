package CityPublicLibrary;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        // Add items
        lib.addItem(new Book("B001","Clean Code", 2008, "Robert C. Martin","978-0132",464));
        lib.addItem(new Book("B002","Head First Java",2003, "Kathy Sierra",    "978-0596",688));
        lib.addItem(new Book("B003","Effective Java",2018, "Joshua Bloch",    "978-0134",412));
        lib.addItem(new Magazine("M001","Tech Today",2024, 12, "TechPress"));
        lib.addItem(new Magazine("M002","Dev World", 2024, 5, "CodeMedia"));


        Member m1 = new Member("MEM001", "Alice", "alice@mail.com");
        Member m2 = new Member("MEM002", "Bob");
        lib.addMember(m1);
        lib.addMember(m2);

        lib.listAllItems();


        lib.checkOutItem("B001", "MEM001");
        lib.checkOutItem("M001", "MEM001");
        lib.checkOutItem("B001", "MEM002");

        lib.listAllItems();

        lib.returnItem("B001", "MEM001");
        lib.checkOutItem("B001", "MEM002");

        System.out.println("\nTotal members registered: " + Member.getMemberCount());
        m1.displayMember();
    }
}