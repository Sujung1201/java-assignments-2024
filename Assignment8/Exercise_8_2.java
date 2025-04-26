public class Exercise_8_2 {
    public static void main(String[] args) {
        System.out.println("Miles\tkilometers");

        for (int miles = 5; miles <= 100; miles += 5) {
            double kilometers = miles * 1.609;
            System.out.printf("%d\t%.3f\n", miles, kilometers);
        }
    }
}
