import java.util.List;

public interface ServerInterface {
    List<Driver> getClosestDrivers(Client request);
    void sendRequestToDriver(Driver driver);

    void forwardResponseToClient(Driver driver);
}
