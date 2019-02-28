import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class UIMain extends Application{
    public static final int DEFAULT_WIDTH = 20;
    public static final int DEFAULT_HEIGHT = 20;

    private Scene myIntroScene;
    private UI myUIScene;
    private Stage myStage;
    private Group myIntroRoot;
    private BorderPane myUIRoot;
    private int myWidth = DEFAULT_WIDTH;
    private int myHeight = DEFAULT_HEIGHT;

    public UIMain(){
        super();
    }
    public void start (Stage stage) {
        this.myStage = stage;
        initUI();
    }

    public static void main (String[] args) {
        launch(args);
    }

    private void initUI(){
        myUIRoot = new BorderPane();
        myUIScene = new UI(myUIRoot, myWidth, myHeight, this);
        myStage = new Stage();
        myStage.setScene(myUIScene);
        myStage.show();
    }
}
