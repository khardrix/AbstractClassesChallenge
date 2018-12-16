package AbstractClassesChallenge;


public abstract class ListItemInstructor {
    protected ListItemInstructor rightLink = null;
    protected ListItemInstructor lefttLink = null;

    protected Object value;

    public ListItemInstructor(Object value) {
        this.value = value;
    }

    abstract ListItemInstructor next();
    abstract ListItemInstructor setNext(ListItemInstructor item);
    abstract ListItemInstructor previous();
    abstract ListItemInstructor setPrevious(ListItemInstructor item);

    abstract int compareTo(ListItemInstructor item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
