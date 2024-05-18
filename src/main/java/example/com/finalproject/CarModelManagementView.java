package example.com.finalproject;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class CarModelManagementView {
    public BorderPane getView() {
        BorderPane borderPane = new BorderPane();

        // Search and Filter Options
        HBox searchAndFilter = new HBox(10);
        searchAndFilter.setPadding(new Insets(10));

        TextField searchField = new TextField();
        ComboBox<String> typeComboBox = new ComboBox<>();
        Button searchButton = new Button("Search");
        Button sortHorsepowerButton = new Button("Sort by Horsepower");
        Button sortTorqueButton = new Button("Sort by Torque");

        searchAndFilter.getChildren().addAll(new Label("Search:"), searchField, searchButton,
                new Label("Type:"), typeComboBox, sortHorsepowerButton, sortTorqueButton);

        // Table for displaying car models
        TableView<CarModel> table = new TableView<>();
        TableColumn<CarModel, String> modelNameColumn = new TableColumn<>("Model Name");
        TableColumn<CarModel, String> makeColumn = new TableColumn<>("Make");
        TableColumn<CarModel, String> typeColumn = new TableColumn<>("Type");
        TableColumn<CarModel, Integer> horsepowerColumn = new TableColumn<>("Horsepower");
        TableColumn<CarModel, Integer> torqueColumn = new TableColumn<>("Torque");

        table.getColumns().addAll(modelNameColumn, makeColumn, typeColumn, horsepowerColumn, torqueColumn);

        // Form for adding/updating car models
        GridPane form = new GridPane();
        form.setPadding(new Insets(10));
        form.setHgap(10);
        form.setVgap(10);

        TextField modelNameField = new TextField();
        ComboBox<Car> makeComboBox = new ComboBox<>();
        TextField dimensionsField = new TextField();
        TextField weightField = new TextField();
        TextField typeField = new TextField();
        TextField horsepowerField = new TextField();
        TextField torqueField = new TextField();
        Button mainPhotoButton = new Button("Upload Main Photo");
        Button additionalPhotosButton = new Button("Upload Additional Photos");
        TextArea descriptionArea = new TextArea();
        TextArea featuresArea = new TextArea();

        mainPhotoButton.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Upload Main Photo");
            File file = fileChooser.showOpenDialog(null);
            if (file != null) {
                // Handle file upload and set the path to the main photo field
                String filePath = file.getAbsolutePath();
                // Assuming setMainPhoto method exists in CarModel class
                // carModel.setMainPhoto(filePath);
            }
        });

        additionalPhotosButton.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Upload Additional Photos");
            List<File> files = fileChooser.showOpenMultipleDialog(null);
            if (files != null) {
                // Handle file upload and set the paths to the additional photos field
                // Assuming setAdditionalPhotos method exists in CarModel class
                // List<String> filePaths = files.stream().map(File::getAbsolutePath).collect(Collectors.toList());
                // carModel.setAdditionalPhotos(filePaths);
            }
        });

        form.add(new Label("Model Name:"), 0, 0);
        form.add(modelNameField, 1, 0);
        form.add(new Label("Make:"), 0, 1);
        form.add(makeComboBox, 1, 1);
        form.add(new Label("Dimensions:"), 0, 2);
        form.add(dimensionsField, 1, 2);
        form.add(new Label("Weight:"), 0, 3);
        form.add(weightField, 1, 3);
        form.add(new Label("Type:"), 0, 4);
        form.add(typeField, 1, 4);
        form.add(new Label("Horsepower:"), 0, 5);
        form.add(horsepowerField, 1, 5);
        form.add(new Label("Torque:"), 0, 6);
        form.add(torqueField, 1, 6);
        form.add(new Label("Main Photo:"), 0, 7);
        form.add(mainPhotoButton, 1, 7);
        form.add(new Label("Additional Photos:"), 0, 8);
        form.add(additionalPhotosButton, 1, 8);
        form.add(new Label("Description:"), 0, 9);
        form.add(descriptionArea, 1, 9);
        form.add(new Label("Features:"), 0, 10);
        form.add(featuresArea, 1, 10);

        Button addButton = new Button("Add Model");
        Button updateButton = new Button("Update Model");
        Button clearButton = new Button("Clear Form");

        form.add(addButton, 0, 11);
        form.add(updateButton, 1, 11);
        form.add(clearButton, 2, 11);

        // Add search/filter bar, table, and form to the BorderPane
        borderPane.setTop(searchAndFilter);
        borderPane.setCenter(table);
        borderPane.setBottom(form);

        return borderPane;
    }
}
