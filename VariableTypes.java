public class VariableTypes {

// Variables Syntax is as follows: dataType variableName = value;

    public static void main(String[] args) {
        int myNum = 15; // An integer variable called myNum is declared and assigned the value of 15
        System.out.println(myNum);  // prints 15

        double myDouble = 3.14; // A double variable called myDouble is declared and assigned the value of 3.14
        System.out.println(myDouble);  // prints 3.14

        String myString = "Hello"; // A String variable called myString is declared and assigned the value of "Hello"
        System.out.println(myString);  // prints Hello

        boolean myBoolean = true; // A boolean variable called myBoolean is declared and assigned the value of true
        System.out.println(myBoolean);  // prints true

        char myChar = 'A'; // A char variable called myChar is declared and assigned the value of 'A'
        System.out.println(myChar);  // prints A

        float myFloat = 3.14f; // A float variable called myFloat is declared and assigned the value of 3.14, with the 'f' suffix
        System.out.println(myFloat);  // prints 3.14

        long myLong = 123456789L; // A long variable called myLong is declared and assigned the value of 123456789, with the 'L' suffix
        System.out.println(myLong);  // prints 123456789

        short myShort = 32767; // A short variable called myShort is declared and assigned the value of 32767
        System.out.println(myShort);  // prints 32767

        byte myByte = 127; // A byte variable called myByte is declared and assigned the value of 127
        System.out.println(myByte);  // prints 127

        // You can also declare multiple variables in a single line
        int x, y, z;
        x = 5;
        y = 10;
        z = x + y;

        System.out.println(z);  // prints 15
        
        // You can also declare multiple variables in a single line
        int a = 5, b = 10, c = a + b;

        System.out.println(c);  // prints 15
        
    }
}
