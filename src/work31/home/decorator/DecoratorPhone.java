package work31.home.decorator;

public class DecoratorPhone implements Phone {
    private Phone phone;

    public DecoratorPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
    }
}
