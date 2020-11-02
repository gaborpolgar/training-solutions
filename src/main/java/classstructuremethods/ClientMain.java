package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client("Polgár Gábor", "2310 Szigetszentmiklós Tavasz utca 22.", 1985);
        System.out.println(client.getName() + " " + client.getAddress() + " " + client.getYear());
        client.migrate("1142 Budapest, Kassai utca 161/A 2. em. 10. a.");
        System.out.println(client.getName() + " " + client.getAddress() + " " + client.getYear());

    }
}
