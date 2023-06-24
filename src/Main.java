public class Main {
    public static void main(String[] args) {

    CalInterest calInterest = new CalInterest() {
        @Override
        public double SimpleInterest(double principal, double interest, double rate, double time) {
            return (principal*interest*rate*time)/100;
        }
    };

        System.out.println(calInterest.SimpleInterest(2, 3.5, 100, 60));
    }
}