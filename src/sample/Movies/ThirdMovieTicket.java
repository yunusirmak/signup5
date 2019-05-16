package sample.Movies;

import Connectivity.ConnectionClass;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ThirdMovieTicket implements Initializable {
    public Button a1seat;
    public Button a2seat;
    public Button Purchase;
    public ComboBox session;
    public Button a3seat;
    public Button b1seat;
    public Button b2seat;
    public Button b3seat;
    public Button b4seat;
    public Button c1seat;
    public Button c2seat;
    public Button c3seat;
    public Button c4seat;
    public Button c5seat;

    ObservableList<String> hours = FXCollections.observableArrayList("12:00","18:00");



    @Override
    public void initialize(URL location, ResourceBundle resources){
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        session.setItems(hours);

        try {
            String sql="SELECT a1,a2,a3,b1,b2,b3,b4,c1,c2,c3,c4,c5 from seat3";
            Statement statement=connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                int a1s= rs.getInt("a1");
                int a2s= rs.getInt("a2");
                int a3s= rs.getInt("a3");
                int b1s= rs.getInt("b1");
                int b2s= rs.getInt("b2");
                int b3s= rs.getInt("b3");
                int b4s= rs.getInt("b4");
                int c1s= rs.getInt("c1");
                int c2s= rs.getInt("c2");
                int c3s= rs.getInt("c3");
                int c4s= rs.getInt("c4");
                int c5s= rs.getInt("c5");

                if(a1s==0){
                    a1seat.setStyle("-fx-background-color: Green");
                }else if(a1s==1){a1seat.setStyle("-fx-background-color: Red");}
                if(a2s==0){
                    a2seat.setStyle("-fx-background-color: Green");
                }else if(a2s==1){a2seat.setStyle("-fx-background-color: Red");}
                if(a3s==0){
                    a3seat.setStyle("-fx-background-color: Green");
                }else if(a3s==1){a3seat.setStyle("-fx-background-color: Red");}
                if(b1s==0){
                    b1seat.setStyle("-fx-background-color: Green");
                }else if(b1s==1){b1seat.setStyle("-fx-background-color: Red");}
                if(b2s==0){
                    b2seat.setStyle("-fx-background-color: Green");
                }else if(b2s==1){b2seat.setStyle("-fx-background-color: Red");}
                if(b3s==0){
                    b3seat.setStyle("-fx-background-color: Green");
                }else if(b3s==1){b3seat.setStyle("-fx-background-color: Red");}
                if(b4s==0){
                    b4seat.setStyle("-fx-background-color: Green");
                }else if(b4s==1){b4seat.setStyle("-fx-background-color: Red");}
                if(c1s==0){
                    c1seat.setStyle("-fx-background-color: Green");
                }else if(c1s==1){c1seat.setStyle("-fx-background-color: Red");}
                if(c2s==0){
                    c2seat.setStyle("-fx-background-color: Green");
                }else if(c2s==1){c2seat.setStyle("-fx-background-color: Red");}
                if(c3s==0){
                    c3seat.setStyle("-fx-background-color: Green");
                }else if(c3s==1){c3seat.setStyle("-fx-background-color: Red");}
                if(c4s==0){
                    c4seat.setStyle("-fx-background-color: Green");
                }else if(c4s==1){c4seat.setStyle("-fx-background-color: Red");}
                if(c5s==0){
                    c5seat.setStyle("-fx-background-color: Green");
                }else if(c5s==1){c5seat.setStyle("-fx-background-color: Red");}
            }
        }


        catch (Exception e){}

    }


    public void a1(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(a1seat.getStyle())){
                a1seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(a1seat.getStyle())){
                a1seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }

    public void a2(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(a2seat.getStyle())){
                a2seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(a2seat.getStyle())){
                a2seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }

    public void a3(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(a3seat.getStyle())){
                a3seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(a3seat.getStyle())){
                a3seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }
    public void b1(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(b1seat.getStyle())){
                b1seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(b1seat.getStyle())){
                b1seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }
    public void b2(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(b2seat.getStyle())){
                b2seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(b2seat.getStyle())){
                b2seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }
    public void b3(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(b3seat.getStyle())){
                b3seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(b3seat.getStyle())){
                b3seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }
    public void b4(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(b4seat.getStyle())){
                b4seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(b4seat.getStyle())){
                b4seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }
    public void c1(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(c1seat.getStyle())){
                c1seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(c1seat.getStyle())){
                c1seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }
    public void c2(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(c2seat.getStyle())){
                c2seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(c2seat.getStyle())){
                c2seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }
    public void c3(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(c3seat.getStyle())){
                c3seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(c3seat.getStyle())){
                c3seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }
    public void c4(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(c4seat.getStyle())){
                c4seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(c4seat.getStyle())){
                c4seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }
    public void c5(ActionEvent event) throws SQLException {

        try {
            if("-fx-background-color: Purple".equals(c5seat.getStyle())){
                c5seat.setStyle("-fx-background-color: Green");
            }else if("-fx-background-color: Green".equals(c5seat.getStyle())){
                c5seat.setStyle("-fx-background-color: Purple");
            }
        }catch (Exception e){}

    }



    public void purchase1(ActionEvent event) throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        try {
            if("-fx-background-color: Purple".equals(a1seat.getStyle())){
                String p1="UPDATE seat3 SET a1=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p1);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'a1'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(a2seat.getStyle())){
                String p2="UPDATE seat3 SET a2=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p2);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'a2'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(a3seat.getStyle())){
                String p3="UPDATE seat3 SET a3=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p3);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'a3'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(b1seat.getStyle())){
                String p4="UPDATE seat3 SET b1=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p4);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'b1'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(b2seat.getStyle())){
                String p5="UPDATE seat3 SET b2=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p5);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'b2'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(b3seat.getStyle())){
                String p6="UPDATE seat3 SET b3=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p6);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'b3'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(b4seat.getStyle())){
                String p7="UPDATE seat3 SET b4=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p7);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'b4'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(c1seat.getStyle())){
                String p8="UPDATE seat3 SET c1=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p8);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'c1'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(c2seat.getStyle())){
                String p9="UPDATE seat3 SET c2=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p9);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'c2'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(c3seat.getStyle())){
                String p10="UPDATE seat3 SET c3=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p10);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'c3'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(c4seat.getStyle())){
                String p11="UPDATE seat3 SET c4=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p11);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'c4'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}

        try {
            if("-fx-background-color: Purple".equals(c5seat.getStyle())){
                String p12="UPDATE seat3 SET c5=1";
                Statement statement=connection.createStatement();
                statement.executeUpdate(p12);

                String sessiontime = (String) session.getValue();
                int sessionid=1;
                if("12:00".equals(sessiontime)){
                    sessionid=1;
                } else if ("18:00".equals(sessiontime)) {
                    sessionid=2;
                }
                String sql="INSERT INTO ticket (IdUser, id_movie,id_showing,id_session,id_saloon,id_seat) VALUES ((SELECT userid from login),3,1,'"+sessionid+"',3,'c5'); ";
                Statement statement2=connection.createStatement();
                statement2.executeUpdate(sql);

            }}catch (Exception e){}


        Alert a1 = new Alert(Alert.AlertType.NONE,
                "You have succesfully bought the tickets", ButtonType.OK);

        // show the dialog
        a1.show();

    }
}
