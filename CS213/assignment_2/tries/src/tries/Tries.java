package tries;

/**
 *
 * @author kunaltyagi
 */
public class Tries {
    private trieNode root;
   
    /**
     * @param args the command line arguments
     */
    public Tries() {
        root = new trieNode();
        root.makeRoot();
    }
    
    public boolean add(String word) {
        return root.add(word);
    }
    
    public void print() {        
        root.print();    
    }
    
    public int prefixChildren(String prefix) {
        return root.search(prefix);
    }
}
