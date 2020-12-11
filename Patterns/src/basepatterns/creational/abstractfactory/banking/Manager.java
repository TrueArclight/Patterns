package basepatterns.creational.abstractfactory.banking;


import basepatterns.creational.abstractfactory.ProjectManager;

public class Manager implements ProjectManager {
    @Override
    public void manageCode() {
        System.out.println("Manager manages code...");
    }
}
