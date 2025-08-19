public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 12, 12, 6, 8};

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
