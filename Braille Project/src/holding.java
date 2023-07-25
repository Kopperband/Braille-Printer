public class holding {
    // Spaces
    if (key.equals(" ")) {
        for (String[] rows : space) {
            for (String cell : rows) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        if (value != null) {

            for (String[] row : value) {
                for (String cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();

            }
        }

    }
// Uppercase
String[][] caps = map.get("capital");
if (key.toUpperCase().equals(key)) {

    for (String[] rows : caps) {
        for (String cell : rows) {
            System.out.print(cell + " ");
        }
        System.out.println();
    }
    if (value != null) {

        for (String[] row : value) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();

        }
    }
}
}
