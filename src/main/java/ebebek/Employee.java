package ebebek;
public class Employee {
    private String name;
    private Double salary;
    private int workHours;
    private int hireYear;
    public Employee(String name, Double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double toplamMaas(double taxHesapla, double bonusHesapla, double raiseSalaryy, Double salary) {
        double toplamMaasDegeri = salary + bonusHesapla + raiseSalaryy - taxHesapla;
        return toplamMaasDegeri;
    }
    public double raiseSalaryy(int hireYear, double salary) {
        double raiseSalary = 0.0;
        if ((2021 - hireYear) < 10) {
            raiseSalary = salary * 0.05;
        } else if ((2021 - hireYear) > 10 || (2021 - hireYear) < 20) {
            raiseSalary = salary * 0.1;
        } else if ((2021 - hireYear) >= 20) {
            raiseSalary = salary * 0.15;
        }
        return raiseSalary;
    }
    public double bonusHesapla(double workHours) {
        double bonusUcret;
        if (workHours > 40) {
            bonusUcret = (workHours - 40) * 30;
        } else bonusUcret = 0.0;
        return bonusUcret;
    }
    public double taxHesapla(double salary) {
        double tax;
        if (salary < 1000) {
            tax = 0.0;
        } else {
            tax = salary * 0.03;
        }
        return tax;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "Adi='" + name +
                ", Maasi=" + salary +
                ", Calisma Saati=" + workHours +
                ", Baslangic Yili=" + hireYear +
                ", Vergi=" + taxHesapla(salary) +
                ", Bonus=" + bonusHesapla(workHours) +
                ", Maas Artisi=" + raiseSalaryy(hireYear, salary) +
                ", Toplam Maas=" + toplamMaas(taxHesapla(salary), bonusHesapla(workHours), raiseSalaryy(hireYear, salary), salary) +
                '}';
    }


}