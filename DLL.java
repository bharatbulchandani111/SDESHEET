

class Node
{
    Node left, right;
    int data;

    Node(int d)
    {
        data = d;
        left = right = null;
    }

}

//This function should return head to the DLL

class DLL
{
    //Function to convert binary tree to doubly linked list and return it.
    static Node prev=null;
    static Node head=null;
    static Node bToDLL(Node root)
    {
        //  Your code here
        bbToDLL(root);
        return head;

    }
    static Node bbToDLL(Node root){
        if(root==null) return null;
        bbToDLL(root.left);
        if(prev==null)
        {
            head=root;
        }
        else{
            prev.right=root;
            root.left=prev;

        }
        prev=root;
        bbToDLL(root.right);
        return head;

    }

    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(13);
        root.right = new Node(10);
        root.right.left = new Node(14);
        root.right.right = new Node(15);
        Node left = root.right.left;
        Node right = root.right.right;
        left.left = new Node(21);
        left.right = new Node(24);
        right.left = new Node(22);
        right.right = new Node(23);

        Node head=bToDLL(root);
    }


}