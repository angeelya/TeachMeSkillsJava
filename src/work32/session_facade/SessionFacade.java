package work32.session_facade;

public class SessionFacade {
    private Object1 object1;
    private Object2 object2;

    public SessionFacade() {
        object1 = new Object1();
        object2 = new Object2();
    }
    public String doing()
    {
        return object1.objDo()+"\n"+
        object2.objDo();
    }
}
