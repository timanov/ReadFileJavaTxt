import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        String new_path = "C:\\Users\\ITQ\\Desktop\\SM_\\textFile\\src\\main\\java\\test.txt";

        try {
            FileData new_file = new FileData(new_path);
            String[] aryStrings = new_file.OpenAndRead();

            int i;
            for(i = 0; i < aryStrings.length; i++) {
                System.out.println(aryStrings[i]);
            }
        } catch (IOException a) {
            System.out.println(a.getMessage());
        }
    }
}
