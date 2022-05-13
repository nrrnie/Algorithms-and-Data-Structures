package firstP;

import java.util.ArrayList;

public class node {
    String data;
    node next;
    public node () {
        this.data = null;
        this.next = null;
    }
    public node (String given) {
        this.data = given;
        this.next = null;
        //System.out.println(this.data);
    }
    public void insertToEnd (String given) {
        node temp = this; // start from the head
        //System.out.println(given);
        //System.out.println(temp.next);

        if (temp.data == null) { // if the head is empty
            temp.data = given; // add value
            return;
        }
        while (temp.next != null)
            temp = temp.next; // move

        // at temp.next == null:
        node newNode = new node(given);
        temp.next = newNode; // add new node at the end
    }
    @Override
    public String toString() {
        String res = "\tList: ";
        node temp = this;

        if (temp.next == null)
            return res + temp.data;

        while (temp.next != null) {
            res += temp.data + " ";
            temp = temp.next;
        }

        return res + temp.data;
    }

    public static void main(String[] args) {
        // for testing purposes:
        ArrayList<node> a = new ArrayList<>();
        node rererre = new node("new rerer");
        a.add(new node("new"));
        node head = new node();
        for (int i = 0; i < 5; i++) {
            head.insertToEnd("word");
            //System.out.println("\tat " + i);
        }
        a.add(head);
        a.add(rererre);
        System.out.println(head.data);
        System.out.println(rererre.data);
        rererre.insertToEnd("DATA12");
        System.out.println(rererre);
        rererre.insertToEnd("SKEDADDLED");
        System.out.println(rererre);
    }
}
