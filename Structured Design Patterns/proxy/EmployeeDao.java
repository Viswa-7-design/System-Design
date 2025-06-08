package proxy;

public interface EmployeeDao {

	public void create(String client,Employee e);
	public void delete(String client,int id);
	public Employee get(String client,int id);
}
