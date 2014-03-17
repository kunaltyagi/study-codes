import java.lang.Math;
public class TestSample	{
	public static void main(String args[])	{
		long startTime, endTime;
		
		// Generate data points
		int max = 10000, num;
		Item[] itemArray = new Item[max];
		for(int i = 0; i < max; i++)	{
			num = (int)((Math.random()) * max);
			itemArray[i] = new Item(num, "Data Structures and Algorithms");
		}

		
		List store = new List();
		

		System.out.println("Insertions");
		int k = 1;
		for(int i = 0; i < 5; i++)	{
			startTime = System.nanoTime();
			for(int j = 0; j < k; j++)	{
				store.insert(itemArray[j]);
			}
			endTime = System.nanoTime();
			System.out.println(endTime-startTime);
			// System.out.print("Time taken " + (endTime-startTime) + " nano seconds");
			// System.out.println(" for " + store.size() + " insertions");
			k *= 10;	// Work on a logarithmic scale
			if (i < 4)	{	
				store.clear();	// Clear until only the last case
			}
		}


		System.out.println("Search");
		k = 1;
		for(int i = 0; i < 5; i++)	{
			startTime = System.nanoTime();
			for(int j = 0; j < k; j++)	{
				store.search(itemArray[j].getId());
				// System.out.println(store.search(itemArray[j].getId()));
			}
			endTime = System.nanoTime();
			System.out.println(endTime-startTime);
			// System.out.print("Time taken " + (endTime-startTime) + " nano seconds");
			// System.out.println(" for " + k + " searches");
			k *= 10;
		}


		System.out.println("Deletions");
		k = 1;
		for(int i = 0; i < 5; i++)	{
			startTime = System.nanoTime();
			for(int j = 0; j < k; j++)	{
				store.delete(itemArray[j].getId());
			}
			endTime = System.nanoTime();
			
			// Prepare for the next test case by reinserting the elements
			for(int j = 0; j < k; j++)	{
				store.insert(itemArray[j]);
			}
			System.out.println(endTime-startTime);
			// System.out.print("Time taken " + (endTime-startTime) + " nano seconds");
			// System.out.println(" for " + k + " deletions");
			k *= 10;
		}
	}
}