package AbstractClassesChallenge;


// IMPORTS of needed tools and plug-ins
import java.util.List;

public abstract class ListItem {

    private String name;
    private List values;
    private ListItem next;
    private ListItem previous;


    public ListItem(String name, List values) {
        this.name = name;
        this.values = values;
    }


    public String getName() {
        return name;
    }





    // @Override
    public int compareTo(ListItem listItem) {

        if(listItem.getName() == null){
            return -1;
        }

        if(this.name != null && listItem.getName() == null){
            return -1;
        }else if(this.name == null && listItem.getName() != null){
            return 1;
        }else if(this.name == null && listItem.getName() == null){
            return -1;
        }

        String nameLower = this.name.toLowerCase();
        String listItemLower = listItem.getName().toLowerCase();

        return nameLower.compareTo(listItemLower);
    }
}
