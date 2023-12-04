public class Driver implements DriverInterface{

    private int location;
    private int distance;
    private DriverInterface request;
    private boolean available;


    public Driver(int location, int distance, DriverInterface request, boolean available) {
        this.location = location;
        this.distance = distance;
        this.request = request;
        this.available = available;
    }
    public Driver(int location) {
        this.location = location;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean getAvailable() {
        return available;
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

    public DriverInterface getRequest() {
        return request;
    }

    public void setRequest(DriverInterface request) {
        this.request = request;
    }

        public void getRideRequest( int location, int distance) {
               System.out.println("Ride Request Received");
                request.getRideRequest( location, distance);
        }



    @Override
    public void acceptRideRequest(int location, int distance) {
        System.out.println("Ride Request Accepted");
        request.acceptRideRequest(location, distance);
    }

}