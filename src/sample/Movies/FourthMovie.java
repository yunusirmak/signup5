package sample;


import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class FourthMovie implements Initializable {

    public WebView web1;
    public WebEngine engine;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine = web1.getEngine();
        engine.loadContent("<iframe width=\"540\" height=\"300\" src=\"https://www.youtube.com/embed/tKwhs5u9z8c\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");

    }
}

