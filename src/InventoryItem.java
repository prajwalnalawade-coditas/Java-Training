public class InventoryItem {
    static int totalItems;
    String itemName;
     int quantity;
    InventoryItem(String itemName,int quantity){
       this.itemName=itemName;
       this.quantity=quantity;
        totalItems=totalItems+quantity;
    }
    static int totalItems() {
        return totalItems;
    }
    int addToInventory(int i){
           totalItems=totalItems() + i;
           quantity=quantity+i;
          // System.out.println("totatm"+totalItems);
            return totalItems;

    }
    int removeFromInventory(int i){
         totalItems =totalItems-i;
        //System.out.println("totatm"+totalItems);
          return totalItems;

    }

}
class item{
    public static void main(String[] args) {
        InventoryItem A = new InventoryItem("pen", 13);
        A.addToInventory(3);
        System.out.println("Total items after adding:" + InventoryItem.totalItems);
        InventoryItem B = new InventoryItem("pencil", 13);
        B.addToInventory(3);
        System.out.println("Total items after adding diff item:" + InventoryItem.totalItems);
        A.removeFromInventory(3);
        System.out.println("Total items after removing :" + InventoryItem.totalItems);
    }}
//
