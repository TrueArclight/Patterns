package basepatterns.structual.decorator;

public class TeamLeader extends DeveloperDecorator {

    public TeamLeader(Developer developer) {
        super(developer);
    }
    public String sendWeekReport()
    {
        return "Send week report to customer. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
