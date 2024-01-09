package work32.home.session_facade;

public class Fan {
    public String turnON(Integer mode)
    {
       String result="The fan operates"+ switch (mode)
        {
            case 1-> "in the first mode";
            case 2-> "in the second mode";
            case 3-> "in the third mode";
            default -> "error.there is no such mode";
        };
      return result;
    }
    public String  turnOff()
    {
        return "Fan is off";
    }
}
