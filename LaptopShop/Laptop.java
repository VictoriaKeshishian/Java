package LaptopShop;

public class Laptop {
    private String name; // имя
    private Integer ram; //оперативная память
    private Integer hardDrive; // объем жесткого диска
    private String os; // операционная система
    private Float price; // цена
    private String color; // цвет
    
    public Laptop(String name,Integer ram, Integer hardDrive, String os, int price, String color) {
        this.name = name;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.os = os;
        this.price = (float) price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop [name=" + name + ", ram=" + ram + ", hardDrive=" + hardDrive + ", os=" + os + ", price=" + price + ", color="
                + color +"]\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ram == null) ? 0 : ram.hashCode());
        result = prime * result + ((hardDrive == null) ? 0 : hardDrive.hashCode());
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (ram == null) {
            if (other.ram != null)
                return false;
        } else if (!ram.equals(other.ram))
            return false;
        if (hardDrive == null) {
            if (other.hardDrive != null)
                return false;
        } else if (!hardDrive.equals(other.hardDrive))
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getHardDrive() {
        return hardDrive;
    }

    public String getOs() {
        return os;
    }

    public Float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
}
