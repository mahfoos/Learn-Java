//package com.mahfoos.oop.w3schools;
//
//public class Modifiers {
//
////    The public keyword is an access modifier, meaning that it is used to set the access
////    level for classes, attributes, methods and constructors.
////
////    We divide modifiers into two groups:
////    Access Modifiers - controls the access level
////    Non-Access Modifiers - do not control access level, but provides other functionality
//
////    Access Modifiers
////    For classes, you can use either public or default:
//
//    //    The class is accessible by any other class
//    public class Main {
//        public static void main(String[] args) {
//            System.out.println("Hello World");
//        }
//    }
//
//    //    The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
//    class MyClass {
//        public static void main(String[] args) {
//            System.out.println("Hello World");
//        }
//    }
//
//    //    For attributes, methods and constructors, you can use the one of the following:
////The code is accessible for all classes
//    public class Main {
//        public String fname = "John";
//        public String lname = "Doe";
//        public String email = "john@doe.com";
//        public int age = 24;
//    }
//
//    //    The code is only accessible within the declared class
//    public class Main {
//        private String fname = "John";
//        private String lname = "Doe";
//        private String email = "john@doe.com";
//        private int age = 24;
//
//        public static void main(String[] args) {
//            Main myObj = new Main();
//            System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//            System.out.println("Email: " + myObj.email);
//            System.out.println("Age: " + myObj.age);
//        }
//    }
//
////    The code is only accessible in the same package. This is used when you don't specify a modifier.
//
//    class Person {
//        String fname = "John";
//        String lname = "Doe";
//        String email = "john@doe.com";
//        int age = 24;
//
//        public static void main(String[] args) {
//            Person myObj = new Person();
//            System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//            System.out.println("Email: " + myObj.email);
//            System.out.println("Age: " + myObj.age);
//        }
//    }
//
////    The code is accessible in the same package and subclasses.
//
//    class Person {
//        protected String fname = "John";
//        protected String lname = "Doe";
//        protected String email = "john@doe.com";
//        protected int age = 24;
//    }
//
//    class Student extends Person {
//        private int graduationYear = 2018;
//
//        public static void main(String[] args) {
//            Student myObj = new Student();
//            System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//            System.out.println("Email: " + myObj.email);
//            System.out.println("Age: " + myObj.age);
//            System.out.println("Graduation Year: " + myObj.graduationYear);
//        }
//    }
//
////    Non-Access Modifiers
////    For classes, you can use either final or abstract:
//
//    //    The class cannot be inherited by other classes
//    final class Vehicle {
//        protected String brand = "Ford";
//
//        public void honk() {
//            System.out.println("Tuut, tuut!");
//        }
//    }
//
//    class Main extends Vehicle {
//        private String modelName = "Mustang";
//
//        public static void main(String[] args) {
//            Main myFastCar = new Main();
//            myFastCar.honk();
//            System.out.println(myFastCar.brand + " " + myFastCar.modelName);
//        }
//    }
//
//    //    The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.
//// abstract class
//    abstract class Main {
//        public String fname = "John";
//        public String lname = "Doe";
//        public String email = "john@doe.com";
//        public int age = 24;
//
//        public abstract void study(); // abstract method
//    }
//
//    // Subclass (inherit from Person)
//    class Student extends Main {
//        public int graduationYear = 2018;
//
//        public void study() {
//            System.out.println("Studying all day long");
//        }
//    }
//
//
////    Final
////    If you don't want the ability to override existing attribute values, declare attributes as final:
//
//    public class Main {
//        final int x = 10;
//        final double PI = 3.14;
//
//        public static void main(String[] args) {
//            Main myObj = new Main();
//            myObj.x = 50; // will generate an error: cannot assign a value to a final variable
//            myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
//            System.out.println(myObj.x);
//        }
//    }
//
//
////    Abstract
////    An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:
//// Code from filename: Main.java
//// abstract class
//abstract class Main {
//    public String fname = "John";
//    public int age = 24;
//    public abstract void study(); // abstract method
//}
//
//    // Subclass (inherit from Main)
//    class Student extends Main {
//        public int graduationYear = 2018;
//        public void study() { // the body of the abstract method is provided here
//            System.out.println("Studying all day long");
//        }
//    }
//// End code from filename: Main.java
//
//    // Code from filename: Second.java
//    class Second {
//        public static void main(String[] args) {
//            // create an object of the Student class (which inherits attributes and methods from Main)
//            Student myObj = new Student();
//
//            System.out.println("Name: " + myObj.fname);
//            System.out.println("Age: " + myObj.age);
//            System.out.println("Graduation Year: " + myObj.graduationYear);
//            myObj.study(); // call abstract method
//        }
//    }
//
//
//
//
//
//}
