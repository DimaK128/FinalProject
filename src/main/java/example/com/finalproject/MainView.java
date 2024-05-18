package example.com.finalproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class MainView extends Application {
    @Override
    public void start(Stage primaryStage) {
        TabPane tabPane = new TabPane();

        Tab carTab = new Tab("Cars", new CarManagementView().getView());
        Tab carModelTab = new Tab("Car Models", new CarModelManagementView().getView());
        Tab carShowTab = new Tab("Car Shows", new CarShowManagementView().getView());

        tabPane.getTabs().addAll(carTab, carModelTab, carShowTab);

        Scene scene = new Scene(tabPane, 900, 900);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Car Database");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
