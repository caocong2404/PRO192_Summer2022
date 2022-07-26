package SubStringandPool;

class A {

    public static int staticInt = 0;
    public int normalInt = 0;

    // We'll use this example to show how we can keep track of how many objects
    // of our class were created, by changing the shared staticInt variable
    static {
        System.out.println("Static block");
    }
    
    public A() {
        System.out.println("First: " + staticInt + " " + normalInt);
        staticInt++;
        normalInt++;
        System.out.println("Second: " + staticInt + " " + normalInt);

    }
}

class B extends A {

}

public class SubStringandPool {

    public static void main(String[] args) {

        System.out.println(A.staticInt); // Prints: 0
//System.out.println(A.normalInt); // this won't work, obviously

// Let's create two instances of StaticExample
        System.out.println("\nA object1 = new A();");
        A object1 = new A();

// We can refer to static variables via an object reference as well, 
// however this is not common practice, we usually access them via class name
// to make it obvious that a variable/method is static
        System.out.println(object1.staticInt); // Prints: 1
        System.out.println(object1.normalInt); // Prints: 1

        System.out.println("\nA object2 = new A();");
        A object2 = new A();

        System.out.println(object2.staticInt); // Prints: 2
        System.out.println(object2.normalInt); // Prints: 1

// We can see that increasing object2's staticInt 
// increases it for object1 (and all current or future objects of that class)
        System.out.println("\nobject1.staticInt = 10;\n"
                + "object1.normalInt = 10;");
        object1.staticInt = 10;
        object1.normalInt = 10;

        System.out.println(object2.staticInt); // Prints: 10
        System.out.println(object2.normalInt); // Prints: 1 (object2 retained its own value for normalInt as it depends on the class itself)
        
        System.out.println(32*(31 - 103));

    }
}
