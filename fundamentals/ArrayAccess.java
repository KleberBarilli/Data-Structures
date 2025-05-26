package fundamentals;

public class ArrayAccess {
    public static int execute(int index) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Accessing index \u001B[33m" + index + "\u001B[0m");
        System.out.println("Value: \u001B[32m" + arr[index] + "\u001B[0m\n");

        return arr[index];
    }

    public static void ArrayAccess(String[] args) {
        execute(2);
    }
}
