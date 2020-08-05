
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr= {7,9,5,8,3,4,1,0,6,2};                               // USE OF ARRAY CLASS
        Arrays.sort(arr);
        System.out.println("----------------------------------------ARRAYS CLASS: ----------------------------------------\n\n"+Arrays.toString(arr));        // USE OF ARRAYS

        ArrayList<String> name = new ArrayList<>();
        name.add("Harsh");
        name.add("Pinak");
        name.add("Shrey");
        name.add("Axat");
        name.add("Malav");
        name.add("Kirtan");
        name.add("Kavya");
        name.add("Mayur");
        name.add("Shruti");
        name.add("Mansi");
        name.add("Khushi");
        System.out.println("\n\n\n----------------------------------------ARRAYS LIST :----------------------------------------\n");
        System.out.print(name);                                            // USE OF ARRAYS LIST

        System.out.println("\n\n\n----------------------------------------USE OF INHERITANCE SUPER THIS KEYWORD ABSTRACT CLASS----------------------------------------\n");
        Child B = new Child();                                             // USE OF INHERITANCE SUPER THIS KEYWORD ABSTRACT CLASS

    }
}
