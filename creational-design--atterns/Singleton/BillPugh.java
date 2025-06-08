package Singleton;

public class BillPugh {

	private BillPugh() {
		
	}
	
	private static class InnerBillPugh{
		private static BillPugh instance=new BillPugh();
	}
	public static BillPugh getInstance() {
		return InnerBillPugh.instance;
	}
	
	public void getFun() {
		  System.out.println("Bill Pugh Singleton Class");
	  }
}
