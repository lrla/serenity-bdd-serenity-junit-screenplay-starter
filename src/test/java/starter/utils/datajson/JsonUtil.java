package starter.utils.datajson;

import com.google.gson.Gson;
import starter.model.ListOfUsersEntry;
import starter.utils.constants.Routes;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static starter.utils.constants.Routes.ROUTE_JSON_USERS;

public class JsonUtil {

    private Gson gson = new Gson();

    public ListOfUsersEntry jsonDataToObjectForUsersList() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream(ROUTE_JSON_USERS);
        Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        return gson.fromJson(reader, ListOfUsersEntry.class);
    }
}
