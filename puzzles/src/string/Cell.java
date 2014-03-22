/*TODO
 * 
 */
package string;

import java.util.ArrayList;

/**
 *
 * @author kunaltyagi
 */
public class Cell {
    private ArrayList<Field> fields;
    private ArrayList<Cell> neighbours;
    private CList connections;
    
    public Cell()
    {
        fields = new ArrayList<Field>();
        neighbours = new ArrayList<Cell>();
        connections = new CList();
    }
    public Cell(ArrayList<Field> newFields, ArrayList<Cell> newNeighbours)
    {
        fields = newFields;
        neighbours = newNeighbours;
        connections = new CList();
    }
    public Cell(ArrayList<Field> newFields, ArrayList<Cell> newNeighbours, CList newConnections)
    {
        fields = newFields;
        neighbours = newNeighbours;
        connections = newConnections;
    }
    public void setFields(ArrayList<Field> newFields)
    {
        fields = newFields;
    }
    public void setNeighbours(ArrayList<Cell> newNeighbours)
    {
        neighbours = newNeighbours;
    }
    public void setConnections(CList newConnections)
    {
        connections = newConnections;
    }
    public void addField(Field newField)
    {
        fields.add(newField);
    }
    public void addConnection(Connection newConnection)
    {
        connections.add(newConnection);
    }
    public void addNeighbour(Cell newNeighbour)
    {
        neighbours.add(newNeighbour);
    }
    public void removeField(Field oldField)
    {
        fields.remove(oldField);
    }
    public void removeNeighbour(Cell oldNeighbour)
    {
        neighbours.remove(oldNeighbour);
    }
    public void removeConnection(Connection oldConnection)
    {
        connections.remove(oldConnection);
    }
    
}
