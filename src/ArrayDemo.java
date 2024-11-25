import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    /*

     */
    public void useToString(){
        int[] numbers = {5,10,15,20,25};
        System.out.println("Array Elements: " + Arrays.toString(numbers));
        //toString method displays array in string format
    }

    public void useFill(){
        int[] numbers = new int[5];
        Arrays.fill(numbers, 7);
        System.out.println("Array Elements: " + Arrays.toString(numbers));
    }

    public void useSort(){
        int [] numbers = { 25, 10 , 55, 30, 5};
        Arrays.sort(numbers);
        System.out.println("Array Elements: " + Arrays.toString(numbers));
    }

    public void useForLoop(){
        int [] source = {5,10,15};
        int [] destination = new int [source.length];
        System.out.println("New Destination Array: ");
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
            System.out.println(destination[i]);
        }
    }
    public void useClone(){
        int [] source ={2,4,6,8};
        int [] destination = source.clone();
        System.out.println(Arrays.toString(destination));
    }

    public void useArrayCopy(){
        int [] source = {2,4,6};
        int []  destination = new int[source.length];
        System.arraycopy(source,0,destination, 0, source.length );
        System.out.println(Arrays.toString(destination));
    }
    public void useCopyOf(){
        int [] source = {6, 7, 8};
        int [] destination = Arrays.copyOf(source, source.length);
        System.out.println(Arrays.toString(destination));
    }
    public void useAssignmentStatements(){
        int [] source = {5,10,15};
        int [] destination = source;
        //points to the same location
        System.out.println(Arrays.toString(destination));
    }
    public void populateArray() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for (int num : numbers) {
            System.out.println(num);
        }
    }




        }
    }
}

