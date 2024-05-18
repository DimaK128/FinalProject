package example.com.finalproject;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class CarShowManagementView {
    public BorderPane getView() {
        BorderPane borderPane = new BorderPane();

        // Form for adding/updating car shows
        GridPane form = new GridPane();
        form.setPadding(new Insets(10));
        form.setHgap(10);
        form.setVgap(10);

        ListView<Car> displayedCarsListView = new ListView<>();
        DatePicker datePicker = new DatePicker();
        TextField locationField = new TextField();
        Button photoButton = new Button("Upload Photo");
        TextField recapVideoUrlField = new TextField();

        form.add(new Label("Displayed Cars:"), 0, 0);
        form.add(displayedCarsListView, 1, 0);
        form.add(new Label("Date:"), 0, 1);
        form.add(datePicker, 1, 1);
        form.add(new Label("Location:"), 0, 2);
        form.add(locationField, 1, 2);
        form.add(new Label("Photo:"), 0, 3);
        form.add(photoButton, 1, 3);
        form.add(new Label("Recap Video URL:"), 0, 4);
        form.add(recapVideoUrlField, 1, 4);

        Button addButton = new Button("Add Show");
        Button updateButton = new Button("Update Show");
        Button clearButton = new Button("Clear Form");

        form.add(addButton, 0, 5);
        form.add(updateButton, 1, 5);
        form.add(clearButton, 2, 5);

        // Table for displaying car shows
        TableView<CarShow> table = new TableView<>();
        TableColumn<CarShow, String> dateColumn = new TableColumn<>("Date");
        TableColumn<CarShow, String> locationColumn = new TableColumn<>("Location");
        TableColumn<CarShow, Integer> carsDisplayedColumn = new TableColumn<>("Cars Displayed");

        table.getColumns().addAll(dateColumn, locationColumn, carsDisplayedColumn);

        // Add form and table to the BorderPane
        borderPane.setTop(form);
        borderPane.setCenter(table);

        return borderPane;
    }
}
