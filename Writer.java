package CW;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void write(String[] data) {
        try (FileWriter fw = new FileWriter(data[1], true)) {
            fw.append(String.join(" ", data)+"\n");
            fw.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
