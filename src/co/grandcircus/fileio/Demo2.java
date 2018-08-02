package co.grandcircus.fileio;

public class Demo2 {
	public static void main(String[] args) {
	try (
			fileOutputStream fileOutputStream = new FileOutputStream("players.");
			PrintWriter fileWriter = new PrintWriter(fileOutputStream);
		) 	{
		String line = player.getName() + "~~~" + player.getJersey;
				fileWriter.println(line);
		}
	
	}
}