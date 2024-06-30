package itmo.java.basics.lub9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapSearch {
    public static User searchUser(Set<User> userSet, String name) {
        for (User element : userSet) {
            if (element.getName().equals(name)) {
                return element;
            }
            ;
        }
        return null;
    }

    public static Integer SearchValueByKey(Map<User, Integer> map, User user) {
        for (Map.Entry<User, Integer> pair : map.entrySet()) {
            if (pair.getKey().equals(user)) return pair.getValue();
        }
        return null;
    }
}
