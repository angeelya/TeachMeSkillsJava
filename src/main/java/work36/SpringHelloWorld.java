package work36;

public class SpringHelloWorld {
    private String message;

    public SpringHelloWorld(String message) {
        this.message = message;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public void getHelloMessage() {
        System.out.println("Hello message: " + message);
    }
}
