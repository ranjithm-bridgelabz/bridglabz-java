package Day28.AddresBookSystem;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UC13 {

    public static void main(String[] args) throws Exception {

        FileWriter writer = new FileWriter("address.txt");

        writer.write("Ranjith Chennai\n");
        writer.write("Arun Madurai\n");

        writer.close();

        Files.lines(Paths.get("address.txt"))
                .forEach(System.out::println);
    }
}
