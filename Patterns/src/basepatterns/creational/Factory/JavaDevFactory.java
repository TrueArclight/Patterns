package basepatterns.creational.Factory;

public class JavaDevFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
