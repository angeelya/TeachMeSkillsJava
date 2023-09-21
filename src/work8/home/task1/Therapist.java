package work8.home.task1;

public class Therapist extends Doctor {
    private Doctor surgeon = new Surgeon();
    private Doctor dentist = new Dentist();

    {
        System.out.println("Hello, You're seeing a therapist");
    }

    @Override
    protected String treat() {
        return Therapist.class.getSimpleName() + " is treating you.";
    }

    public void prescribeTreatment(Patient patient) {
        switch (patient.treatmentPlan) {
            case 1 -> {
                System.out.println("Your doctor is " + surgeon.getClass().getSimpleName());
                patient.setDoctor(surgeon);
            }
            case 2 -> {
                System.out.println("Your doctor is " + dentist.getClass().getSimpleName());
                patient.setDoctor(dentist);
            }
            default -> {
                System.out.println("I'm your doctor");
                patient.setDoctor(this);
            }
        }
        System.out.println(patient.getDoctor().treat());
    }

}
