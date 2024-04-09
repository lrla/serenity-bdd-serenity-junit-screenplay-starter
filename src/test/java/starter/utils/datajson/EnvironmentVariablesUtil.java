package starter.utils.datajson;

import com.google.gson.Gson;
import starter.model.ListOfUsersEntry;


public class EnvironmentVariablesUtil {
    public EnvironmentVariablesUtil() {

    }
    public static ListOfUsersEntry getListOfUsersEntry() {
        ListOfUsersEntry listOfUsersEntry = JsonUtilSingleton.getUsersList();
        String usersListJson = new Gson().toJson(listOfUsersEntry);
        System.setProperty("LIST_USERS_REGISTRO", usersListJson);
        return listOfUsersEntry;
    }


}