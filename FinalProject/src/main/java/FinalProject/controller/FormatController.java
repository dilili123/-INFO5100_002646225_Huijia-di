package FinalProject.controller;

import FinalProject.dto.BigImage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class FormatController implements Initializable {
    private Stage convertStage;
    private BigImage bimg;
    @FXML private RadioButton ButtonJPG;
    @FXML private RadioButton ButtonJPEG;
    @FXML private RadioButton ButtonPNG;
    @FXML private RadioButton ButtonGIF;


    public void setConvertStage(Stage convertStage, BigImage bimg) {
        this.convertStage = convertStage;
        this.bimg = bimg;
    }

    public void handelOK(ActionEvent actionEvent){
        //Get all modifications of bimg and actually change bimg
        javaxt.io.Image tmp = bimg.getImage().copy();
        System.out.println("The current status of preview image (modifications)");
        bimg.logBigImageStatus();
        if(bimg.getRotate()!=0) {
            tmp.rotate(bimg.getRotate());
        }
        if(bimg.getDesaturate()){
            tmp.desaturate();
        }
        javaxt.io.Image Image = tmp;
        String filename = bimg.getFilename();
        //User selects the format of output
        if(ButtonGIF.isSelected()){
            Image.saveAs("./"+filename+".gif");
            convertStage.close();
            alertWindow("GIF");
        }else if(ButtonJPG.isSelected()){
            Image.saveAs("./"+filename+".jpg");
            convertStage.close();
            alertWindow("JPG");
        }else if(ButtonJPEG.isSelected()){
            Image.saveAs("./"+filename+".jpeg");
            convertStage.close();
            alertWindow("JPEG");
        }else if(ButtonPNG.isSelected()){
            Image.saveAs("./"+filename+".png");
            convertStage.close();
            alertWindow("PNG");
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Illegal operation");
            alert.setContentText("You have to choose a format before converting!");
            alert.showAndWait();
        }
    }

    public void handelCancel(ActionEvent actionEvent) {
        convertStage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ToggleGroup group = new ToggleGroup();
        this.ButtonPNG.setToggleGroup(group);
        this.ButtonJPG.setToggleGroup(group);
        this.ButtonJPEG.setToggleGroup(group);
        this.ButtonGIF.setToggleGroup(group);
    }

    public void alertWindow(String s){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Congratulation!");
        alert.setHeaderText(null);
        alert.setContentText("Now you get a " + s +" picture!");
        alert.showAndWait();
    }

}
