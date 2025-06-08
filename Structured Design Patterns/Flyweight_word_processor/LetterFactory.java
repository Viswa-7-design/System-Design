package word_processor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

	private static Map<Character, ILetter> characterCache=new HashMap<>();
	public static ILetter createCharacter(char ch) {
		if(characterCache.containsKey(ch)) {
			return characterCache.get(ch);
		}
		else {
			ILetter characterObj=new DocumentCharacter(ch, "Arial", 10);
			characterCache.put(ch, characterObj);
			return characterObj;
		}
	}
}
