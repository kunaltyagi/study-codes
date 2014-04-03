package tries;

import java.util.ArrayList;

/**
 *
 * @author kunaltyagi
 */
public class trieNode {
    private char _char;
    private ArrayList<trieNode> _child;
    private boolean _isWord;
    
    public trieNode() {
        _char = ' ';
        _child = new ArrayList<trieNode>(0);
        _isWord = false;
    }
    
    public trieNode(String word) {
        _char = ' ';
        _child = new ArrayList<trieNode>(1);
        _child.add(new trieNode(word.substring(1)));
        if (word.length() == 1) {
            _isWord = true;
        }
        else {
            _isWord = false;
        }
    }
    
    public boolean isWord() {
        return _isWord;
    }
    
    public void setWordType(boolean type) {
        _isWord = type;
    }
    
    public boolean add(trieNode newTrieNode) {
        return _child.add(newTrieNode);
    }
    
    public int numberOfChildren() {
        return _child.size();
    }
    
}
