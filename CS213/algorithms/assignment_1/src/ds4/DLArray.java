/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds4;

/**
 *
 * @author kunaltyagi
 */
public class DLArray {
    private int size = 0;
    private String Data;
    private int M;
    private int N;
    private Item[] array;
    private HashTable table;
    private String key;
    private int seed;
    
    public DLArray()    {
        Data = "";
        M = 3571;
        N = 2897;
        size = 0;
        array =  new Item[M];
        key = "ThhCFXjWLL1ZFj";
        seed = 2097593 + (int)System.currentTimeMillis();
        table = new HashTable(key, seed, M);
    }
    
    public boolean add(Item newItem)   {
        if(size >= M)   {
            return false;
        }
        int index = search(newItem);
        if(index == -1 && array[index].getAmount() == 0)    {
            size++;
            array[index] = newItem;
            return true;
        }
        else if (index > -1)    {
            array[index].setAmount(array[index].getAmount()+newItem.getAmount());
            if(array[index].getAmount() < 0)    {
                array[index].setAmount(0);
                // wrong entry btw
            }
            return true;
        }
        return false;
    }
    
    public int search(Item checkItem)   {
        int index = 0, i=0, secondIndex = 0;
        table.hashify(checkItem);
        index = table.arrayIndex(M);
        if(array[index].getAmount() != 0)
        {
            if(array[index].getId() == checkItem.getId()) {
                return index;
            }
            secondIndex = table.arrayIndex(N);
            while(array[index].getAmount() != 0)    {
                i++;
                if(i==M)    {
                    return -1;
                }
                index = index + i*secondIndex;
                while (index >= M) {
                    index = M - index;
                }
                if(array[index].getId() == checkItem.getId()) {
                    return index;
                }
            }            
        }
        return -1;
    }
    
    public boolean remove(Item newItem) {
        newItem.setAmount(-1*newItem.getAmount());
        return add(newItem);
    }
    
    public int size()   {
        return size;
    }
    
}
