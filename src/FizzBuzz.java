/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
    // Hello
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            doFizzBuzz(i);
            i++;
        }
    }

    public static void doFizzBuzz(int i) {
        if (i % 15 == 0) {
            System.out.println("Fizz Buzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}
