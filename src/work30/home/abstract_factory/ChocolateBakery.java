package work30.home.abstract_factory;

public class ChocolateBakery implements BakeryFactory{
    @Override
    public Pie bakePie() {
        return new ChocolatePie();
    }

    @Override
    public Cake bakeCake() {
        return new ChocolateCake();
    }

    @Override
    public Cookies bakeCookies() {
        return new ChocolateCookies();
    }
}
