package proxy;

public class EmployeeDaoimpl implements EmployeeDao{

	@Override
	public void create(String client, Employee e) {
		// TODO Auto-generated method stub
		System.out.println("created new row in the Employee table");
		
	}

	@Override
	public void delete(String client, int id) {
		// TODO Auto-generated method stub
	System.out.println("deleted row with employeeid "+id);
	}

	@Override
	public Employee get(String client, int id) {
		// TODO Auto-generated method stub
		System.out.println("fetching data from the db");
		return new Employee();
	}

}
