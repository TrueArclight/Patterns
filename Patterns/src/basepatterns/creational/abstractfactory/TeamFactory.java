package basepatterns.creational.abstractfactory;

public interface TeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
