package Day1;
//Time complexity - O(N^2)
//Space complexity - O(n)
//where N is the total number of nodes in the multi layered linkedlist
class Node1 {
    int data;
    Node1 right;
    Node1 down;
    public Node1(int data) {
        this.data = data;
        this.right = null;
        this.down = null;
    }
}
class Operation {
    public Node1 flatten(Node1 head) {
        if(head == null || head.right == null) 
            return head;
        head.right = flatten(head.right);
        head = merge(head,head.right);
        return head;
    }
    public Node1 merge(Node1 a, Node1 b) {
        if(a == null)
            return b;
        if(b == null)
            return a;
        Node1 result;
        if(a.data<b.data) {
            result = a;
            result.down = merge(a.down,b);
        }
        else {
            result = b;
            result.down = merge(a, b.down);
        }
        return result;
    }
}
public class flattenLinked {
    public static void main(String[] args) throws Exception {
        Operation obj = new Operation();
        Node1 head = new Node1(1);
		head.down = new Node1(5);
        head.down.down = new Node1(9);
        head.right = new Node1(2);
        head.right.down = new Node1(6);
        head.right.right = new Node1(3);
        head.right.right.down = new Node1(7);
        head.right.right.down.down = new Node1(10);
        head.right.right.right = new Node1(4);
        head.right.right.right.down = new Node1(8);

        Node1 flattened = obj.flatten(head);
        System.out.print("Flattened Linked list: ");
        while(flattened!=null) {
            System.out.print(flattened.data+" ");
            flattened = flattened.down;
        }
    }
}


