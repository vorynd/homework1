package homework4;

public class Agregat {
    private int weight;
    private String type;
    private String countryOfProduction;


    public Agregat(int weight, String type, String countryOfProduction) {
        this.weight = weight;
        this.type = type;
        this.countryOfProduction = countryOfProduction;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public void work() {
        System.out.println("I will work");
    }
}
