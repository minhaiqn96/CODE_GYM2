package model;

public class Employee {
    private String fullName;
    private String dayOfBirth;
    private String CMND;
    private String phoneNumber;
    private String email;
    private String address;
    private String degree;
    private String position;
    private float salary;
    private String departmen;

    public Employee() {
    }

    public Employee(String fullName, String dayOfBirth, String CMND, String phoneNumber, String email, String address, String degree, String position, float salary, String departmen) {
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
        this.departmen = departmen;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDepartmen() {
        return departmen;
    }

    public void setDepartmen(String departmen) {
        this.departmen = departmen;
    }

    public  int calculateMoneyOfRoom(){
         return 0;
    }

    public float calculateSalary() {


            float salaryTotal;
            switch (this.position) {
                case "sale":
                    salaryTotal = this.salary + 200;

                    break;
                case "manager":
                    salaryTotal = this.salary + 500;

                    break;
                case "marketing":
                    salaryTotal = this.salary + 300;

                    break;
                default:
                    salaryTotal = this.salary;
            }
return salaryTotal;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", CMND='" + CMND + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", departmen='" + departmen + '\'' +"salaryTOTAL="+calculateSalary()+
                '}';
    }
}
