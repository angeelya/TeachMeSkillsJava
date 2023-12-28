package work30.home.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Fruits {
    private String color;
    private String taste;

    public Fruits() {
    }

    public Fruits(Fruits target) {
        if (target != null) {
            this.color = target.color;
            this.taste = target.taste;
        }
    }
    public abstract Fruits clone();

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Fruits)) return false;
        Fruits fruit = (Fruits) obj;
        return fruit.color==color&&fruit.taste==taste;
    }
}
