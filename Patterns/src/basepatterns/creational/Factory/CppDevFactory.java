package basepatterns.creational.Factory;

public class CppDevFactory implements  DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
