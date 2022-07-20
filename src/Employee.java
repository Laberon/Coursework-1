import java.util.Objects;

public class Employee {
    private int department; //отдел
    private String fCS; //фио
    public int salary; //зп
    public int id;//идентификатор
    private static int size=1; //лучше отдел пускай начинается с 1-го
    public int expenses;

    public Employee(int department, String fCS, int salary) {
        this.department = department;
        this.fCS = fCS;
        this.salary = salary;
        id=size++;
    }
    public int getId() {
        return id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && fCS.equals(employee.fCS);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(fCS, salary, department);
        return result;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        department = department;
    }
    public String getFcs() {
        return fCS;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee. " +
                "Отдел \'" + department + '\'' +
                ", ФИО \'" + fCS + '\'' +
                ", Зарплата \'" + salary +
                '\'';
    }
    public int getExpenses() {
        return expenses;
    }
}