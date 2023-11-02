package work18;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Address {
    private String type;
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip_index;
    private String country;
}
