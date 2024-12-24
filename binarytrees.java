import java.util.*;
import java.math.*;

class Node{
    int data;

    Node left;

    Node right;

    Node(int data){
        this.data = data;
    }

    Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class binarytree{
    Node root;

    binarytree(){
        root=null;
    }

    void insert(int data){
        Node nn = new Node(data);

        if(this.root==null){
            root = nn;
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(this.root);
        Node temp;
        while (!q.isEmpty()){
            temp = q.poll();

            if(temp.left!=null){
                q.offer(temp.left);
            }else {
                temp.left= nn;
                break;
            }

            if(temp.right!=null){
                q.offer(temp.right);
            }else {
                temp.right = nn;
                break;
            }
        }
    }

    void inorder(Node temp){
        if(temp==null){
            return;
        }

        inorder(temp.left);
        System.out.print(temp.data+" ");
        inorder(temp.right);
    }

    void preorder(Node temp){
        if(temp==null){
            return;
        }

        System.out.print(temp.data+" ");
        preorder(temp.left);
        preorder(temp.right);
    }

    void postorder(Node temp){
        if(temp==null){
            return;
        }

        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data+" ");
    }

    void levelorder(){
        if(this.root==null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(this.root);
        while (!q.isEmpty()){
            Node temp = q.poll();

            System.out.print(temp.data+" ");

            if(temp.left!=null){
                q.offer(temp.left);
            }

            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }

    void height(){
        System.out.println(heighthelper(this.root));
    }

    int heighthelper(Node temp){
        if(temp==null){
            return 0;
        }

        int left = heighthelper(temp.left);
        int right = heighthelper(temp.left);

        return Math.max(left, right)+1;
    }

    void countnodes(){
        System.out.println(countnodeshelper(this.root));
    }

    int countnodeshelper(Node temp){
        if(temp==null){
            return 0;
        }

        int left  = countnodeshelper(temp.left);
        int right  = countnodeshelper(temp.right);

        return (left+right+1);
    }


}

public class binarytrees{
    public static void main(String[] args) {
        binarytree tree = new binarytree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(11);
        tree.insert(12);

        tree.inorder(tree.root);
        System.out.println();
        tree.preorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        System.out.println();
        tree.levelorder();
        System.out.println();

        tree.height();
        tree.countnodes();

    }
}