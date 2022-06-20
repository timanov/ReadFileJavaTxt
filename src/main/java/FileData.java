import java.io.*;

public class FileData {
    private String path_to_file;

    public FileData(String path) {
        path_to_file = path;
    }

    public String[] OpenAndRead() throws IOException {

        Reader x = new InputStreamReader(new FileInputStream(path_to_file), "Cp1251");
        BufferedReader varRead = new BufferedReader(x);

        int num = numStrings();
        String[] lines = new String[num];

        int i;
        for (i = 0; i < num; i++) {
            lines[i] = varRead.readLine();
        }

        varRead.close();
        return lines;
    }

    int numStrings() throws IOException {

        Reader text = new InputStreamReader(new FileInputStream(path_to_file), "Cp1251");
        BufferedReader y = new BufferedReader(text);

        String one;
        int num = 0;

        while ((one = y.readLine()) != null) {
            num++;
        }
        y.close();

        return num;
    }
}