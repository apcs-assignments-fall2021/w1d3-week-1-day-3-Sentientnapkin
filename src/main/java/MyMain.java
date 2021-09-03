public class MyMain {
    // Adds 5 to the given integer
    // This method has been written for you
    public static int add5(int x) {
        return (x + 5);
    }

    // Given three ints x, y, and z, this method
    // returns the largest of the three numbers
    public static int findBiggestNumber(int x, int y, int z) {
        // REPLACE THIS WITH YOUR CODE
        return Math.max(x,Math.max(y,z));
    }

    // This method simulates the flip of a coin, where
    // true represents "heads" and false represents "tails"
    // This method should return true half the time, and false the other half
    public static boolean flipCoin() {
        double rannum = Math.random();
        if (rannum>=0.5)
            return true;
        else
        return false;
    }

    // This method simulates the flip of a weighted coin,
    // that is a coin that is biased towards heads
    public static boolean flipWeightedCoin() {
        double rannum = Math.random();
        if (rannum>0.25)
            return true;
        else
        return false;
    }

    // This method rounds a double to the nearest whole number
    public static int round(double d) {
        if (d%1>=0.5) {
            int rounded = (int)((d - (d % 1)) +1); //casting
            return rounded;
        }
        else
            return (int)(d-(d%1));
    }

    // This method returns a random number between 1 and 6, inclusive
    public static int rollDie() {
        double rannum = Math.random();
        return (int) (rannum*6+1);
    }

    // This method carries out the quadratic formula and *prints* out the answers
    public static String quadForm(int a, int b, int c) {
        double quadraticpos = (-b + Math.sqrt(Math.pow((double)b,2)-(4*a*c)))/(2*a);
        double quadraticneg = (-b - Math.sqrt(Math.pow((double)b,2)-(4*a*c)))/(2*a);
        return "{"+quadraticpos+","+quadraticneg+"}";
    }

    public static void main(String[] args) {
        // Test the add5 method
        System.out.println(findBiggestNumber(3,9,5));
        System.out.println(quadForm(1,0,-1));
        // YOUR CODE HERE
    }
}