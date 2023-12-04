import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(20));
        drivers.add(new Driver(50));
        drivers.add(new Driver(80));
        drivers.add(new Driver(90));

        ServerInterface mediator = new Server(drivers);


        Client client1 = new Client(30, 5,"car"); // Client 1 at location 30, distance 5
        Client client2 = new Client(70, 10, "scooter"); // Client 2 at location 70, distance 10

        client1.sendRequestToServer();
        client2.sendRequestToServer();

        client1.chooseDriver(client1.getLocation(), client1.getDistance());
        client2.chooseDriver(client2.getLocation(), client2.getDistance());


    }
}
