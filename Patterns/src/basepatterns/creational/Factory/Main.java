package basepatterns.creational.Factory;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDevBySpecialty("c++");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
    static DeveloperFactory createDevBySpecialty(String speciality)
    {
        if(speciality.equalsIgnoreCase("java")) {
            return new JavaDevFactory();
        }
        if(speciality.equalsIgnoreCase("c++")) {
            return new CppDevFactory();
        }
        else {
            throw new RuntimeException(speciality + " is unknown");
        }

    }

}
