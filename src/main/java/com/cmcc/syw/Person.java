package com.cmcc.syw;

/**
 * Created by sunyiwei on 16/4/17.
 */
public class Person {
    private String name;
    private String value;

    public Person(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return (name == null ? 0 : name.hashCode()) ^
                (value == null ? 0 : value.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person np = (Person) obj;
            return np.getName().equals(name)
                    && np.getValue().equals(value);
        }

        return false;
    }
}
