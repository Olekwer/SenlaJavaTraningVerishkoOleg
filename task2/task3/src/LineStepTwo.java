
public class LineStepTwo implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		IProductPart refil = new Refill();
		return refil;
	}

}
