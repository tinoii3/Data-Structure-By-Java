package HW;
import java.util.Random;
public class LabArray {
    public static void main(String[] args) {
        /*ArrayList<Integer> arr = new ArrayList<Integer>();
        
        arr.add(26);
        arr.add(5);
        arr.add(92);
        arr.add(12);
        arr.add(50);
        arr.add(34);
        arr.add(20);
        arr.add(99);
        arr.add(100);
        arr.add(1);
        
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        
        System.out.println("Size of array : "+ arr.size());
        System.out.println("Show : "+ arr);
        System.out.println("Maximum value of array : "+ max);
        */

        Random rand = new Random();
        int arr2d[][] = new int[15][2];
        int sum = 0;
        
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                int random = rand.nextInt(31);
                arr2d[i][j] = random;
            }
        }
        
        int count = 1;
        for (int row[] : arr2d) {
            System.out.print("Score No."+count+" = ");
            for (int col : row) {
                System.out.print(String.format("| %2d | ", col));
                sum += col;
            }
            System.out.print("And Sumation = "+sum);
            System.out.println();
            sum = 0;
            count += 1;
        
        }
    }
}
