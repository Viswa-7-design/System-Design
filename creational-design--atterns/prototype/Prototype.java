package prototype;

public class Prototype {
public Bean prototypeCharacter;
public Prototype() {
	prototypeCharacter=new Bean("viswa", 100, 50, 3); //default values
}
public Bean createCharcterwithNewName(String name) throws CloneNotSupportedException {
	Bean clonedCharacter=prototypeCharacter.clone();
	clonedCharacter=new Bean(name, clonedCharacter.getHealth(), clonedCharacter.getAttackPower(), clonedCharacter.getLevel());
return clonedCharacter;
}
public Bean createCharcterwithNewlevel(int level) throws CloneNotSupportedException {
	Bean clonedCharacter=prototypeCharacter.clone();
	clonedCharacter=new Bean(clonedCharacter.getName(), clonedCharacter.getHealth(), clonedCharacter.getAttackPower(), level);
return clonedCharacter;
}
public Bean createCharcterwithNewattackPower(int  attackPower) throws CloneNotSupportedException {
	Bean clonedCharacter=prototypeCharacter.clone();
	clonedCharacter=new Bean(clonedCharacter.getName(), clonedCharacter.getHealth(), attackPower , clonedCharacter.getLevel());
return clonedCharacter;
}
}
