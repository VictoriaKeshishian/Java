package Less6;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cat {
    private String name;
    private String owner;
    private String breed;
    private LocalDate dateBorn;
    private String color;
    private ArrayList<Vaccination> vaccinations = new ArrayList<>();

    public Cat(String name, String owner, String breed, LocalDate dateBorn, String color) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.dateBorn = dateBorn;
        this.color = color;
        
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", owner=" + owner + ", breed=" + breed + ", dateBorn=" + dateBorn + ", color="
                + color + ", vaccinations=" + vaccinations + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDate getDateBorn() {
        return dateBorn;
    }

    public String getColor() {
        return color;
    }
    
    public void addVaccination(Vaccination vaccination){
        vaccinations.add(vaccination);
    }
}

