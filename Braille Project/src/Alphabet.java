import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.lang.Object;

public class Alphabet {
    private static Scanner Scan;
    private static String test;
    static Path path = Paths.get("/Users/Nathan/Documents/School Ref/Java/Braille Project/Hello World.txt");

    static Map<String, String[][]> map = new HashMap<>();

    // Will need to figure out a way where the user can select what file.
    public static void OpenFile() {
        try {
            test = Files.readString(path);
        } catch (Exception FileNotFoundException) {
            System.out.printf("Error Opening File");
        }

    }

    // "/Users/Nathan/Documents/School Ref/Java/Braille Project/Hello World.txt"
    public static void ReadFile() {
        try {
            test = Files.readString(path);

        } catch (Exception e) {
            System.out.printf("Read Error");
        }
    }

    public static void lowerCaps(String key) {
        String[] testkey = key.split("");
        String[][] caps = map.get("capital");
        if (Character.isUpperCase(key.charAt(0))) {
            for (String[] rows : caps) {
                for (String cell : rows) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void spacebar(String key) {
        String[][] space = map.get("space");
        if (key.equals(" ")) {
            for (String[] rows : space) {
                for (String cell : rows) {
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
            String[][] value = map.get(key);

            if (value != null) {

                for (String[] row : value) {
                    for (String cell : row) {
                        System.out.print(cell + " ");
                    }

                }
            }

        }
    }

    public static void StringtoBraille() {
        String[] CHARS = test.split("");
        List<String> afterSplit = Arrays.asList(CHARS);

        for (Object obj : afterSplit) {
            String key = (String) obj;

            lowerCaps(key);
            spacebar(key);
            key = key.toLowerCase();
            if (obj instanceof String) {
                String[][] value = map.get(key);
                if (value != null) {
                    for (String[] row : value) {
                        for (String cell : row) {
                            System.out.print(cell + " ");
                        }
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }

    }

    public static void closeFile() {
        if (Scan != null)
            Scan.close();

    }

    public static void main(String[] args) {
        // Braille Mapping ***************{ "3", "2", "1" }, { "6", "5", "4" }
        // letters
        map.put("a", new String[][] { { "O", "O", "X" }, { "O", "O", "O" } });
        map.put("b", new String[][] { { "O", "X", "X" }, { "O", "O", "O" } });
        map.put("c", new String[][] { { "O", "O", "X" }, { "O", "O", "X" } });
        map.put("d", new String[][] { { "O", "O", "X" }, { "O", "X", "X" } });
        map.put("e", new String[][] { { "O", "O", "X" }, { "O", "X", "O" } });
        map.put("f", new String[][] { { "O", "X", "X" }, { "O", "O", "X" } });
        map.put("g", new String[][] { { "O", "X", "X" }, { "O", "X", "X" } });
        map.put("h", new String[][] { { "O", "X", "X" }, { "O", "X", "O" } });
        map.put("i", new String[][] { { "O", "X", "0" }, { "O", "O", "X" } });
        map.put("j", new String[][] { { "O", "X", "O" }, { "O", "X", "X" } });
        map.put("k", new String[][] { { "X", "O", "X" }, { "O", "O", "O" } });
        map.put("l", new String[][] { { "X", "X", "X" }, { "O", "O", "O" } });
        map.put("m", new String[][] { { "X", "O", "X" }, { "O", "O", "X" } });
        map.put("n", new String[][] { { "X", "O", "X" }, { "O", "X", "X" } });
        map.put("o", new String[][] { { "X", "O", "X" }, { "O", "X", "O" } });
        map.put("p", new String[][] { { "X", "X", "X" }, { "O", "O", "X" } });
        map.put("q", new String[][] { { "X", "X", "X" }, { "O", "X", "X" } });
        map.put("r", new String[][] { { "X", "X", "X" }, { "O", "X", "O" } });
        map.put("s", new String[][] { { "X", "X", "O" }, { "O", "O", "X" } });
        map.put("t", new String[][] { { "X", "X", "O" }, { "O", "X", "X" } });
        map.put("u", new String[][] { { "X", "O", "X" }, { "X", "O", "O" } });
        map.put("v", new String[][] { { "X", "X", "X" }, { "X", "O", "O" } });
        map.put("w", new String[][] { { "O", "X", "O" }, { "X", "X", "X" } });
        map.put("x", new String[][] { { "X", "O", "X" }, { "X", "O", "X" } });
        map.put("y", new String[][] { { "X", "O", "X" }, { "X", "X", "X" } });
        map.put("z", new String[][] { { "X", "O", "X" }, { "X", "X", "O" } });
        // numbers
        map.put("1", new String[][] { { "O", "O", "X" }, { "O", "O", "O" } });
        map.put("2", new String[][] { { "O", "X", "X" }, { "O", "O", "O" } });
        map.put("3", new String[][] { { "O", "O", "X" }, { "O", "O", "X" } });
        map.put("4", new String[][] { { "O", "O", "X" }, { "O", "X", "X" } });
        map.put("5", new String[][] { { "O", "O", "X" }, { "O", "X", "O" } });
        map.put("6", new String[][] { { "O", "X", "X" }, { "O", "O", "X" } });
        map.put("7", new String[][] { { "O", "X", "X" }, { "O", "X", "X" } });
        map.put("8", new String[][] { { "O", "X", "X" }, { "O", "X", "O" } });
        map.put("9", new String[][] { { "O", "X", "O" }, { "O", "O", "X" } });
        map.put("0", new String[][] { { "O", "X", "O" }, { "O", "X", "X" } });
        map.put("number", new String[][] { { "X", "O", "O" }, { "X", "X", "X" } });
        //
        map.put("capital", new String[][] { { "O", "O", "O" }, { "X", "O", "O" } });
        map.put("space", new String[][] { { " ", " ", " " }, { " ", " ", " " } });

        OpenFile();
        ReadFile();

        StringtoBraille();
        closeFile();

        // for (int x = 0; x < Char.size(); x++) {
        // System.out.printf("%c%n", Char.get(x));
    }
}
