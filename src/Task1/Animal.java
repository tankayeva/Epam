package Task1;


public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private String weight;


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public int setAge(int age){
        return age;
    }

    public void setGender(String age) {
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight(){
        return weight;
    }

    public void sleep() {
        System.out.println("Animal can sleep");
    }

    public void move() {
        System.out.println("Animal can move");
    }

    public void eat() {
        System.out.println("Animal can eat");
    }


}