package abstract_Factory;

public class MacFactory implements IFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new MacTextBox();
	}
  
}
