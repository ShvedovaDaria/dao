import java.util.ArrayList;
import java.util.List;

    class UserDao implements Dao {
        private List<User> storage = new ArrayList<>();

        @Override
        public void addUser(User user) {
            storage.add(user);
        }

        @Override
        public User getOneUser() {
            return storage.isEmpty() ? null : storage.get(0);
        }

        public List<User> getStorage() {
            return storage;
        }
    }

