package AbstractClassesChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.List;

public class LinkedList extends ListItem {

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



}
