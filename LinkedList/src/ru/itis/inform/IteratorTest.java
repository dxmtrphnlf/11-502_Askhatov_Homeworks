package ru.itis.inform;

import org.junit.Assert;


/**
 * Created by Sodium on 17.02.2016.
 */
public class IteratorTest {
    private LinkedList<String> linkedList;
    private Iterator<String> iterator;


    @org.junit.Before
    public void setUp() throws Exception {
        this.linkedList = new LinkedList<>();
        this.linkedList.add("привет");
        this.linkedList.add("как дела");
        this.linkedList.add("что делаешь");
        this.linkedList.add("пока");
        this.iterator = linkedList.iterator();
        this.iterator.next();
        this.iterator.insert("кап");
        this.linkedList.remove("пока");
    }

    @org.junit.Test
    public void testIterator() throws Exception {
        String[] expected = new String[4];
        expected[3] = "привет";
        expected[2] = "как дела";
        expected[1] = "что делаешь";
        expected[0] = "кап";
        for (int i = 0; i < 4; i++)
            Assert.assertEquals(expected[i], iterator.next());
    }
}
