package sem5_hw5.repository;

import sem5_hw5.model.Team;

import java.util.List;

public interface TeamRepository<T extends Team> {

    List<T> getAll();
    void add(T t);
    void remove(String teamName);
    Long getMaxId();

}
