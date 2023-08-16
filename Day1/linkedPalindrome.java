//Time complexity - O(n)
//Space complexity - O(n)
import java.util.ArrayList;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public boolean isPalindrome() {
        Node current = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(current!=null) {
            arr.add(current.data);
            current = current.next;
        }

        for(int i=0;i<arr.size()/2;i++) {
            if(arr.get(i)!=arr.get(arr.size()-i-1))
                return false;
        }
        return true;
    }
    public void display() {
        Node current = head;
        System.out.print("Linked List elements: ");
        while(current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
class linkedPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList obj = new LinkedList();
        System.out.print("Enter elements(-1 to exit): ");
        while(true) {
            int ele = sc.nextInt();
            if(ele==-1)
                break;
            obj.add(ele);
        }
        obj.display();
        boolean res = obj.isPalindrome();
        if(res)
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");
        sc.close();
    }
}