package sample;

import Connectivity.ConnectionClass;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Controller {
    public TextField txtSignupName;
    public TextField txtSignupSurName;
    public TextField txtSignupMail;
    public PasswordField txtSignupPassword;
    public Button btnSignup;
    public TextField txtLoginMail;
    public PasswordField txtLoginPassword;
    public Button btnLogin;
    public Label lblCreate;

    public void SignButton(ActionEvent actionEvent) throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        String sql="INSERT INTO signup_info VALUES ('"+txtSignupName.getText()+"','"+txtSignupSurName.getText()+"', '"+txtSignupMail.getText()+"', '"+txtSignupPassword.getText()+"') ";
        Statement statement=connection.createStatement();
        statement.executeUpdate(sql);

    }

    public void LogButton(ActionEvent actionEvent){
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        try {
            Statement statement=connection.createStatement();
            String sql="SELECT * FROM signup_info WHERE Email = '"+txtLoginMail.getText()+"' AND Password = '"+txtLoginPassword.getText()+"';";
            ResultSet resultSet=statement.executeQuery(sql);

            if (resultSet.next()){
                lblCreate.setText("Connected");
            }else {

                lblCreate.setText("Not Connected");
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
