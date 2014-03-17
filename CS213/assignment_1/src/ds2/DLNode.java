public class DLNode	{
	// Instance variables
	private Item element;
	private DLNode next;	// objects are always referenced. So next is actually the address of the next node 
	private DLNode prev;	// address of previous node
	
	public DLNode()	{
		this(null, null, null);
	}
	public DLNode(DLNode p, Item e, DLNode n)	{
		prev = p;
		element = e;
		next = n;
	}
	public DLNode getPrev()	{
		return prev;
	}
	public Item getElement()	{
		return element;
	}
	public DLNode getNext()	{
		return next;
	}
	public void setPrev(DLNode newPrev)	{
		prev = newPrev;
	}
	public void setElement(Item newElement)	{
		element = newElement;
	}
	public void setNext(DLNode newNext)	{
		next = newNext;
	}
}