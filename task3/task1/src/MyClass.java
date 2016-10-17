
public class MyClass {
	
	private String text;
	private String[] result;
	
	public MyClass(String text){
		this.setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String[] getResult() {
		return result;
	}

	private void setResult(String[] result) {
		this.result = result;
	}
	
	public void textArray(){
		setResult(this.text.split("[\\s]+"));
			
	}

	
	
}
