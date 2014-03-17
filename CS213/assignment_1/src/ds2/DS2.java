package ds2;

public class DS2	{
	public static void main(String args[])	{
		List store = new List();
		Item temp = new Item();
		temp.setName("Bournvita");
		temp.setId(189);
		store.insert(temp);
		store.print();
		System.out.println(store.size());
		System.out.println(store.search(189).getElement().getId());
	}
}