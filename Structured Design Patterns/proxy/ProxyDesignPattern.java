package proxy;

public class ProxyDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			EmployeeDao employeeDaoobj=new EmployeeDaoProxy();
			employeeDaoobj.create("admin", new Employee());
			System.out.println("operation Sucessful");
		
	}

}
