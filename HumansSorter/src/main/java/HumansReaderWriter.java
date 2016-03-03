import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class HumansReaderWriter {
    public LinkedList<Human> readHumans(String fileName) throws IOException {
        LinkedList<Human> humanList = new LinkedList<Human>();
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        scanner.useDelimiter(System.getProperty("line.separator"));
        scanner.close();
        scanner = new Scanner(Paths.get(fileName));
        scanner.useDelimiter(System.getProperty("line.separator"));
        while (scanner.hasNext()) {
            Human newHuman = parseHumanLine(scanner.next());
            humanList.add(newHuman);
        }
        scanner.close();
        scanner = new Scanner(System.in);
        return humanList;
    }

    private static Human parseHumanLine(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(" ");
        String name = scanner.next();
        int age = scanner.nextInt();
        return new Human(name, age);
    }

    public void writeHumans(String fileName, LinkedList<Human> humans) {
        try {
            OutputStream f = new FileOutputStream(fileName, false);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter out = new BufferedWriter(writer);
            for (int i = 0; i < humans.size(); i++) {
                out.write(String.valueOf(humans.get(i)));
                out.write(System.getProperty("line.separator"));
                out.flush();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
