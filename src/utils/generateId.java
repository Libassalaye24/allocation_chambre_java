package utils;

import java.util.UUID;

public class generateId {
    public static String generateUniqueId(){
        UUID id = UUID.randomUUID();
        return id.toString();
    }
}
