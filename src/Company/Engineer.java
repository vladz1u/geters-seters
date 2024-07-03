package Company;

public class Engineer {
    private String name;
    private String surname;
    private int age;
    private double salary;
    private String departament;
    private int id;

    public Engineer(String name, String surname, int age, double salary, String departament, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.departament = departament;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartament() {
        return departament;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

}
