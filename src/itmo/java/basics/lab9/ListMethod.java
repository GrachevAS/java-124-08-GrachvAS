package itmo.java.basics.lab9;

import java.util.*;

public class ListMethod {
    public static <T> Collection<T> uniqCollection(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}