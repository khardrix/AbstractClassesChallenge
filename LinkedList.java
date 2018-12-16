package AbstractClassesChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.List;

public class LinkedList extends ListItem {

    private ListItem current;


    public LinkedList(String name, List values) {
        super(name, values);
    }


    public ListItem getCurrent() {
        return current;
    }


    public void setCurrent(ListItem current) {
        this.current = current;
    }



}
