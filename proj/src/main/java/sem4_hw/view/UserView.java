package sem4_hw.view;

import sem4_hw.model.User;

public interface UserView<T extends User> {

    void sendOnConsole(String sortType);  // GET request
    void create(String fullName, Integer age, String phoneNumber);  // POST request
    void removeUser(String fullName);  // DELETE request
    // PUT request - in case of editing
    void edit(String fullName, Integer age, String phoneNumber);
}