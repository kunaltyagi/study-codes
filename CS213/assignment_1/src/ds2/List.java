public class List	{
	protected int size;
	protected DLNode head, tail;
	public List()	{
		head = new DLNode();
		tail = new DLNode();
		head.setNext(tail);
		tail.setPrev(head);
		size = 0;
	}
		// Clears the list
	public void clear()	{
		head.setNext(tail);
		tail.setPrev(head);
		size = 0;
	}
		//Inserts at head in O(1)
	public void insert(Item o)	{
		DLNode temp = new DLNode(head, o, head.getNext());
		head.getNext().setPrev(temp);
		head.setNext(temp);
		size++;
	}	
		//Searches in O(n)
	public DLNode search(int searchId)	{
		DLNode current = head.getNext();
		Item item;
		if (size > 0)	{
			while (current != null)	{
				item = current.getElement();
				if (item.getId() == searchId)	{
					return current;
				}
				current = current.getNext();
			}
		}
		return null;
	}
		//Deletes in O(n)
	public Item delete(int searchId)	{
		DLNode hit = this.search(searchId);
		if (hit != null)	{
			hit.getPrev().setNext(hit.getNext());
			hit.getNext().setPrev(hit.getPrev());
			size--;
			return hit.getElement();
		}
		return null;
	}
		// Returns size
	public int size()	{
		return size;
	}

	public void print()	{
		DLNode current = head.getNext();
		while (current.getNext() != null)	{
			System.out.println(current.getElement());
			current.getElement().print();
			current = current.getNext();
		}
	}
}