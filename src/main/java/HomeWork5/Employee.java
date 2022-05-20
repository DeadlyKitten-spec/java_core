package HomeWork5;

public class Employee {
    String SNP;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String SNP, String position, String email, String phoneNumber, int salary, int age) {
        this.SNP = SNP;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "Ф.И.О. = '" + SNP + '\'' +
                ", должность = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", номер телефона = '" + phoneNumber + '\'' +
                ", зарплата = " + salary +
                ", возраст = " + age +
                '}';
    }
}
