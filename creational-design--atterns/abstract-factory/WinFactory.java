package abstract_Factory;

public class WinFactory implements IFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new WinTextBox();
	}

}
