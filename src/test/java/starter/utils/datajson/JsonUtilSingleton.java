package starter.utils.datajson;
import starter.model.ListOfUsersEntry;

import java.util.Map;
import java.io.FileNotFoundException;

public class JsonUtilSingleton {

    private static ListOfUsersEntry listOfUsersEntry;

    public static ListOfUsersEntry getUsersList() {
        try {
            if (listOfUsersEntry == null) {
                listOfUsersEntry = new JsonUtil().jsonDataToObjectForUsersList();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
        return listOfUsersEntry;
    }
}

