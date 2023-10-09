package work13;

public class Storage<T> {
    private T data;

    public Storage() {
    }

    public Storage(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
