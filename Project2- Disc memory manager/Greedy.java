public class Greedy{
	 MaxPQ Heap= new MaxPQ(10) ;
	int folder;
	public void Algorythm_one(MaxPQ Heap, int folder){
		FileReader reader = new FileReader("folders.txt");
		BufferedReader br = new BufferedReader(reader);
		while ((line = br.readLine()) != null) {
			folder = Integer.parseInt(line);
			Heap.AddFolderInPQ(folder);
		}
		Heap.ToString();
	}
	
		
}