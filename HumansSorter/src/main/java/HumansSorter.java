import java.util.ArrayList;
import java.util.LinkedList;

public class HumansSorter {
    public LinkedList<Human> sort(LinkedList<Human> humans) {
        boolean d = true;
        int maxAge = 100;
        int t = 0;
        Human h;
        int i = 0;
        int indexAge = 0;
        ArrayList<LinkedList<Human>> humanArray = new ArrayList<LinkedList<Human>>();
        for (int j = 0; j < 100; j++)
            humanArray.add(new LinkedList<Human>());
        for (int z = 0; z < humans.size(); z++) {
            Human human = humans.get(z);
//            indexAge=human.getAge();
            if (humanArray.get(human.getAge()).isEmpty()) {
                LinkedList<Human> newOne = humanArray.get(human.getAge());
                newOne.add(human);
                humanArray.set(human.getAge(), newOne);

            } else {
                LinkedList<Human> newOne = humanArray.get(human.getAge());
                newOne.add(human);
                humanArray.set(human.getAge(), newOne);
            }
        }
        LinkedList<Human> result = new LinkedList<Human>();
        for (int f = 0; f < 100; f++) {
            result.addAll(humanArray.get(f));
        }
        return result;
    }
}
