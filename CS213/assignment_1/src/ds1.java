package cs213m_ds4;
import java.util.Scanner;

public class ds1 {
	public static boolean Bsearch(int elem, int start, int mid, int end, int ids[])
	{
	 
	
     if(elem==ids[start]||elem==ids[end]||elem==ids[mid])
		 return true;
	 else
		if((mid!=start)&&(mid!=end)&&(end!=start))
		  {
			if(elem>ids[mid])	
		      {
				start=mid;
				mid=(start+end)/2;
				return Bsearch(elem, start, mid, end, ids);
		      }
			else
		     {
				end=mid;
				mid=(start+end)/2;
				return Bsearch(elem, start, mid, end, ids);
		     }
		 }
			else	
				return	false;
	  
	}
	
	public static void delete(int ids[], int id){
		int found=0;
		for(int i=0; i<ids.length;i++)
		{
			if(id==ids[i])
			  found=i;
			
		}
		for(int i=found; i<ids.length-1;i++)
			ids[i]=ids[i+1];
       	ids[ids.length-1]=-1;	
	}
	
	public static int[] add(int ids[],int id){
		int temp[]=new int[ids.length+1];
		for(int i=0, j=0; i<ids.length-1; i++, j++){
			if((ids[i+1]>=id)&&(ids[i]<=id))
			{
			 temp[j]=ids[i];
			 temp[j+1]=id;
			 j++;
			}
			else
			 temp[j]=ids[i];
      		}
		   if(id>ids[ids.length-1])
			 temp[ids.length]=id;
		   else
			 temp[ids.length]=ids[ids.length-1];
		return temp;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char input;
		int id;
		int ids[]=new int[10];
		for(int i=0;i<10; i++)
           ids[i]=i*10;		
		
		System.out.println("welcome to the Dmart");
		System.out.println("if you want to search an item, press s");
		System.out.println("if you want delete something press d");
		System.out.println("if you want to add something press a");
		input=in.next().charAt(0);
  
	    
       
		if(input=='s')
		{
		System.out.println("Give the Id of the element for search");
		id=in.nextInt();
		boolean found= Bsearch(id,0,(ids.length)/2,(ids.length)-1, ids);
		System.out.println("found?? " + found );
		
		}
		
		if(input=='d')
		{
			System.out.println("Give the Id of the element for deletion");	
			id=in.nextInt();
			System.out.println("The old array is ");
			for(int i=0; i<ids.length; i++)
				System.out.println(ids[i]);
			
			delete(ids , id);
			System.out.println("the new array is ");
			for(int i=0; i<ids.length; i++)
				System.out.println(ids[i]);
			System.out.println("given id deleted");
			
			
		}
		int ids_new[]=new int[ids.length+1];
		if(input=='a')
		{
			System.out.println("Give the Id of the element for additon");	
			id=in.nextInt();
			System.out.println("original array is ");
			for(int i=0; i<ids.length; i++)
				System.out.println(ids[i]);

			ids_new=add(ids, id);
			System.out.println("new array is ");
			for(int i=0; i<ids_new.length; i++)
				System.out.println(ids_new[i]);
			
		}
		if(input!='a'&&input!='s'&&input!='d'){
			System.out.println("wrong input");
          
		}
	}
  
	
}
