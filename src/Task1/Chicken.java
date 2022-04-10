package Task1;

public class Chicken extends Bird {

    public Chicken() {
        this.name = "Chicken";
        this.age = 1;
        this.gender = "Female";
        this.weight = "1kg";
    }

    @Override
    public String toString() {
        return ("chicken:\t" +
                "age: " + age + ",\t" +
                "gender: " + gender + ",\t" +
                "weight: " + weight);
    }
}


