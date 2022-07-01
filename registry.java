import.java.util.*;

public class registry{
	private Queue<personregistry> queue = new LinkedList<personregistry>();

	public void addnewreg(personregistry r){
		if(queue.contains(r) == false){
		queue.add(r)
		}
	}

	public personregistry getNextRemove(){
	return queue.poll();
	
	}
}