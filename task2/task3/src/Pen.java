public class Pen implements IProduct {
	IProductPart firstPart;
	IProductPart secondPart;
	IProductPart thridPart;

	@Override

	public void installFirstPart(IProductPart iProductPart) {
		this.firstPart = iProductPart;
		System.out.println(this.firstPart.getClass().getName()+" installed");
	}

	public void installSecondPart(IProductPart iProductPart) {
		this.secondPart = iProductPart;
		System.out.println(this.secondPart.getClass().getName()+" installed");
	};

	@Override
	public void installThridPart(IProductPart iProductPart) {
		this.thridPart = iProductPart;
		System.out.println(this.thridPart.getClass().getName()+" installed");

	}
}
