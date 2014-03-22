/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author kunaltyagi
 */
public class Field {
    private int _value;
    private int _connectionsIn, _connectionsOut;
    private int _state;
    
    public Field()
    {
        _value = 0;
        _state = 0;
        _connectionsIn = _connectionsOut = 0;
    }
    public Field(int value, int connectionsOut, int connectionsIn)
    {
        _value = value;
        _state = 0;
        _connectionsIn = connectionsIn;
        _connectionsOut = connectionsOut;
    }
    public Field(int value, int connectionsOut, int connectionsIn, int state)
    {
        _value = value;
        _connectionsIn = connectionsIn;
        _connectionsOut = connectionsOut;
        _state = state;
    }
    
    public int getValue()
    {
        return _value;
    }
    public int getConnectionsIn()
    {
        return _connectionsIn;
    }
    public int getConnectionsOut()
    {
        return _connectionsOut;
    }
    public int getState()
    {
        return _state;
    }
    public void setValue(int value)
    {
        _value = value;
    }
    public void setConnectionsIn(int connectionsIn)
    {
        _connectionsIn = connectionsIn;
    }
    public void setConnectionsOut(int connectionsOut)
    {
        _connectionsOut = connectionsOut;
    }
    public void setState(int state)
    {
        _state = state;
    }
    public void increaseInConnections()
    {
        _connectionsIn++;
    }
    public void increaseOutConnections()
    {
        _connectionsOut++;
    }
    public void decreaseInConnections()
    {
        _connectionsIn--;
    }
    public void decreaseOutConnections()
    {
        _connectionsOut--;
    }
    
}
