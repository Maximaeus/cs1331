import java.util.Date;

public abstract class Employee {
    private String name;
    private Date hireDate;

    public Employee(String name, Date hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(Date date) {
        this.hireDate = date;
    }

    public String getName() {
        return this.name;
    }

    public Date getHireDate() {
        return this.hireDate;
    }

    public abstract double monthlyPay();

    @Override
    public String toString() {
        return name + ": " + hireDate;
    }
}
