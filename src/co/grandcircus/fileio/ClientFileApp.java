package co.grandcircus.fileio;

import java.util.Arrays;
import java.util.List;

public class ClientFileApp {
	
public static void main(String [] args) {
	List<Client> oldClients = ClientFileUtil2.readFile();
	for (Client client : oldClients) {
		System.out.println(client);
	}
	List<Client> clients = Arrays.asList(
			new Client("Joe", 23, 165),
			new Client("Mary", 65, 122)
			);
	ClientFileUtil2.writeFile(clients);
	
	Client client = new Client("Jane", 45, 150);
	ClientFileUtil2.appendLine(client);
	
	
}

}
