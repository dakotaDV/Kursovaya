package Kursovaya;

public class Employee {

    private static int counter = 0;
    private Integer id;
    private String name;
    private String LastName;
    private String middleName;
    private int department;
    private int salary;

    public Employee(String name, String middleName, String lastName, int department, int salary) {
        this.name = name;
        this.LastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Имя='" + name + '\'' +
                ", Фамилия='" + LastName + '\'' +
                ", Отчество='" + middleName + '\'' +
                ", Отдел=" + department +
                ", Зарплата=" + salary +
                '}';
    }
}



