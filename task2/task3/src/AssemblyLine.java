
public class AssemblyLine implements IAssembyLine{
	ILineStep stepOne;
	ILineStep stepTwo;
	ILineStep stepThree;
	public AssemblyLine(ILineStep stepOne, ILineStep stepTwo, ILineStep stepThree) {
		this.stepOne=stepOne;
		this.stepTwo=stepTwo;
		this.stepThree=stepThree;
	}
	@Override
	public IProduct assembleProduct(IProduct product) {		
		product.installFirstPart(stepOne.buildProductPart());
		product.installSecondPart(stepTwo.buildProductPart());
		product.installThridPart(stepThree.buildProductPart());
		System.out.println(product.getClass().getName()+" ready");
		return product;
	}
}
