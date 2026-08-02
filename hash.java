import java.util.*;
public class hash{

    public static int hashing(Object key, int tableSize) {
    int hash = key.hashCode() % tableSize;
    if (hash < 0) {
        hash += tableSize;
    }
    return hash;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hashvalue;        
      
        System.out.print("Enter the table size: ");
        int tableSize = scanner.nextInt();
        System.out.println("key is string? (y/n): ");
        String yn= scanner.next().toLowerCase();
        if(yn.equals("y")){
            System.out.println("enter your key(String) : ");
            String keyS= scanner.next();
            hashvalue = hashing(keyS, tableSize);
            System.out.println("hash value of key "+ keyS + " : "+hashvalue);
        }else if(yn.equals("n")){
            System.out.println("enter your key(Integer) : ");
            int keyI= scanner.nextInt();
            hashvalue = hashing(keyI, tableSize);
            System.out.println("hash value of key "+ keyI + " : "+hashvalue);
        }else{
            System.out.println("wrong data enterd");
        }  
    
    }

}