public class Patient extends Person implements Billable {
    private String illness;

    public Patient(String id, String name, int age, String illness) {
        super(id, name, age);
        this.illness = illness;
    }

    public String getIllness() {
        return illness;
    }

    @Override
    public void displayRole() {
        System.out.println("Patient: " + getName() + " - " + illness);
    }

    @Override
    public void generateBill(double amount) {
        System.out.println("Bill for " + getName() + ": Ksh " + amount);
    }
}