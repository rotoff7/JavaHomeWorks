package HomeWork6;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Laptop {
    Brand brand;
    LapColor color;
    Price recommendedPrice;
    LapConfiguration configuration;

    public Laptop(Brand brand, LapColor color, Price price, LapConfiguration config) {
        this.brand = brand;
        this.color = color;
        this.recommendedPrice = price;
        this.configuration = config;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "brand=" + brand +
                ", color=" + color +
                ", recommendedPrice=" + recommendedPrice +
                ", configuration=" + configuration +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return brand == laptop.brand && color == laptop.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color);
    }
}
