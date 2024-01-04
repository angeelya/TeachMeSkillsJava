package work31.home.chain_of_responsibility;


public abstract class Handler {
    Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }
    public abstract void handleRequest(Request request);
}
