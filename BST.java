import java.util.Scanner;

public class BST {
    static class Node {
        int data;
        Node right;
        Node left;    
        
        Node(int val){
            this.data = val;
        }
    }
    public static Node Insert(Node root,int val){
        if(root== null){
            return new Node(val);
        }
        
        if(root.data>val){
            root.left= Insert(root.left, val);
        }
        else{
            root.right= Insert(root.right, val);
        }
        return root;
    }

    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        Inorder(root.left);
        Inorder(root.right);
    }
    public static void Postorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        Inorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("enter the no of element : ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the element : ");
        
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++){
            root = Insert(root, a[i]);
        }
        System.out.println("printin Inorder : ");
        Inorder(root);
        System.out.println(" ");
        System.out.println("printin Preorder : ");
        Preorder(root);       
        System.out.println(" ");
        System.out.println("printin Postorder : ");
        Postorder(root);
    }
}
