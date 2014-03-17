package ds4;

/**
 * @author kunaltyagi
 */

public class Item	{
    // A more updated version of Abhinav's Item class, built for storage in my DLArray
	private int id;
	private String name;
        private int amount;
        
	public Item()	{
		id = -1;
		name = null;
                amount = 0;
	}
	public Item(int i, String n)	{
		id = i;
		name = n;
                amount = 0;
	}
        public Item(int i, String n, int amoun)	{
		id = i;
		name = n;
                amount = amoun;
	}
	public String getName()	{
		return name;
	}
	public int getId()	{
		return id;
	}
        public int getAmount()  {
            return amount;
        }
	public void setName(String n)	{
		name = n;
	}
	public void setId(int i)	{
		id = i;
	}
        public void setAmount(int i)    {
            amount = i;
        }
}