package sem4_hw.repository;

import sem4_hw.model.User;

import java.util.List;

public interface UserRepository<T extends User> {

    List<T> getAll();
    void add(T t);
    void removeUser(String name);
    Long getMaxId();

}
