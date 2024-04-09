package starter.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Data
public class ListOfUsersEntry {
    private List<ListOfUsersEntryModel> listOfUsersEntry;
}
