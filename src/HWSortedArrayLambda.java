import java.util.Arrays;

public class HWSortedArrayLambda {

    public static void main(String[] args) {
        String[][] staffArray = {{"Christian", "Novikov"},
                {"Daniil", "Bekker"},
                {"Christian", "Schultz"},
                {"Hellen", "Jungerhans"},
                {"Daniil", "Hefel"}};

        System.out.println("Unsorted array.\n=========================");
        System.out.println(Arrays.deepToString(staffArray));
        System.out.println();

        Arrays.sort(staffArray, (String[] o1, String[] o2) -> {
            return o1[0].compareTo(o2[0]) == 0 ? o1[1].compareTo(o2[1]): o1[0].compareTo(o2[0]);
        } );


        System.out.println("Sorted array.\n=========================");
        System.out.println(Arrays.deepToString(staffArray));
    }
}

