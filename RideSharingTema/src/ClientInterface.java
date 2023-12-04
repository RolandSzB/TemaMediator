public interface ClientInterface {
    void SendRideRequest( int location, int distance);
    void chooseDriver( int location, int distance);
    void chooseMode(String transportMode);
}
