package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Eager obj=Eager.getInstance();
         obj.getFun();
         
         Lazy obj2=Lazy.getInstance();
         obj2.getFun();
         
         Synchrons obj3= Synchrons.getInstance();
         obj3.getFun();
         
         DoubleLock obj4= DoubleLock.getInstance();
         obj4.getFun();
         
         BillPugh obj5= BillPugh.getInstance();
         obj5.getFun();
         
         DBConnection obj6=DBConnection.INSTANCE;
         obj6.getFun();
         
         DBConnection obj7=DBConnection.INSTANCE;
         obj7.getFun();
         
         System.out.println(obj6.hashCode()+ " " + obj7.hashCode());
	}

}
