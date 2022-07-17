import java.util.Objects;

public class Employee {
    private int Department; //отдел
    private String Fcs; //фио
    public int Salary; //зп
    public static int id;//идентификатор
    private int size;
    public int expenses;

    private static int getMax(int[] Salary)
    {
        int max = Integer.MIN_VALUE;
        for (int i: Salary) {
            max = Math.max(max, i);
        }

        return max;
    }
    public Employee(int Department, String Fcs, int Salary) {
        this.Department = Department;
        this.Fcs = Fcs;
        this.Salary = Salary;
    }


    public int getId() {
        return id = ++id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Salary == employee.Salary && Department == employee.Department && Fcs.equals(employee.Fcs);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(Fcs, Salary, Department);
        return result;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public String getFcs() {
        return Fcs;
    }

    public int getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee. " +
                "Отдел \'" + Department + '\'' +
                ", ФИО \'" + Fcs + '\'' +
                ", Зарплата \'" + Salary +
                '\'';
    }


    public int getExpenses() {
        return expenses;
    }
}
