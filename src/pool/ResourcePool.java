package pool;

import java.util.ArrayList;
import java.util.List;

public abstract class ResourcePool<R extends Resource> {

	protected List<R> resources;
	
	public ResourcePool(int nbr){
		resources=new ArrayList<R>();
		for(int i=1; i<=nbr; i++)
			resources.add(this.createResource());
	}

	protected  abstract R createResource() ;
}
