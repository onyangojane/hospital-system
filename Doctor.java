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
        System.out.println("");
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor Kamau treated Mr. John Mwangi.");
    }

    @Override
    public void schedule(String date) {
        System.out.println(" on: " + date);
    }
}