package Syahrani.si6a.uts.Armilo.DB;

import java.util.List;

public interface UserDao {
    void insert (User user);

    List<User> getAllUsers();


}
