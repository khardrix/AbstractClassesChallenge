package AbstractClassesChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.List;

public abstract class ListItem {

    private List values;
    private ListItem next;
    private ListItem previous;


    public ListItem(List values) {
        this.values = values;
    }
}
