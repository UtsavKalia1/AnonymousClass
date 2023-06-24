@FunctionalInterface
public interface CalInterest {
    double SimpleInterest(double principal,
                          double interest,
                          double rate,
                          double time);
    //when we write functional interface it means it can only
    // have one abstarct method
}
