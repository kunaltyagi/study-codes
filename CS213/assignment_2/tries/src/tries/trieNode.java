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
        // root mode, will have only children
        _char = ' ';
        _child = new ArrayList<trieNode>(0);
        _isWord = false;
    }
    
    public trieNode(String word) {
        _child = new ArrayList<trieNode>(1);
        _char = word.charAt(0);
        if (word.length() == 1) {
            _isWord = true;
        }
        else {
            _isWord = false;
        }
        if(_isWord == false) {
            _child.add(new trieNode(word.substring(1)));
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
    
    public boolean add(String word) {
        if(word.charAt(0) == _char || _child.isEmpty()) {
            _char = word.charAt(0); // in case of isEmpty() being true
            if (word.length() == 1) {
                _isWord = true;
            }
            else {
                _isWord = false;
            }
            if(_isWord == false) {
                for(int i = 0; i < _child.size(); ++i) {
                    if (_child.get(i).add(word.substring(1))) {
                        break;
                    }
                    if(i == _child.size()) {
                        _child.add(new trieNode(word.substring(1)));
                    }
                }
            }
            return true;
        }
        else if(_char == ' ') {
            // root mode, add children
            for(int i = 0; i < _child.size(); ++i) {
                if (_child.get(i).add(word)) {
                    break;
                }
                if(i == _child.size()) {
                    _child.add(new trieNode(word));
                }
            }
            return true;
        }
        return false;
    }
    
    public int numberOfChildren() {
        return _child.size();
    }
    
    public char getChar() {
        return _char;
    }
    
    public void makeRoot() {
        _child.add(new trieNode("~private"));
    }
    
}
