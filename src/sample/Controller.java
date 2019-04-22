package sample;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
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
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/second.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();


            }else {

                lblCreate.setText("Not Connected");
            }



        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
