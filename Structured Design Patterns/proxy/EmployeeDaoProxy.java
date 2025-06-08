package proxy;

public class EmployeeDaoProxy implements EmployeeDao{

	EmployeeDao employeeDao;
	public EmployeeDaoProxy() {
		// TODO Auto-generated constructor stub
		employeeDao=new EmployeeDaoimpl();
	}
	@Override
	public void create(String client, Employee e) {
		// TODO Auto-generated method stub
		if(client.equals("admin") ){
			employeeDao.create(client, e);
			return;
		}
		else {
			System.out.println("Access Denied");
		}
	}

	@Override
	public void delete(String client, int id) {
		// TODO Auto-generated method stub
		if(client.equals("admin") ){
			employeeDao.delete(client, id);
			return;
		}
		else {
			System.out.println("Access Denied");
		}
		
	}

	@Override
	public Employee get(String client, int id) {
		// TODO Auto-generated method stub
		if(client.equals("admin") || client.equals("user")){
			return employeeDao.get(client, id);
		
		}
		return null;
	}

}
