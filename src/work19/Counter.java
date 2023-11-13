package work19;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Counter {
    int count;

    public Counter() {
        this.count = 1;
    }

    public void increase()
    {
      count++;
    }
}
