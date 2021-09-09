import java.util.*;
public class Disc {
	private String id;
	private Stack folders;
	private int space=0;
	private Node check;
	private  Boolean Check (string id) { 
			if(check==null){ check.item=id; check.next=null;}
			else{ 
				boolean flag=false; 
				while (check.next!=null){if(check.item==id) flag=true; check=check.next;} 
				if(flag){ Node c=new Node(); c.item=id; check.next=c;} 
				else {system.out.println("Error!");} 
		return flag;}}
	public void Disc(){}
	public void Disc(String id){ 
		if (Check(id)){ this.id=id; folders=null;}} 
	public boolean empty(){return true;}
	int getFreeSpace() {return 1000000-space;} 
	public String getIb(){return id;}
	public Node getFolders(){ while (folders.hasNext) return folders.item;}
	public void setFolders(int item){ 
	if(folders==null){ folders.item=item; folders.next=null; space+=1;} 
	else if (getFreeSpace-item>0){ Node f= new Node(); f.item= item; folders.next=f; space++;}}
	public int compareTo(Disc A){
		if( A.getFreeSpace()==this.getFreeSpace()){
			return 0;
		}
		else if(A.getFreeSpace()>this.getFreeSpace()){
			return -1;}
		else return 1;
		}
}
	