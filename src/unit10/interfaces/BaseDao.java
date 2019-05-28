package unit10.interfaces;

/**
 * 带泛型的接口，完成数据的增删改查操作
 */
public interface BaseDao<T> {
    void save(T t);
}
