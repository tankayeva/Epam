package Task1;

public class Shark extends Fish {

    public Shark() {
        this.name = "Shark";
        this.age = 3;
        this.gender = "Male";
        this.weight = "150kg";
    }

    @Override
    public String toString() {
        return ("shark:\t" +
                "age: " + age + ",\t" +
                "gender: " + gender + ",\t" +
                "weight: " + weight);
    }
}