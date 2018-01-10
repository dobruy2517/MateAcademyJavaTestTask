package logic;

public class Students {


    private String firstName;
    private String lastName;
    private int academicPerformance;
    private String softSkils;
    private String socialPerformance;
    private String communicability;
    private boolean presence;

    public Students(){}

    public Students(String firstName, String lastName, int academicPerformance, String softSkils, String socialPerformance, String communicability, boolean presence) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.academicPerformance = academicPerformance;
        this.softSkils = softSkils;
        this.socialPerformance = socialPerformance;
        this.communicability = communicability;
        this.presence = presence;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAcademicPerformance() {
        return academicPerformance;
    }

    public String getSoftSkils() {
        return softSkils;
    }

    public String getSocialPerformance() {
        return socialPerformance;
    }

    public String getCommunicability() {
        return communicability;
    }

    public boolean isPresence() {
        return presence;
    }
}
