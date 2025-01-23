package ulaval.glo2003;

import jakarta.json.bind.annotation.JsonbTypeDeserializer;
import jakarta.json.bind.annotation.JsonbTypeSerializer;

public class Product {
    public String title;
    public String description;
    public double price;
    public boolean sold;

    @Override
    public String toString() {
        return "Product{" +
                "tile='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", sold=" + sold +
                '}';
    }
}
