
public class LineStepThree implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		IProductPart spring = new Spring();
		return spring;
	}

}
