package behavioral;

import behavioral.iterator.AfterList;
import behavioral.iterator.Aggregate;
import behavioral.iterator.BeforeList;
import behavioral.iterator.Iterator;
import org.junit.Test;

/**
 * Created by sggb on 2017/7/4.
 */
public class IteratorTest {

    @Test
    public void test() {
        Aggregate<Integer> aggregate1 = new AfterList<>();
        aggregate1.add(1);
        aggregate1.add(2);
        aggregate1.add(3);

        Iterator iterator1 = aggregate1.createIterator();
        for (iterator1.first();!iterator1.isDone(); iterator1.next()) {
            System.out.println(iterator1.currentItem());
        }

        Aggregate<Integer> aggregate2 = new BeforeList<>();
        aggregate2.add(1);
        aggregate2.add(2);
        aggregate2.add(3);
        Iterator iterator2 = aggregate2.createIterator();
        for (iterator2.first();!iterator2.isDone(); iterator2.next()) {
            System.out.println(iterator2.currentItem());
        }

    }
}
