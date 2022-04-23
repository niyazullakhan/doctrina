public class SumOfTwoLists {
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value=value;
            this.next=null;
        }
        void setNext(Node node) {
            this.next=node;
        }
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(6);

        n1.next=n2;
        n2.next=n3;

        Node n4 = new Node(1);
        Node n5 = new Node(6);
        Node n6 = new Node(3);
        Node n7 = new Node(5);

        n4.next=n5;
        n5.next=n6;
        n6.next=n7;

        Node sum = addTwoNumbers(n1, n4);

        while(sum!=null) {
            System.out.println(sum.value);
            sum=sum.next;
        }
    }

    private static Node sum(Node n1, Node n4) {
        Node node=new Node(0);
        Node temp=node;
        int carry=0;
        while(n1!=null || n4!=null) {
            int sum = n1.value + n4.value+carry;

            carry=sum/10;
            sum=sum%10;

            node.next=new Node(sum);
            node=node.next;
            n1=n1.next;
            n4=n4.next;
        }

        if(n1!=null) {
            node.next=n1;
        }

        if(n4!=null) {
            node.next=n4;
        }
        if(carry>0) {
            node.next=new Node(carry);
        }
        return temp.next;
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.value : 0;
            int y = (q != null) ? q.value : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new Node(carry);
        }
        return dummyHead.next;
    }

}
