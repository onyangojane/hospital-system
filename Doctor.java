public class Doctor extends HospitalMember implements Schedulable {
    private String specialization;

    public Doctor(String id, String name, int age, String department, String specialization) {
        super(id, name, age, department);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void displayRole() {
        System.out.println("Doctor: " + getName() + " - " + specialization);
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is treating patients.");
    }

    @Override
    public void schedule(String date) {
        System.out.println("Appointment scheduled with " + getName() + " on: " + date);
    }
}