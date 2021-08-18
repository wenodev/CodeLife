package ch10;

import java.util.Objects;

public class Animal {
    private String name;
    private String kind;

    public void move(){

    }
    public void eatFood(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(kind, animal.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, kind);
    }
}
