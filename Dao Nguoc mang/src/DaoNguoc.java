
import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        size = scanner.nextInt();
        if (size < 0 && size > 20){
            System.out.println("khong duoc qua 20");
        }
        System.out.println("nhap cac phan tu trong mang");
        int[]array = new int[size];
        int i = 0;
        while (i < size){
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("mang");
        for (int k : array) System.out.print(k + " ");
       // System.out.println(Arrays.toString(array)); // ham in mang
        System.out.println();
//        for (int j = 0; j < array.length; j++) {
//        int a = array[j];
//        array[j] = array[size - 1 - j];
//        array[size -1 - j]= a;
//        }
//        for (int k = 0; k < array.length; k++) {
//            System.out.print(array[k] + " ");

 //       }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println( "mang dao nguoc: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +" " );
        }
    }
    }

