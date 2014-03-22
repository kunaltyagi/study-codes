package string;

import java.util.ArrayList;

/**
 *
 * @author kunaltyagi
 */
public class Table {
    // a 2D area of puzzle
    private ArrayList<ArrayList<Cell>> table;
    int n, m;
    int type;   //0: Sudoku, 1: Skyscraper
    int globalLevel;
    int globalLinkage;
    
    public Table()
    {
        table = new ArrayList<ArrayList<Cell>>();
        n = m = type = 0;
        allocate();
        globalLevel = globalLinkage = 0;
    }
    public Table(int N, int M)
    {
        table = new ArrayList<ArrayList<Cell>>();
        n = N;
        m = M;
        type = 0;
        allocate();
        globalLevel = globalLinkage = 0;
    }
    public Table(int N, int M, int game)
    {
        table = new ArrayList<ArrayList<Cell>>();
        n = N;
        m = M;
        type = game;
        allocate();
        globalLevel = globalLinkage = 0;
    }
    private void allocate()
    {
        for(int i = 0; i < n; ++i)
        {
            ArrayList<Cell> tmpList = new ArrayList<Cell>();
            for(int j = 0; j < m; ++j)
            {
                Cell tmpCell = new Cell();
                tmpList.add(tmpCell);
            }
            table.add(tmpList);
        }
    }
    public void setGlobalLevel(int level)
    {
        globalLevel = level;
    }
    public void setGlobalLinkage(int linkage)
    {
        globalLinkage = linkage;
    }
    
}
