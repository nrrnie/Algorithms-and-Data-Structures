package firstP;

import java.util.ArrayList;

public class hashTable {
    private ArrayList<node> arrayOfLists;
    private int size;

    public hashTable () {
        size = 11;
        arrayOfLists = new ArrayList<node>(size);
        //System.out.println(arrayOfLists);
        for (int i = 0; i < size; i++) {
            node temp = new node();
            arrayOfLists.add(temp);
        }
        //System.out.println(arrayOfLists);
    }
    public int hashFunc (int key) {
        return key % size;
    }
    public void insert (int key, String givenData) {
        System.out.println("Inserting Data \"" + givenData + "\" to index " + hashFunc(key));
        arrayOfLists.get(hashFunc(key)).insertToEnd(givenData);
        //System.out.println(arrayOfLists.get(hashFunc(key)).getClass());
        System.out.println(arrayOfLists.get(hashFunc(key)));
    }
    public void print () {
        System.out.println("Table:\n\tSize = " + size);
        for (int i = 0; i < size; i++)
            System.out.println(Integer.toString(i) + arrayOfLists.get(i));
    }


    public static void main(String[] args) {
        hashTable A = new hashTable();
        String DATA = "DATA_";
        A.insert(1, DATA + 1);
        A.insert(32, DATA + 32);
        A.insert(11, DATA + 11);
        A.insert(21, DATA + 12);
        A.print();

    }
}
