//for the linked list add 1 to the last element of the linked list
import java.util.LinkedList;

public class AddOneToTailOfLL {
    public static void main(String[] args) {
       System.out.println(addOneToendOfLL());
    }
    private static LinkedList<Integer> addOneToendOfLL() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        LinkedList<Integer> newlist = new LinkedList<>();
        for(int i = 0;i<list.size();i++){
            if(i==list.size()-1){
                newlist.add(list.get(i)+1);
            }
            else {
                newlist.add(list.get(i));
            }
        }
        return newlist;
    }
}
