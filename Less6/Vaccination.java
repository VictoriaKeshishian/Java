package Less6;

import java.time.LocalDate;

public class Vaccination {
    private LocalDate date;
    private String producer;
    private String name;

    public Vaccination(LocalDate date, String producer, String name) {
        this.date = date;
        this.producer = producer;
        this.name = name;
    }

    public LocalDate getDate(){
        return date;
    }

    // public void setDate(LocalDate date){
    //     this.date = date;
    // }

    @Override
    public String toString() {
        return "Vaccination [date=" + date + ", producer=" + producer + ", name=" + name + "]";
    }

    public String getProducer() {
        return producer;
    }

    public String getName() {
        return name;
    }
    
}

