package patikaDev;

public class Employee {
  static String name;
  static double salary;
  static int workHours;
  static int hireYear;

     public static void main(String[] args) {
        employee("name",2000.0,45,1985);   //metoda argumanlar girildi
        Employee employeeObj=new Employee();
        System.out.println(employeeObj);                                  //obje yazdırıldı
    }
    static double employee(String name_, double salary_, int work_Hours,int hire_Year) { //vergi ve bonuslar ile birlikte maas
         name=name_;
        salary=salary_;
        workHours=work_Hours;
        hireYear=hire_Year;
        return salary + bonus() - tax();
    }
    static double raiseSalary() { //maas artısı return eden metod
        return ((2021 - hireYear) < 10) ? salary * 0.05 : (2021 - hireYear) < 20 ? salary * 0.10 : salary * 0.15;
    }
    static double bonus() {    //bonus hesaplayıp return eden metod
        return (workHours > 40) ? (workHours - 40) * 30 : 0;
    }
    static double tax() {      //vergiyi return eden metod
        return (salary < 1000) ? salary : salary * 0.03;
    }
    public String toString() {
        return "Adi : " + name +
                "\nMaasi :" + salary +
                "\nCalisma Saati :" + workHours +
                "\nYili : " + hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaas Artisi : " + raiseSalary()+
                "\nVergi ve Bonuslar ile birlikte maas : " + employee(name,salary,workHours,hireYear) +
                "\nToplam Maas : " + (employee(name,salary,workHours,hireYear)+raiseSalary());
    }
}