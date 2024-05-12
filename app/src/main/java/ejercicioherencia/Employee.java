package ejercicioherencia;

import java.util.Objects;

public class Employee {
    private String name = "Unknown";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        boolean isEqual = false;

        if(o instanceof  Employee){
            Employee e = (Employee) o;
            String n = e.getName();
            isEqual = n.equals(this.name);
        }
        return isEqual;
    }

}
