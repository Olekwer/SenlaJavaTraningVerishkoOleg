
public class LineStepOne implements ILineStep {
	@Override
	public IProductPart buildProductPart() {
		IProductPart corpus=new Corpus();
		return corpus;
	}

}
