package lesson02_variables;

public class ReferenceTypesExample {
    public static void main(String[] args) {
        //String (chuoi ky tu)
        String myString = "Hello Java!";

        //Array (mang)
        int[] myArray = {1,2,3,4,5};

        //Doi tuong (object)
        Person person1 = new Person("Nguyen Van A", 20);

        //In ra man hinh
        System.out.println("String: " + myString);
        System.out.print("Array: ");
        for(int num : myArray){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Person Name: " + person1.name + ", Age: " + person1.age);
    }
}

// Lop Person (de tao doi tuong)
class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}