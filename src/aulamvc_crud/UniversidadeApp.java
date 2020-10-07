package aulamvc_crud;

import DAO.DAO;
import VIEW.ViewAluno;
import java.sql.Connection;
import java.sql.SQLException;

public class UniversidadeApp {
    public static void main(String[] args) throws SQLException{
        ViewAluno view = new ViewAluno();
        view.setVisible(true);
    }
}
