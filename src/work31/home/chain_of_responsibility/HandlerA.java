package work31.home.chain_of_responsibility;

public class HandlerA extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getName().equals("request1"))
        {
            System.out.println("Processing request 1");
        }
        else if(next!=null) {
            next.handleRequest(request);
        }
        else {
            System.out.println("Ñannot be processed");
        }
    }
}
