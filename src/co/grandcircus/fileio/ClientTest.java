package co.grandcircus.fileio;
import java.util.ArrayList;
import java.util.List;


public class ClientTest {

	public static void main(String[] args) {
		
		List<Client> list = ClientFileUtil2.readFile();
		
		for (Client c : list) {
			System.out.println(c);
		}
		
	}

}
