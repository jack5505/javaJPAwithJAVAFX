package uz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.config.AppConfig;
import uz.config.PersistenceConfig;
import uz.utils.FxmlLoader;

import java.net.URL;
import java.util.ResourceBundle;

public class Main extends Application {
    public static AnnotationConfigApplicationContext ctx;


    @Override
    public void start(Stage primaryStage) throws Exception
    {

                ctx = new AnnotationConfigApplicationContext();
                ctx.register(AppConfig.class);
                ctx.register(PersistenceConfig.class);
                ctx.refresh();

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(FxmlLoader.mainScreen.main));
        primaryStage.setTitle("Сут махсулоти");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
