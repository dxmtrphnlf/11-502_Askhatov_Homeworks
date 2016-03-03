import org.junit.Assert;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class HumansSorterTest {

    LinkedList<Human> list = new LinkedList<Human>();
    LinkedList<Human> expected = new LinkedList<Human>();

    @org.junit.Before
    public void setUp() throws Exception {
        HumansReaderWriter s = new HumansReaderWriter();
        HumansSorter d = new HumansSorter();
        list = s.readHumans("C:\\Users\\Sodium\\IdeaProjects\\HumansTest.txt");
        list = d.sort(list);
        s.writeHumans("C:\\Users\\Sodium\\IdeaProjects\\SortedHumansTest.txt", list);
        list = s.readHumans("C:\\Users\\Sodium\\IdeaProjects\\SortedHumansTest.txt");
    }

    @org.junit.Test
    public void testHumanSort() throws Exception {
        expected.add(new Human("Varya", 2));
        expected.add(new Human("Dima", 11));
        expected.add(new Human("Arkadii", 22));
        expected.add(new Human("Vika", 31));
        expected.add(new Human("Vasya", 42));
        expected.add(new Human("Kolya", 72));
        expected.add(new Human("Jorik", 92));
        String[] stringList = new String[7];
        String[] stringExpected = new String[7];
        for(int i=0;i<7;i++) {
            stringExpected[i]=expected.get(i).getName()+" "+expected.get(i).getAge();
            stringList[i]=list.get(i).getName()+" "+list.get(i).getAge();
        }

        Assert.assertArrayEquals(stringExpected, stringList);
    }
}