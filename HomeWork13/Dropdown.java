package HomeWork13;
/**
 * Dropdown
 * поля:
 * - List&lt;String&gt; options
 * - boolean isSelected
 * - String name
 */

import java.util.List;

public class Dropdown {
    List<String> options;
    boolean isSelected;
    String name;

    public Dropdown(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "";
    }
}


