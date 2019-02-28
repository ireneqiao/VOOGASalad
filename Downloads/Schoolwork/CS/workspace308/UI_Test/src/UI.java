
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.awt.*;
import java.util.ArrayList;

public class UI extends Scene {
    private static final int WINDOW_HEIGHT = 600;
    private static final int WINDOW_WIDTH = 600;
    private static final Paint BACKGROUND_FILL = Color.WHITE;
    private static final int GRID_HEIGHT = 400;
    private static final int GRID_WIDTH = 400;
    private static final int CELL_BUFFER = 2;

    private final int GRID_ROW_NUM;
    private final int GRID_COL_NUM;
    private final int CELL_HEIGHT;
    private final int CELL_WIDTH;


    private BorderPane myRoot;
    private UIMain mySimulation;

    public UI(BorderPane root, int width, int height, UIMain s){
        super(root, WINDOW_HEIGHT, WINDOW_WIDTH, BACKGROUND_FILL);
        mySimulation = s;
        myRoot = root;
        GRID_COL_NUM = width;
        GRID_ROW_NUM = height;
        CELL_HEIGHT = GRID_HEIGHT/GRID_ROW_NUM;
        CELL_WIDTH = GRID_WIDTH/GRID_COL_NUM;
    }

    public void drawGrid(){
        for (int i = 0; i < GRID_ROW_NUM; i++){
            for (int j = 0; j < GRID_COL_NUM; j++){
                Rectangle cell = new Rectangle(CELL_WIDTH - CELL_BUFFER, CELL_HEIGHT - CELL_BUFFER);
                cell.setFill(Color.GRAY);
                cell.setX(j * CELL_WIDTH);
                cell.setY(i * CELL_HEIGHT);
                myRoot.getChildren().add(cell);
            }
        }
    }
}
