package word_processor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ILetter object1=LetterFactory.createCharacter('t');
		object1.display(1, 4);
		
		ILetter object2=LetterFactory.createCharacter('h');
		object2.display(10, 20);
	}

}
