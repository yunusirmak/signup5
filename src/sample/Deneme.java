package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Deneme implements Initializable {
    public BorderPane borderPane;
    public Button btnMovies;
    public Button btnProfile;
    public Label userLbl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadUI("ui1");
    }

    public void signoff(ActionEvent event){
        try {
            ((Node)event.getSource()).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/sample.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        }catch (Exception e){}

    }

    public void ui1(ActionEvent event){
        loadUI("ui1");
    }
    public void ui2(ActionEvent event){ loadUI("ui2");


    }

    public void loadUI(String ui){
        Parent root = null;
        try{
             root= FXMLLoader.load(getClass().getResource(ui+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(Deneme.class.getName()).log(Level.SEVERE, null, ex);
        }
        borderPane.setCenter(root);
    }

}
