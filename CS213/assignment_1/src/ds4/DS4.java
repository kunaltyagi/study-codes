package ds4;

/**
 *
 * @author kunaltyagi
 */
public class DS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DLArray store = new DLArray();
        Item temp = new Item();
        temp.setName("Bournvita");
        temp.setId(189);
        store.add(temp);
        store.print();
        System.out.println(store.search(temp));
        System.out.println(store.getElement(store.search(temp)).getId());
    }
}
