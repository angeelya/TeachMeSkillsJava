package work8.home.task1;

public class Patient {
    public int treatmentPlan;
    private Doctor doctor;


    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
