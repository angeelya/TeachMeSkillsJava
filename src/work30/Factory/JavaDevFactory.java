package work30.Factory;

import work30.Factory.DevFactory;
import work30.Factory.Developer;
import work30.Factory.JavaDev;

public class JavaDevFactory implements DevFactory {
    @Override
    public Developer createDev() {
        return new JavaDev();
    }
}
