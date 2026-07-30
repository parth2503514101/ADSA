import java.util.*;
public class Hash_func {

    public int hash(int key, int tableSize) {
        return key % tableSize;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hash_func hashFunc = new Hash_func();
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        System.out.print("Enter the table size: ");
        int tableSize = scanner.nextInt();
        int hashValue = hashFunc.hash(key, tableSize);
        System.out.println("Hash value for key " + key + " is: " + hashValue);
    }
}