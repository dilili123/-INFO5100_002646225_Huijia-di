package FinalProject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;


public class StartController implements Initializable {
    public ImageView logo;
    public AnchorPane preface;
    public Button buttonStart;

    public void handleStart(ActionEvent actionEvent) throws MalformedURLException {
        FXMLLoader loader = new FXMLLoader();
        URL url = new URL("file:target/classes/FinalProject/main.fxml");
        loader.setLocation(url);
        VBox page = null;
        try {
            page = (VBox) loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage mainStage = new Stage();
        Scene scene =  new Scene(page);
        mainStage.setScene(scene);

        mainStage.show();

        //close the current window
        Stage primaryStage = (Stage)buttonStart.getScene().getWindow();
        primaryStage.close();
    }

    public void initialize(URL location, ResourceBundle resources){
        String path = "src/main/resources/FinalProject/huijia_yujue_logo.JPG";
        File img = new File(path);
        try {
            InputStream isImage = (InputStream) new FileInputStream(img);
            Image image = new Image(isImage);
            logo.setImage(image);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
