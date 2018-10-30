package HomeWork13;

import java.util.Objects;

public class Field  {
    int id;
    String value;


    public Field(int id, String value) {
        this.id = id;
        this.value = value;
    }


    @Override
    public String toString() {
        return "Field: " +
                "id = " + id +
                ", value = '" + value + '\'' +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return id == field.id &&
                Objects.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
}
