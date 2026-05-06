package CityPublicLibrary;

public class Library {

    public static final String LIBRARY_NAME = "City Public Library";
    private static final int MAX_ITEMS = 100;
    private static final int MAX_MEMBERS = 50;


    private LibraryItem[] items;
    private Member[] members;
    private int itemCount = 0;
    private int memberCount = 0;

    public Library() {
        items = new LibraryItem[MAX_ITEMS];
        members = new Member[MAX_MEMBERS];
    }

    public boolean addItem(LibraryItem item) {
        if (item == null || itemCount >= MAX_ITEMS) return false;
        items[itemCount++] = item;
        return true;
    }

    public boolean addMember(Member member) {
        if (member == null || memberCount >= MAX_MEMBERS) return
                false;
        members[memberCount++] = member;
        return true;
    }

    private LibraryItem findItem(String itemId) {
        for (int i = 0; i < itemCount; i++)
            if (items[i].itemId.equals(itemId)) return items[i];
        return null;
    }

    private Member findMember(String memberId) {
        for (int i = 0; i < memberCount; i++)
            if (members[i].getMemberId().equals(memberId)) return members[i];
        return null;
    }


    public void checkOutItem(String itemId, String memberId) {
        LibraryItem item = findItem(itemId);
        Member member = findMember(memberId);

        if (item == null) {
            System.out.println("Item not found: " + itemId);
            return;
        }
        if (member == null) {
            System.out.println("Member not found: " + memberId);
            return;
        }

        if (!item.isAvailable()) {
            System.out.println("'" + item.title + "' is already checked out.");
            return;
        }
        if (member.borrowItem(itemId)) {
            item.checkOut();
            System.out.println(member.getName() + " checked out '" + item.title + "'");
        }

    }



    public void returnItem(String itemId, String memberId) {
        LibraryItem item   = findItem(itemId);
        Member       member = findMember(memberId);
        if (item == null || member == null) {
            System.out.println("Return failed."); return; }
        member.returnItem(itemId);
        item.returnItem();
        System.out.println(member.getName() + " returned '" +
                item.title + "'");
    }


    public void listAllItems() {
        System.out.println("\n=== " + LIBRARY_NAME + " Catalogue ===");
        for (int i = 0; i < itemCount; i++)
            System.out.println(items[i].getItemInfo());
        System.out.println("");
    }





}