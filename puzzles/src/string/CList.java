/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.ArrayList;

/**
 *
 * @author kunaltyagi
 */
public class CList {
    private ArrayList<Connection> _list;
    
    public CList()
    {
        _list = new ArrayList<Connection>();
    }
    public CList(ArrayList<Connection> newList)
    {
        _list = newList;
    }
    public void add(Connection newConnection)
    {
        _list.add(newConnection);
    }
    public void remove(Connection oldConnection)
    {
        _list.remove(oldConnection);
    }
    public boolean search(Connection findConnection)
    {
        return false;
    }
    public int inConnections(Field inCell)
    {
        return 0;
    }
    public int outConnections(Field outCell)
    {
        return 0;
    }
}
