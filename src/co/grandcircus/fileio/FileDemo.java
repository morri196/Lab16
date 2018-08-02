package co.grandcircus.fileio;

public class FileDemo {

	public static void main(String[] args) {
		
		// creates a file in eclipse. after writing it here click on the project and select refresh. it should appear
		PlayersFileUtil.createBlankFile("hello.txt");
		//this creates a blank file on you computer. you can specify where (ei. Desktop...then /(filename))
		PlayersFileUtil.createBlankFile("/Users/karimcfarlin/Desktop/files2.txt");
		
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);
		System.out.println(userHome + "/Desktop");
		PlayersFileUtil.createDirectory(userHome + "/Desktop/myFolder");

	}

}
