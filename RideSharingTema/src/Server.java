import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Server implements ServerInterface {
    private List<Driver> registeredDrivers;
    public Server(List<Driver> registeredDrivers) {
        this.registeredDrivers = registeredDrivers;
    }

    @Override
    public List<Driver> getClosestDrivers(Client request) {
        int clientLocation = request.getLocation();

        // Sort drivers based on their location proximity to the client
        // Code given by GitHubCopilot
        registeredDrivers.sort(Comparator.comparingInt(driver -> Math.abs(driver.getLocation() - clientLocation)));

        List<Driver> closestDrivers = new ArrayList<>();
        for (int i = 0; i < Math.min(3, registeredDrivers.size()); i++) {
            closestDrivers.add(registeredDrivers.get(i));
        }

        return closestDrivers;
    }

    @Override
    public void sendRequestToDriver(Driver driver) {
        driver.getRideRequest(driver.getLocation(), driver.getDistance());
    }

    @Override
    public void forwardResponseToClient(Driver driver) {
        driver.acceptRideRequest(driver.getLocation(), driver.getDistance());
    }
}
