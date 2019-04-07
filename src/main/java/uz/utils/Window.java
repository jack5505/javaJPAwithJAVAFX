package uz.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Window {
    private Stage stage;
    private FXMLLoader loader;
    private String title;
    private String url;

    public Window(String title,String url) {
        this.title = title;
        this.url = url;
        this.init();
    }

    private void init() {
        System.out.println(url);
        loader = new FXMLLoader(getClass().getClassLoader().getResource(url));
        try
        {
            Parent root = loader.load();
            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(this.title);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setModality(Modality modality) {
        this.stage.initModality(modality);
    }

    public void setStageStyle(StageStyle stageStyle) {
        this.stage.initStyle(stageStyle);
    }

    public void show(){
        stage.show();
    }

    public void setFullScreen(boolean yes){
        stage.setMaximized(yes);
    }

    public void showAndWait(){
        stage.showAndWait();
    }

    public <T> T getController(){
        return loader.getController();
    }

    public Stage getStage(){
        return this.stage;
    }
}
