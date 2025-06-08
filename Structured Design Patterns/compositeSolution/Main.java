package compositeSolution;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Directory movieDic =new Directory("Movie");
      FileSystem border=new File("Border");
      movieDic.add(border);
      Directory comedtmovie=new Directory("ComedyMovie");
      FileSystem comoive=new File("kick");
      comedtmovie.add(comoive);
      movieDic.add(comedtmovie);
      movieDic.ls();
	}

}
