/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tries;

/**
 *
 * @author kunaltyagi
 */
public class Tries {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // init trie
        trieNode root = new trieNode();
        root.makeRoot();
        
        //get input, via function call, most likely
        String word="celebration";
        root.add(word);
        word="celebrating";
        root.add(word);
        word="celebrate";
        root.add(word);
        word="cerebrum";
        root.add(word);
        
        root.print();    
    }
}
