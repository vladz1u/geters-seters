package Company;

import java.util.ArrayList;

public class ControlSystem {
    private ArrayList<Manager> managersList = new ArrayList<>();
    private ArrayList<Engineer> engineersList = new ArrayList<>();
    private ArrayList<Programmer> programmersList = new ArrayList<>();

    public int countWorkers(){
        int countWorkers = managersList.size() + engineersList.size() + programmersList.size();
        return countWorkers;

    }

    public void addManager(Manager manager){
        managersList.add(manager);
    }

    public void addEngineer(Engineer engineer){
        engineersList.add(engineer);
    }

    public void addProgrammer(Programmer programmer){
        programmersList.add(programmer);
    }

    public void deleteManager(Manager manager){
        managersList.remove(manager);
    }

    public void deleteEngineer(Engineer engineer){
        engineersList.remove(engineer);
    }

    public void deleteProgrammer(Programmer programmer){
        programmersList.remove(programmer);
    }

    public double generalSalary(){
        double generalSalary = 0;

        for (int i = 0; i < managersList.size(); i++) {
            generalSalary += managersList.get(i).getSalary();
        }

        for (int i = 0; i < engineersList.size(); i++) {
            generalSalary += engineersList.get(i).getSalary();
        }

        for (int i = 0; i < programmersList.size(); i++) {
            generalSalary += programmersList.get(i).getSalary();
        }
        return generalSalary;
    }

    public static double averageSalary(ControlSystem controlSystem){
        double averageSalary = controlSystem.generalSalary() / controlSystem.countWorkers();

        return averageSalary;
    }

}
