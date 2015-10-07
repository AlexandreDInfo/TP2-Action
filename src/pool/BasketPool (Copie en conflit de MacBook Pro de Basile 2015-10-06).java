package pool;

public class BasketPool extends ResourcePool<Basket> {

	public BasketPool(int nbr) {
		super(nbr);
	}

	@Override
	protected Basket createResource() {
		return new Basket();
	}

}
