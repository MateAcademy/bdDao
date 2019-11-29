package mate.academy.lessons.lesson1;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;

public class MainTest {
    @Test
    public void test1() {
        assert (new Main().sum(1, 2) == 3);
    }

    @Test
    public void test2() {
        assert (new Main().mult(5, 7) == 35);
    }

    @Test
    public void test3() {
        assert (new Main().mult(5, 7) == 35);
    }

    @Test
    public void whenAddingElement__shouldAddElement() {
        Set<String> hashset = new HashSet<>();
//      hashset.add("String Added");
        assertTrue(hashset.add("String Added"));
    }

    @Test
    public void whenCheckingForElement__shouldSearchForElement() {
        Set<String> hashsetContains = new HashSet<>();
        hashsetContains.add("String Added");

        assertTrue(hashsetContains.contains("String Added"));
    }
    @Test
    public void whenIteratingHashSet__shouldIterateHashSet() {
        Set<String> hashset = new HashSet<>();
        hashset.add("First");
        hashset.add("Second");
        hashset.add("Third");
        Iterator<String> itr = hashset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}