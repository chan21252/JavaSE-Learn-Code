package unit7;

public class Child extends Parent {
    public String getParentName() {
        //return super.getName();
        return this.getName();
    }
}
