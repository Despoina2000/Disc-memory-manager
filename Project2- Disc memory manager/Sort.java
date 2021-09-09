
public class Sort extends Greedy{
	
	Disc [] d;
	
	static void quicksort(ITEM[] a, int p, int r)  { 
		if (r <= p) return;    
		int i = partition(a, p, r);
		quicksort(a, p, i-1);    
		quicksort(a, i+1, r);  }
	static int partition(ITEM a[], int p, int r) { 
		int i = p-1, j = r; ITEM v = a[r];      
		for (;;) {
			while (less(a[++i], v))
			while (less(v, a[--j]))
				 if (j == p) break; 
			if (i >= j) break;
			exch(a, i, j);
			
		}
	exch(a, i, r);      return i;}
	static void exch(ITEM[] a,int i, int j){ITEM t= a[i]; a[i]=a[j]; a[j]=t;}
		
	public void Algorythm_two(MaxPQ Heap){
		int count=0;
		while(Heap.empty()!=false){
			d[count++]= Heap.getmax();
		}
		quicksort(d,1, d.length);
			
		
	}
}