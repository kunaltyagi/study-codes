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
        array =  new Item[M+1];
        key = "ThhCFXjWLL1ZFj";
        seed = 2097593 + (int)System.currentTimeMillis();
        table = new HashTable(key, seed, M);
        for(int i = 0; i < M; ++i)  {
            array[i] = new Item(0, "empty", 0);
        }
    }
    
    public boolean add(Item newItem)   {
        if(size >= M)   {
            return false;
        }
        int index = search(newItem);
        if(index == -1 || array[index].getAmount() == 0)    {
            size++;
            array[table.arrayIndex(M)] = newItem;
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
        //System.out.println(index);
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
        return index;
    }
    
    public boolean remove(Item newItem) {
        newItem.setAmount(-1*newItem.getAmount());
        return add(newItem);
    }
    
    public Item getElement(int index)   {
        if (index < 0 || index > M)
            return new Item(0,"Not found", 0);
        return array[index];
    }
    
    public int size()   {
        return size;
    }
    
    public void print() {
        for(int i = 0; i < M; ++i)  {
            System.out.print(array[i].getId());
            System.out.println(array[i].getAmount());
        }
    }
    
}
