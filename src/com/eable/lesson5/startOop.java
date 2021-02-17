package com.eable.lesson5;

public class startOop {
    public static void main(String[] args) {
        // 4. Создать массив из 5 сотрудников. (пихнул сюда, тут ему и место)
        Employee[] arrOfEmpl = new Employee[5];
        arrOfEmpl[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 15000, 30);
        arrOfEmpl[1] = new Employee("Petro AES", "Writer", "petro@mailbox.com", "893742678", 20000, 50);
        arrOfEmpl[2] = new Employee("Andrey Mandjos", "webDisigner", "ramek@mailbox.com", "899946562", 90000, 35);
        arrOfEmpl[3] = new Employee("Erik able", "soulOfCompany", "satan@mailbox.com", "899833534", 666666, 666);
        arrOfEmpl[4] = new Employee("Nikita Bes", "wagabond", "baph@mailbox.com", "668853367", 13666, 13);

        //  5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (Employee i : arrOfEmpl) {
            if (i.age > 40)
                System.out.println(i);
        }
    }
}
//  1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
// создал тут зная что так не следует делать(каждому классу свой файл)
class Employee{
    String name;
    String position;
    String mail;
    String phonNum;
    int salary;
    int age;

    // 2. Конструктор класса должен заполнять эти поля при создании объекта.

    public Employee(String name, String position, String mail, String phonNum, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phonNum = phonNum;
        this.salary = salary;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", mail='" + mail + '\'' +
                ", phonNum='" + phonNum + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}