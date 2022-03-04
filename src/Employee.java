public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int year = 2021;
    int seniority;
    double taxAmount = 0;
    double increaseInSalary = 0;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    double bonus() {
        return (this.workHours > 40) ? (this.workHours - 40) * 30 : 0;
    }

    double raisSalary() {
        this.seniority = (this.year - this.hireYear);
        if (seniority < 10) {
            return this.increaseInSalary = this.salary * 0.05;
        } else if (seniority > 9 && seniority < 20) {
            return this.increaseInSalary = this.salary * 0.10;
        } else {
            return this.increaseInSalary = this.salary * 0.15;
        }
    }

    public String toString() {
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Çalışma saati : " + workHours);
        System.out.println("Başlangıç yılı : " + hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raisSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam maaş : " + (this.salary - tax() + bonus() + raisSalary()));
        return "";
    }
}
