package Task1;

public class Fish extends Animal {

    String name;
    int age;
    String gender;
    String weight;

    public Fish() {
        this.name = "Shark";
        this.age = 3;
        this.gender = "Male";
        this.weight = "350kg";
    }

    @Override
    public String toString() {
        return ("shark:\t\t" +
                "age: " + age + ",\t" +
                "gender: " + gender + ",\t" +
                "weight: " + weight);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int setAge(int age) {
        return age;
    }

    @Override
    public void setGender(String age) {
        this.gender = gender;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String getWeight() {
        return weight;
    }

    @Override
    public void sleep() {
        System.out.println("Fish sleeps");
    }

    @Override
    public void eat() {
        System.out.println("It eats krill, algae, and insects.");
    }

    ;

    @Override
    public void move() {
        System.out.println("It swims through the water.");
    }

    ;
}