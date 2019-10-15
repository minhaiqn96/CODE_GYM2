public class InfoEmployee {

    public String name;
    public int age;
    public String positon;

    public InfoEmployee() {
    }

    public InfoEmployee(String name, int age, String positon) {
        this.name = name;
        this.age = age;
        this.positon = positon;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPositon() {
        return positon;
    }

    @Override
    public String toString() {
        return "This employee has name "
                + getName()
                + ", age: "
                + getAge()
                + ", job position: "
                + getPositon();
    }
}
