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





//    @Override
//    public int compareTo(ListItem listItem) {
//
//        if(listItem == null){
//            return -1;
//        }
//
//        if( != null && listItem == null){
//            return -1;
//        }else if(this.name == null && listItem.getName() != null){
//            return 1;
//        }else if(this.name == null && listItem.getName() == null){
//            return -1;
//        }
//
//        String nameLower = this.name.toLowerCase();
//        String listItemLower = listItem.getName().toLowerCase();
//
//        return nameLower.compareTo(listItemLower);
//    }
}
