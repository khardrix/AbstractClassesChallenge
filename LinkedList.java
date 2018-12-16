package AbstractClassesChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.List;

public class LinkedList extends ListItem implements Comparable<LinkedList> {

    private String name;
    private ListItem current;


    public LinkedList(String name, List values) {
        super(values);
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public ListItem getCurrent() {
        return current;
    }


    public void setCurrent(ListItem current) {
        this.current = current;
    }


    @Override
    public int compareTo(LinkedList linkedList) {

        if(linkedList == null){
            return -1;
        }

        if(this.name != null && linkedList.getName() == null){
            return -1;
        }else if(this.name == null && linkedList.getName() != null){
            return 1;
        }else if(this.name == null && linkedList.getName() == null){
            return -1;
        }

        String nameLower = this.name.toLowerCase();
        String listItemLower = linkedList.getName().toLowerCase();

        return nameLower.compareTo(listItemLower);
    }
}
