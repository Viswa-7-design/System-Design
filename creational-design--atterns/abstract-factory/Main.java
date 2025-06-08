package abstract_Factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter your machine os");
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       IFactory fact=GUIAbstractFactory.createFActory(s);
       
       Button button=fact.createButton();
       button.press();
       
       TextBox textBox=fact.createTextBox();
       textBox.showText();
	}

}
