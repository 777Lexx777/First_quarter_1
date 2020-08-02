package employee;

public class Employee {
             String firstName;
             String lastName;
             String email;
             String position;
             int phoneNumber;
             int age;
             int theSalary;

    Employee(String firstName, String lastName, String email, String position, int foneNamber, int age,int theSalary){
        this.firstName = firstName ;
        this.lastName = lastName;
        this.email = email;
        this.position = position;
        this.phoneNumber = foneNamber;
        this.age = age;
        this.theSalary = theSalary;
    }

    public static void main(String[] args){
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov" , "Ivan",   "ivivan@mailbox.com","Engineer", 892312312, 33, 30000);
        persArray[1] = new Employee("Petrov" , "Petr",   "pepetr@mailbox.com","Engineer", 892312314, 41, 41000);
        persArray[2] = new Employee("Serov" , "Sergey",   "sesergey@mailbox.com","Engineer", 892312316, 32, 32000);
        persArray[3] = new Employee("Tolstoy" , "Lev",   "tolev@mailbox.com","Engineer", 892312318, 43, 43000);
        persArray[4] = new Employee("Turgenev" , "Ivan",   "tuivan@mailbox.com","Engineer", 892312320, 34, 34000);

        for (int y = 0; y < persArray.length; y++){
            if (persArray[y].getAge() > 40) persArray[y].getInfo();
        }
    }
    int getAge() {
        return age;
    }
    void getInfo() {
        System.out.println("firstname: " + firstName + " | name: " + lastName
                + " | email: " + email + " | position: " + position
                + " | phoneNumber: " + phoneNumber + " | age: " + age
                + " | theSalary: " + theSalary);
    }
}
