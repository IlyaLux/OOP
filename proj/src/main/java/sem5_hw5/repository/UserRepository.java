package sem5_hw5.repository;

import sem5_hw5.model.User;

import java.util.List;

public interface UserRepository<T extends User> {

    List<T> getAll();
    void add(T t);
    void remove(String name);
    Long getMaxId();

}
