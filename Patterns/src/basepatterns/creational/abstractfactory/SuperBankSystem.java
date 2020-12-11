package basepatterns.creational.abstractfactory;

import basepatterns.creational.abstractfactory.banking.BankTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        TeamFactory teamFactory = new BankTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        tester.testCode();
        projectManager.manageCode();
    }
}
