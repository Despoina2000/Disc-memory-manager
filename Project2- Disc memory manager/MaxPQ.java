import java.util.*;
public class MaxPQ extends Disc{
	static boolean less(Disc v, Disc w){return v.less(w);}
	static void exch(Disc[] a,int i, int j){Disc t= a[i]; a[i]=a[j]; a[j]=t;}
	private Disc [] pq; private int N; int size=0;
	MaxPQ(int maxN){ pq=new Disc [maxN]; N=0;}
	public boolean empty(){return N==0;}
	public void insert (Disc item){pq[N++]=item;}
	public Disc getmax(){
		int max=0;
		for(int j=1; j<N; j++) if (less(pq[max],pq[j])) max=j;
		exch (pq,max,N-1); return pq[--N];
		
	}
	private void swim(int k){
		while(k>1&&less(k/2,k)){
			exch(k,k/2); k=k/2;
		}
			
	}
	private void sink (int k, int N){
		while(2*k<=N){
			int j=2*κ;
			if(j<N&&less(j,j+1)) j++;
			if (!less(k,j)) break; exch(k,j); k=j;
		}
	}
	 public void add(Disc item){ 
		 if(size==pq.leangth-1) grow();
		 pq[++size]=item; swim(size);
	 }
	 public Disc peek(){
		 if(size==0) return null;
		 return pq[1];
	 }
	 private void grow(){
		 Disc [] npq = (Disc[]) new Object [pq.length+5];
		 int i=1;
		 while(pq.empty()!=false){
			 npq[i]=pq[i];
			 i++;
		 }
		 
	 }
	 public void AddFolderInPQ( int folder){
		 
		 if( pq[1].getFreeSpace()-folder>0) pq[1].setFolders(folder);
		 else{
			 Disc  D= Disc (" "+ size); D.setFolders(folder); add(D);
		 }
	 }
}