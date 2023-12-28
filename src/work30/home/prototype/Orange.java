package work30.home.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Orange extends Fruits {
    private String acidity;

    public Orange() {
    }

    public Orange(Orange target) {
        super(target);
        if (target != null) {
            this.acidity = target.acidity;
        }
    }

    @Override
    public Fruits clone() {
        return new Orange(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Orange)||!super.equals(obj)) return false;
        Orange orange = (Orange) obj;
        return orange.acidity==acidity;
    }
}
