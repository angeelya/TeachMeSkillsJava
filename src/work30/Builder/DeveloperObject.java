package work30.Builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DeveloperObject {
    private String name;
    private int age;
    private String language;

    public static class DeveloperBuilder {
        private DeveloperObject developer;
        public DeveloperBuilder()
        {
            developer = new DeveloperObject();
        }
        public DeveloperBuilder name(String name) {
            developer.name=name;
            return this;
        }

        public DeveloperBuilder age(int age) {
            developer.age = age;
            return this;
        }

        public DeveloperBuilder language(String language) {
            developer.language = language;
            return this;
        }


        public DeveloperObject build() {
            return developer;
        }

    }
}
