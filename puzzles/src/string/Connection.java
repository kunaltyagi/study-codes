package string;

/**
 *
 * @author kunaltyagi
 */
public class Connection {
    // List of from-to doublets
    // to be stored in each cell
    private Field _to;
    private Field _from;
    private final Field NULL;
    
    public Connection()
    {
        NULL = new Field();
        _to = NULL;
        _from = NULL;
    }
    public Connection(Field to, Field from)
    {
        NULL = new Field();
        _to = to;
        _from = from;
    }
    public void setConnection(Field to, Field from)
    {
        _to = to;
        _from = from;
    }
    public void setTo(Field to)
    {
        _to = to;
    }
    public void setFrom(Field from)
    {
        _from = from;
    }
    public Field getTo()
    {
        return _to;
    }
    public Field getFrom()
    {
        return _from;
    }
    
}
