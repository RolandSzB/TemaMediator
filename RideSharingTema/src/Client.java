import java.util.Objects;

public class Client implements ClientInterface{

    private int location;
    
    private int distance;
    private String transportMode;
    private ClientInterface request;

    public Client(int location, int distance, String transportMode) {

        this.location = location;
        this.distance = distance;
        this.transportMode = transportMode;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public ClientInterface getRequest() {
        return request;
    }

    public void setRequest(ClientInterface request) {
        this.request = request;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    @Override
    public void SendRideRequest( int location, int distance) {
      System.out.println("Ride Request Sent");
      request.SendRideRequest( location, distance);
    }

    @Override
    public void chooseDriver( int location, int distance) {
    request.chooseDriver( location, distance);
    System.out.println("Driver Chosen");
    }

    public void sendRequestToServer() {
        SendRideRequest(location, distance);
    }
    @Override
    public void chooseMode(String transportMode) {
        if(Objects.equals(transportMode, "car")){
            System.out.println("Car Chosen");}
        else if (Objects.equals(transportMode, "scooter")){
        System.out.println("Scooter  Chosen");}
        else System.out.println("Invalid option");
        request.chooseMode(transportMode);
    }

}

