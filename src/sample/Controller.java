package sample;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.control.Alert.AlertType;

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

    TilePane r = new TilePane();

    Alert a = new Alert(Alert.AlertType.NONE);


    public void SignButton(ActionEvent actionEvent) throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();


        if(txtSignupName.getText().isEmpty()) {
            Alert a1 = new Alert(AlertType.NONE,
                    "Enter Your First Name",ButtonType.OK);

            // show the dialog
            a1.show();
            return;
        }
        if(txtSignupSurName.getText().isEmpty()) {
            Alert a1 = new Alert(AlertType.NONE,
                    "Enter Your Last Name",ButtonType.OK);

            // show the dialog
            a1.show();
            return;
        }
        if(txtSignupMail.getText().isEmpty()) {
            Alert a1 = new Alert(AlertType.NONE,
                    "Enter Your E-Mail Address",ButtonType.OK);

            // show the dialog
            a1.show();
            return;
        }
        if(txtSignupPassword.getText().isEmpty()) {
            Alert a1 = new Alert(AlertType.NONE,
                    "Enter Your Password",ButtonType.OK);

            // show the dialog
            a1.show();
            return;
        }else {

            String sql="INSERT INTO signup_info VALUES ('"+txtSignupName.getText()+"','"+txtSignupSurName.getText()+"', '"+txtSignupMail.getText()+"', '"+txtSignupPassword.getText()+"') ";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);

            Alert a1 = new Alert(AlertType.NONE,
                    "Registration is Successful!",ButtonType.OK);

            // show the dialog
            a1.show();
            return;
        }

    }

    private void showAlert(Alert.AlertType error, Window window, String s, String please_enter_your_name) {
    }

    public void LogButton(ActionEvent actionEvent){
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        try {
            Statement statement=connection.createStatement();
            String sql="SELECT * FROM signup_info WHERE Email = '"+txtLoginMail.getText()+"' AND Password = '"+txtLoginPassword.getText()+"';";
            ResultSet resultSet=statement.executeQuery(sql);

            if (resultSet.next()){
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/second.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();


            }else {
                Alert a1 = new Alert(AlertType.NONE,
                        "Your username or password is incorrect",ButtonType.OK);

                // show the dialog
                a1.show();
                return;
            }



        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
