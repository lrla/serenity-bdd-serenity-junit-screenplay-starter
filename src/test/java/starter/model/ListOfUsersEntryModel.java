package starter.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ListOfUsersEntryModel {
    private String nombre;
    private String apellido;
    private String correo_electronico;
    private String contrasena;
    private String repita_contrasena;
    private boolean isUsed;

}
