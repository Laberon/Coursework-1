import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee(1, "РАБОТИН Агафон Арефович", 1_000);
        employees[1] = new Employee(2, "НАБИЕВА Беатрис Бенедиктович", 2000);
        employees[2] = new Employee(3, "ДАНИЛЕЙКО Вальтер Вадимович", 3000);
        employees[3] = new Employee(4, "ХАВИН Дамир Венедиктович", 4000);
        employees[4] = new Employee(5, "ШАБАШЕВ Егор Виссарионович", 5000);
        employees[5] = new Employee(5, "ЗАДОРИНа Зарина Вячеславович", 10000);
        employees[6] = new Employee(4, "ЗАБАВИНа Карина Гуриевич", 20000);
        employees[7] = new Employee(3, "ГАВРИКОВ Макарий Денисович", 30000);
        employees[8] = new Employee(2, "РАГИМОВ Назарий Евлампиевич", 40000);
        employees[9] = new Employee(1, "ШАМСУТДИНОВ Петр Ефремович ", 50000);
        printSeparator();
        allPrint(employees);
        printSeparator();
        salarySum(employees);
        printSeparator();
        salaryMinMax(employees);
        printSeparator();
        salaryAverage(employees);
        printSeparator();
        fCSPrint(employees);
        printSeparator();
        salaryIndexing(employees);
    }

    public static void allPrint(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void printSeparator() {
        System.out.println("--------------------------------");
        System.out.println();
    }

    public static int salarySum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц= " + sum);
        return sum;
    }

    public static int salaryMinMax(Employee[] employees) {
        int j = 0;
        int min = employees[j].getSalary();
        int max = employees[j].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalary()) {
                min = min + employees[i].getSalary();
            } else {
                max = employees[i].getSalary();
            }
        }
// }
        System.out.println("Минимальная зарплата= " + min);
        System.out.println("Максимальная зарплата= " + max);
        return min;
    }

    public static int salaryAverage(Employee[] employees) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
            average = sum / employees.length;
        }
        System.out.println("Среднее значение= " + average);
        return sum;
    }

    public static String fCSPrint(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFcs());
        }
        return null;
    }

    public static void salaryIndexing(Employee[] employees) {
        double percent = 8;
        double arr = percent / 100;
        double indexingOfSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            indexingOfSalary = arr * employees[i].getSalary() + employees[i].getSalary();
            System.out.println("Процент индексации- " + percent + "%. Сумма зарплаты с индексацией- " + indexingOfSalary);
        }
    }
}