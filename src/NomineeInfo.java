public class NomineeInfo {
    String name;
    String email;
    String isSenior;
    String hsGradFrom;
    Double distanceToDrive;
    String attendance;
    Long number;

    public NomineeInfo(String name, String email, String isSenior, String hsGradFrom, Double distanceToDrive, String attendance, Long number) {
        this.name = name;
        this.email = email;
        this.isSenior = isSenior;
        this.hsGradFrom = hsGradFrom;
        this.distanceToDrive = distanceToDrive;
        this.attendance = attendance;
        this.number = number;
    }
}
