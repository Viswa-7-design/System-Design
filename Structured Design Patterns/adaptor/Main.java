package adaptor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ConcateWeightInKg cwinKGS=new ConcateWeightInKg(new ConcateWeightInPoundAdaptee());
   System.out.println(cwinKGS.converttokg());
	}

}
