public class Main {
    public static void main(String[] args) {

    CalInterest calInterest = new CalInterest() {
        @Override
        public double SimpleInterest(double principal, double interest, double rate, double time) {
            return (principal*interest*rate*time)/100;
        }
    };
    // we will use lamda now
        // lamda and anonymous class both
        // we want to use inline implementation of logic
    CalInterest calInterestlamda = (p,  i,  r,  t) -> {
            return (p*i*r*t)/100;
        };
        CalInterest calInterestlamda1 = (p,  i,  r,  t) -> (p*i*r*t)/100;
    // with lamda we can only have implementation of
        //abstarct class(functional interface
        System.out.println(calInterestlamda1.SimpleInterest(2, 3.5, 100, 60));
    }
}