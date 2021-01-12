import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DiagonalDifference{

    public static void main(String[] args) {

        List<List<Integer>> lista = new ArrayList();
        List<Integer> l1 = new ArrayList<>();
        AtomicInteger sumD1 = new AtomicInteger();
        AtomicInteger sumD2 = new AtomicInteger();
        l1.add(Integer.valueOf(1));
        l1.add(Integer.valueOf(2));
        l1.add(Integer.valueOf(3));
        lista.add(l1);
        lista.add(l1);
        lista.add(l1);
        AtomicInteger i = new AtomicInteger();
        lista.forEach(integers -> {
                    sumD1.addAndGet(integers.get(i.get()));

                    sumD2.addAndGet(integers.get(integers.size() -i.get()-1));

                    i.getAndIncrement();

                });

        System.out.println(Math.abs(sumD1.get()-sumD2.get()));


    }


}