package Company;

public class main {
    public static void main(String[] args) {
        ControlSystem controlSystem = new ControlSystem();

        Manager manager1 = new Manager("George",
                "Vlasov",
                24,
                15000,
                "Head of Development",
                1);

        controlSystem.addManager(manager1);

        Engineer engineer1 = new Engineer("John",
                "Kiselev",
                28,
                20000,
                "R&D Department",
                2);

        controlSystem.addEngineer(engineer1);

        Programmer programmer1 = new Programmer("Ivan",
                "Vasyliev",
                35,
                30000,
                "Architecture and Integration Department",
                3);

        controlSystem.addProgrammer(programmer1);

        System.out.println("General salary " + controlSystem.generalSalary());
        System.out.println("Average salary " + ControlSystem.averageSalary(controlSystem));
    }
}
