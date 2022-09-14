package Kursovaya;

import java.util.Arrays;

public class Basic {


    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee emp1 = new Employee("Сергей", "Викторович", "Королев", 1, 355000);
        Employee emp2 = new Employee("Александра", "Александровна", "Довидович", 1, 150000);
        Employee emp3 = new Employee("Виктория", "Сергеевна", "Иванова", 2, 175000);
        Employee emp4 = new Employee("Даниил", "Сергеевич", "Петров", 2, 183000);
        Employee emp5 = new Employee("Мария", "Владимировна", "Чернетта", 3, 125000);
        Employee emp6 = new Employee("Вадим", "Александрович", "Зайцев", 3, 140000);
        Employee emp7 = new Employee("Татьяна", "Викторовна", "Мишура", 4, 138000);
        Employee emp8 = new Employee("Ольга", "Ивановна", "Батура", 4, 141000);
        Employee emp9 = new Employee("Екатерина", "Владимировна", "Шпакова", 5, 110000);
        Employee emp10 = new Employee("Юлия", "Николаевна", "Якубовская", 5, 108000);

        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        employees[3] = emp4;
        employees[4] = emp5;
        employees[5] = emp6;
        employees[6] = emp7;
        employees[7] = emp8;
        employees[8] = emp9;
        employees[9] = emp10;
        Employee emp[] = Arrays.copyOf(employees, 11);

        Arrays.stream(emp).forEach(System.out::println);
        System.out.println(emp.length);

    }

    public static void printEmployees(){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary(){
        int sum = 0;
        for(Employee employee : employees){
            sum += employee.getSalary();
            System.out.println(sum);
        }
        return sum;
}


   public static Employee findEmployeeWithMinSalary(){
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees){
            if(employee.getSalary() < minSalary){
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee findEmployeeWithMaxSalary(){
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees){
            if(employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float calculateAverageSalary(){
        int count = 0;
        int sum = 0;
        for (Employee employee : employees){
            if (employee!= null){
                count++;
                sum += employee.getSalary();
            }
        }
        return  (float) sum / count;
    }
    public static void printFullNames(){
        for (Employee employee : employees){
            System.out.println(employee.getLastName());
        }
}
}
