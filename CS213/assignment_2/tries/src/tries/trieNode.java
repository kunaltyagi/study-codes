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
        /*
        System.out.println("Root mode selected");
         */
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
        /*
        System.out.print("$ Creating normal Node: ");
        System.out.println(_char);
         */
    }
    
    public boolean isWord() {
        return _isWord;
    }
    
    public void setWordType(boolean type) {
        _isWord = type;
    }
    
    public boolean add(trieNode newTrieNode) {
        /*
        System.out.print("$ Adding new Node to ");
        System.out.println(_char);
         */
        return _child.add(newTrieNode);
    }
    
    public boolean add(String word) {
        /*
        System.out.print("$ To Node ");
        System.out.print(_char);
        System.out.print(", adding new word: ");
        System.out.println(word);
        */
        /*
        System.out.println(_char != '~' && (word.charAt(0) == _char || _child.isEmpty()));
        System.out.println(_char == ' ');
         */
        if(_char != '~' && (word.charAt(0) == _char || _child.isEmpty())) {
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
                    if(i+1 == _child.size()) {
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
                if(i+1 == _child.size()) {
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
        /*
        System.out.println("Creating root ...");
         */
        _child.add(new trieNode("~"));
        /*
        System.out.println("$ successful");
         */
    }
    
    public int search(String prefix) {
        if(prefix.length() == 1) {
            return this.numberOfChildren();
        }
        else {
            for(int i = 0; i < this.numberOfChildren(); ++i) {
                if(_child.get(i)._char == prefix.charAt(0)) {
                    return _child.get(i).search(prefix.substring(1));
                }
                else if(i >= this.numberOfChildren()) {
                    return 0;
                }
                else {
                    continue;
                }
            }
            return 0;
        }
    }
    
    public void print() {
        int depth = 0;
        System.out.print(_char);
        for(int i = 0; i < _child.size(); ++i) {
            _child.get(i).print(depth+1);
        }
    }
    
    public void print(int depth) {
        for(int i = 0; i < depth; ++i) {
            System.out.print('\t');
        }
        System.out.println(_char);
        for(int i = 0; i < _child.size(); ++i) {
            _child.get(i).print(depth+1);
        }
    }
    
}
