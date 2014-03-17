package cs213m_ds4;
import java.util.Scanner;

public class ds1 {
	public static boolean Bsearch(int elem, int start, int mid, int end, int a[])
	{
	
	 if(elem==start||elem==end)
		 return true;
	 if(a[mid]==elem)
		 return true;
	 else
		if(elem>mid)
		  {
			start=mid;
			mid=(start+end)/2;
			return Bsearch(elem, start, mid, end, a);
		  }
		else
		{
		  end=mid;
		  mid=(start+end)/2;
		  return Bsearch(elem, start, mid, end, a);
		}
	  
	}
	
	public static void delete(int ids[], int id){
		int found=0;
		for(int i=0; i<ids.length;i++)
		{
			if(id==ids[i])
			  found=id;
			
		}
		for(int i=found; i<ids.length-1;i++)
			ids[i]=ids[i+1];
        		
	}
	
	public static int[] add(int ids[],int id){
		int temp[]=new int[ids.length+1];
		for(int i=0, j=0; i<ids.length+1; i++, j++){
			if((ids[i+1]>=id)&&(ids[i]<=id))
			{
			 temp[j]=id;
			 j++;
			}
			else
			 temp[j]=ids[i];
      		}
		return temp;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char input;
		int id;
		int ids[]=new int[100];
		
		
		System.out.println("welcome to the Dmart");
		System.out.println("if you want to search an item, press s");
		System.out.println("if you want delete something press d");
		System.out.println("if you want to add something press a");
		input=in.next().charAt(0);
		
		if(input=='s')
		{
		System.out.println("Give the Id of the element for search");
		id=in.nextInt();
		boolean found= Bsearch(id, 0,ids.length/2,ids.length, ids);
		System.out.println("found?? " + found );
		
		}
		
		if(input=='d')
		{
			System.out.println("Give the Id of the element for deletion");	
			id=in.nextInt();
			delete(ids , id);
			System.out.println("given id deleted");		
		}
		int ids_new[]=new int[ids.length+1];
		if(input=='a')
		{
			System.out.println("Give the Id of the element for additon");	
			id=in.nextInt();
			System.out.println("original length"+ ids.length);
			ids_new=add(ids, id);
			System.out.println("new length "+ ids_new.length);
		}
	}
}
