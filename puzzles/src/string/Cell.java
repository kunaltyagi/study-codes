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
    
    public Cell()
    {
        fields = new ArrayList<Field>();
        neighbours = new ArrayList<Cell>();
    }
    public Cell(ArrayList<Field> newFields, ArrayList<Cell> newNeighbours)
    {
        fields = newFields;
        neighbours = newNeighbours;
    }
    public void setFields(ArrayList<Field> newFields)
    {
        fields = newFields;
    }
    public void setNeighbours(ArrayList<Cell> newNeighbours)
    {
        neighbours = newNeighbours;
    }
    public void addField(Field newField)
    {
        fields.add(newField);
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
    
}
