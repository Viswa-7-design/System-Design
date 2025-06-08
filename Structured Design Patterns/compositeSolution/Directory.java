package compositeSolution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String directoryName;
   List<FileSystem> list;
   
	public Directory(String directoryName) {
	super();
	this.directoryName = directoryName;
	this.list = new ArrayList<>();
}

	public void add(FileSystem fileSystemobj) {
		list.add(fileSystemobj);
	}
	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println("directory name"+directoryName);
		for(FileSystem file:list) {
			file.ls();
		}
		
	}

}
