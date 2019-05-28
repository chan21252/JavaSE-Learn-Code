package unit10.generic;

public class GenericClass<T> {
    public String getClassName(T t){
        return t.getClass().getName();
    }
}
