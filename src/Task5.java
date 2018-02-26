public class Task5 {
    public static void main(String[] args){
        final int A = 1;
        final int B = 2;
        final int C = 4;

        double x = 0.5;
        double y;

        for (double i = 1; i <= 3; i = i + x) {
            y = (A * (Math.sin(i)) + B * (Math.log(i)) + Math.pow(i, 2) + C);
            System.out.println("Output = " + y);
        }
    }
}
