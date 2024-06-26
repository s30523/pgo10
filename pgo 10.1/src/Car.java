public class Car implements Comparable {
    private String name;
    private int prodctionYear;

    public Car(String name, int prodctionYear) {
        this.name = name;
        this.prodctionYear = prodctionYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProdctionYear() {
        return prodctionYear;
    }

    public void setProdctionYear(int prodctionYear) {
        this.prodctionYear = prodctionYear;
    }

    @Override
    public String toString() {
        return ("Car model:" + name +"year of production: "+ prodctionYear);
    }

    @Override
    public int compareCars(Car other) {
        return Integer.compare(this.getProdctionYear(), other.getProdctionYear());
    }
}