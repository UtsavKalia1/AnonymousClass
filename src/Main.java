import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

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

        List<String> names = Arrays.asList("Utsav", "Sam", "Varun");


//        Comparator callll = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        };

//        default void sort(Comparator<? super E> c) {
//            Object[] a = this.toArray();
//            Arrays.sort(a, (Comparator) c);
//            ListIterator<E> i = this.listIterator();
//            for (Object e : a) {
//                i.next();
//                i.set((E) e);
//            }
//        }
        names.sort((x,y) -> x.compareTo(y));
        System.out.println(names);
        Consumer cc = new Consumer() {
            @Override
            public void accept(Object o) {

            }
        };
        names.forEach((s) -> System.out.println("Hello "+s + "."));


    }


// using lamda for interface

    //Comparator is functional
    //interface
    //comparable is not functional
    //interface
    //methos is compareto -> comparable
}