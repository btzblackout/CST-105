import JavaFXTest.Products;
import com.sun.javafx.stage.StageHelper;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class GUIManager extends Application
{
    //PlayerManager mainPlayerManager = new PlayerManager();
    TableView<NFLPlayer> table;

    Stage window;
    Scene mainScene, rosterScene;
    public static void main(String[]args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("NFL Drafting Program");
        Button startbtn = new Button("START");
        Button draftButton = new Button("Draft");
        startbtn.setId("startButton");
        startbtn.setOnAction(e -> window.setScene(rosterScene));
        draftButton.setOnAction(event -> {
            PlayerList pl = new PlayerList();
            pl.start(window);
        });

        //layouts
        BorderPane mainLayout = new BorderPane();
        BorderPane rosterLayout = new BorderPane();
        StackPane mainStackPane = new StackPane();
        StackPane rosterStackPane = new StackPane();
        VBox mainVBox = new VBox(20);
        mainLayout.setStyle("-fx-background-color: linear-gradient(#0000ff,#ffa500);");
        VBox rosterVBox = new VBox(20);
        HBox mainHBox = new HBox(20);
        FlowPane rosterFlowPane = new FlowPane();
        GridPane mainGridPane = new GridPane();
        GridPane rosterGridPane = new GridPane();
        Image logo = new Image("Logo.png");
        ImageView mainIV = new ImageView(logo);
        ImageView rosterIV = new ImageView(logo);
        Label rosterLabel = new Label("ROSTER");
        rosterLabel.setId("rosterLabel");
        rosterLabel.setFont(new Font("Arial", 20));
        mainIV.fitWidthProperty().bind(primaryStage.widthProperty());
        mainIV.setFitHeight(100);
        rosterIV.fitWidthProperty().bind(primaryStage.widthProperty());
        rosterIV.setFitHeight(100);


        //set layouts
        mainLayout.setBottom(mainStackPane);
        mainLayout.setCenter(mainGridPane);
        mainLayout.setTop(mainHBox);
        mainLayout.setRight(mainVBox);

        rosterLayout.setBottom(rosterStackPane);
        rosterLayout.setCenter(rosterVBox);
        rosterLayout.setTop(rosterFlowPane);
        rosterLayout.setRight(rosterGridPane);


        //populate layouts
        mainStackPane.getChildren().add(startbtn);
        mainHBox.getChildren().add(mainIV);
        rosterFlowPane.getChildren().addAll(rosterIV, rosterLabel);
        rosterFlowPane.setAlignment(Pos.CENTER);

        table = new TableView<>();
        TableColumn<NFLPlayer, String> column1 = new TableColumn<>("Player Name");
        column1.setMinWidth(100);
        column1.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<NFLPlayer, String> column2 = new TableColumn<>("Position");
        column2.setMinWidth(100);
        column2.setCellValueFactory(new PropertyValueFactory<>("position"));

        TableColumn<NFLPlayer, String> column3 = new TableColumn<>("Team");
        column3.setMinWidth(150);
        column3.setCellValueFactory(new PropertyValueFactory<>("team"));


       /*
        for(NFLPlayer N: mainPlayer)
        {
            if(N.available)
                table.getItems().remove(N);
        }
        */

        table.getColumns().addAll(column1, column2, column3);

        rosterVBox.getChildren().addAll(draftButton, table);


        mainScene = new Scene(mainLayout, 700, 600);
        rosterScene = new Scene(rosterLayout, 700, 600);
        mainScene.getStylesheets().add("Style.css");
        window.setScene(mainScene);
        window.show();

    }




}
