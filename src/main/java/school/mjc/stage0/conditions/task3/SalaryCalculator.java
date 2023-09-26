package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        //Basic Salary <= 10000: taxes - 15%.
        // 10000 < Basic Salary <= 20000: taxes - 18%
        // Basic Salary > 20000 : taxes - 20%
        // Basic salary < 0 -> "wrong input!"
        double rate;
        if(salary > 0 & salary <= 10000) {
            rate = 0.15;
        } else if (salary > 10000 & salary <= 20000) {
            rate = 0.18;
        } else if (salary > 20000) {
            rate = 0.2;
        } else {
            System.out.println("wrong input!");
            return;
        }
        double afterTax = salary - (salary * rate);
        System.out.println(afterTax);
    }
}
