package ds2;

public class Item	{
	private int id;
	private String name;
	public Item()	{
		id = -1;
		name = null;
	}
	public Item(int i, String n)	{
		id = i;
		name = n;
	}
	public String getName()	{
		return name;
	}
	public int getId()	{
		return id;
	}
	public void setName(String n)	{
		name = n;
	}
	public void setId(int i)	{
		id = i;
	}
}