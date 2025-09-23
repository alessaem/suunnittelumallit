
import java.util.*;

public class AccessControlService {
    private static AccessControlService instance;
    private Map<UUID,Set<String>> allowedUsers = new HashMap<>();

    public static AccessControlService getInstance(){
        if(instance == null){
            instance = new AccessControlService();
        }
        return instance;
    }

    public void addAccess(UUID id, String username){
        if(allowedUsers.containsKey(id)){
            allowedUsers.get(id).add(username);
        }else{
            Set<String> usernames = new HashSet<>();
            usernames.add(username);
            allowedUsers.put(id,usernames);
        }
    }

    public void removeAccess(UUID id, String username){
        if(allowedUsers.containsKey(id)){
            allowedUsers.get(id).remove(username);
        }
    }

    public boolean isAllowed(UUID id,String username){
        if(allowedUsers.containsKey(id)){
            return allowedUsers.get(id).contains(username);
        }else{
            return false;
        }
    }
}
