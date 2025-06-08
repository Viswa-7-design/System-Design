package compositeSolution;

public class File implements FileSystem{
    public String msg;
    
	public File(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println("file name "+msg);
	}

}
