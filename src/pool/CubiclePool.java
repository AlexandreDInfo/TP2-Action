package pool;

public class CubiclePool extends ResourcePool<Cubicle> {

	public CubiclePool(int nbr) {
		super(nbr);
	}

	@Override
	protected Cubicle createResource() {
		return new Cubicle();
	}

}
