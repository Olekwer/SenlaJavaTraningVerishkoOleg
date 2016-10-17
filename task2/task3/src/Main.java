
public class Main {

	public static void main(String[] args) {
		ILineStep stepOne=new LineStepOne();
		ILineStep stepTwo=new LineStepTwo();
		ILineStep stepThree=new LineStepThree();
		AssemblyLine assemblyLine=new AssemblyLine(stepOne, stepTwo, stepThree);
		IProduct pen=new Pen();
		pen=assemblyLine.assembleProduct(pen);

	}

}
