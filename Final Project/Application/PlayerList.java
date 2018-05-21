import JavaFXTest.Products;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.naming.Binding;
import java.util.ArrayList;
import java.util.function.Predicate;


public class PlayerList extends Application
{
    private GUIManager guiManager = new GUIManager();
    PlayerManager playerManager = new PlayerManager();
    ObservableList<NFLPlayer> drafted;
    TableView<NFLPlayer> table;
    ArrayList<NFLPlayer> player = playerManager.getList();
    public static void main(String[]args)
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)
    {
       Stage window = new Stage();
       window.initModality(Modality.APPLICATION_MODAL);
       window.setTitle("Player List");

       Button back = new Button("Back");
       back.setOnAction(event -> window.close());
       Button draft = new Button("Draft");
       draft.setOnAction(event -> {
           ObservableList<NFLPlayer> playerSelected, allPlayers;
           allPlayers = table.getItems();
           playerSelected = table.getSelectionModel().getSelectedItems();
           playerSelected.forEach(allPlayers :: remove);
           guiManager.table.setItems(drafted);

       });


       TableColumn<NFLPlayer, String> column1 = new TableColumn<>("Player Name");
       column1.setMinWidth(100);
       column1.setCellValueFactory(new PropertyValueFactory<>("name"));


       TableColumn<NFLPlayer, String> column2 = new TableColumn<>("Position");
       column2.setMinWidth(100);
       column2.setCellValueFactory(new PropertyValueFactory<>("position"));

       TableColumn<NFLPlayer, String> column3 = new TableColumn<>("Team");
       column3.setMinWidth(150);
       column3.setCellValueFactory(new PropertyValueFactory<>("team"));



        table = new TableView<>();
        table.setItems(getPlayers());
        table.getColumns().addAll(column1, column2, column3);
        for(NFLPlayer N: player)
        {
            if(!N.available)
                table.getItems().remove(N);
        }




        Label label = new Label("Player List");
        label.setFont(new Font("Arial", 20));

        Image image = new Image("logo.png");
        ImageView IV = new ImageView(image);
        IV.fitWidthProperty().bind(primaryStage.widthProperty());
        IV.setFitHeight(100);

        BorderPane borderPane = new BorderPane();

        VBox header = new VBox(10);
        VBox list = new VBox();
        VBox bottom = new VBox();

        header.getChildren().addAll(IV, label);
        list.getChildren().addAll(back, table);
        bottom.getChildren().add(draft);

        //Set layouts
        borderPane.setTop(header);
        header.setAlignment(Pos.CENTER);
        borderPane.setCenter(list);
        borderPane.setBottom(bottom);

        Scene scene = new Scene(borderPane, 700, 600);
        window.setScene(scene);
        window.show();
    }
     ObservableList<NFLPlayer> getPlayers()
    {

                ObservableList<NFLPlayer> players = FXCollections.observableArrayList(player);
                return players;

    }
}
