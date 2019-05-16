package sample;

import Connectivity.ConnectionClass;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Ui2 implements Initializable {
    public Label username;
    public Label userlastname;
    public Label usermail;
    public TableColumn<ModelTable, String> colTicketID;
    public TableColumn<ModelTable, String> colName;
    public TableColumn<ModelTable, String> colLastName;
    public TableColumn<ModelTable, String> colMovie;
    public TableColumn<ModelTable, String> colDate;
    public TableColumn<ModelTable, String> colHour;
    public TableColumn<ModelTable, String> colSaloon;
    public TableColumn<ModelTable, String> colSeat;
    public TableView<ModelTable> table;
    ObservableList<ModelTable> oblist = FXCollections.observableArrayList();

    ConnectionClass connectionClass=new ConnectionClass();
    Connection connection=connectionClass.getConnection();


    @Override
    public void initialize(URL location, ResourceBundle resources){

        try{
            ResultSet rs2= connection.createStatement().executeQuery("select A.* from tickets_view A where A.FirstName in ( select B.name from login B )");
                    while (rs2.next()){
                        oblist.add(new ModelTable(rs2.getString("id_ticket"),rs2.getString("FirstName"),rs2.getString("SurName"),rs2.getString("title"),rs2.getString("showing_date"),rs2.getString("start_time"),rs2.getString("saloon_number"),rs2.getString("id_seat")));
                    }
        }
        catch (SQLException e)
        {
            // do something appropriate with the exception, *at least*:
            e.printStackTrace();
        }


        colTicketID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colLastName.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        colMovie.setCellValueFactory(new PropertyValueFactory<>("movie"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colHour.setCellValueFactory(new PropertyValueFactory<>("hour"));
        colSaloon.setCellValueFactory(new PropertyValueFactory<>("saloon"));
        colSeat.setCellValueFactory(new PropertyValueFactory<>("seat"));
        table.setItems(oblist);


        try
        {
            Statement statement=connection.createStatement();
            String sql= "SELECT mail, name, lastname FROM `login`";
            ResultSet rs=statement.executeQuery(sql);

            while(rs.next()){
                String first = rs.getString("name");
                String last = rs.getString("lastname");
                String email = rs.getString("mail");

                username.setText(first);
                userlastname.setText(last);
                usermail.setText(email);
            }


        }
        catch (SQLException e)
        {
            // do something appropriate with the exception, *at least*:
            e.printStackTrace();
        }


    }


    }

