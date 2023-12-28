package work30.home.abstract_factory;

public class AppleBakery implements BakeryFactory {
    @Override
    public Pie bakePie() {
        return new ApplePie();
    }

    @Override
    public Cake bakeCake() {
        return new AppleCake();
    }

    @Override
    public Cookies bakeCookies() {
        return new AppleCookies();
    }
}
