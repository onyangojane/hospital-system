public abstract class HospitalMember extends Person {

    private String department;

    public HospitalMember(String id, String name, int age, String department) {
        super(id, name, age);   
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    
    public abstract void performDuties();
}
