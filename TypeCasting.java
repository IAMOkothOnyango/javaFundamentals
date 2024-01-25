public class TypeCasting {
    public static void main(String[] args) {

        // Implicit casting a.k.a Widening Casting or Automatic Casting

        int myInt = 45;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        int smallerNumber = 5;
        double largerNumber = smallerNumber;

        System.out.println(smallerNumber);
        System.out.println(largerNumber);

        // Explicit casting a.k.a Narrowing Casting or Manual Casting

        double myDouble02 = 9.78d;
        int myInt02 = (int) myDouble02; // Explicit casting: double to int

        System.out.println(myDouble02);
        System.out.println(myInt02);
    }
}
