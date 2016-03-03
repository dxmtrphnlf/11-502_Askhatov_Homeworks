import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Human> list=new LinkedList<Human>();
        HumansReaderWriter s = new HumansReaderWriter();
        HumansSorter d = new HumansSorter();
        list=s.readHumans("Humans.txt");
        list=d.sort(list);
        s.writeHumans("SortedHumans.txt", list);
    }
}
