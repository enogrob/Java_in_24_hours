public class Modem2 {
    int speed;
    String method;

    public void displaySpeed() {
        System.out.println("Speed: " + speed);
    }
    
    public void disconnect() {
        System.out.println("Disconnecting from the Internet ...");
        System.out.println("Using a " + method);
    }
}
