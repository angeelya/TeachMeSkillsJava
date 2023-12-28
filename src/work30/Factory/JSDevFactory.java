package work30.Factory;

import work30.Factory.DevFactory;
import work30.Factory.Developer;
import work30.Factory.JsDev;

public class JSDevFactory implements DevFactory {
    @Override
    public Developer createDev() {
        return new JsDev();
    }
}
