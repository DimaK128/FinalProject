package example.com.finalproject;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class CarManagementView {
    public BorderPane getView() {
        BorderPane borderPane = new BorderPane();

        // Form for adding/updating car
        GridPane form = new GridPane();
        form.setPadding(new Insets(10));
        form.setHgap(10);
        form.setVgap(10);

        TextField makeField = new TextField();
        TextField modelField = new TextField();
        TextField countryField = new TextField();
        TextField yearField = new TextField();
        Button logoButton = new Button("Upload Logo");
        TextArea specsArea = new TextArea();

        form.add(new Label("Make:"), 0, 0);
        form.add(makeField, 1, 0);
        form.add(new Label("Model:"), 0, 1);
        form.add(modelField, 1, 1);
        form.add(new Label("Manufacturing Country:"), 0, 2);
        form.add(countryField, 1, 2);
        form.add(new Label("Manufacturing Year:"), 0, 3);
        form.add(yearField, 1, 3);
        form.add(new Label("Logo:"), 0, 4);
        form.add(logoButton, 1, 4);
        form.add(new Label("Additional Specifications:"), 0, 5);
        form.add(specsArea, 1, 5);

        Button addButton = new Button("Add Car");
        Button updateButton = new Button("Update Car");
        Button clearButton = new Button("Clear Form");

        form.add(addButton, 0, 6);
        form.add(updateButton, 1, 6);
        form.add(clearButton, 2, 6);

        // Table for displaying cars
        TableView<Car> table = new TableView<>();
        TableColumn<Car, String> makeColumn = new TableColumn<>("Make");
        TableColumn<Car, String> modelColumn = new TableColumn<>("Model");
        TableColumn<Car, String> countryColumn = new TableColumn<>("Country");
        TableColumn<Car, Integer> yearColumn = new TableColumn<>("Year");

        table.getColumns().addAll(makeColumn, modelColumn, countryColumn, yearColumn);

        // Add form and table to the BorderPane
        borderPane.setTop(form);
        borderPane.setCenter(table);

        return borderPane;
    }
}
