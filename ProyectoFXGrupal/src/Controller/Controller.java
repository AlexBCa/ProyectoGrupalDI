package Controller;


import java.util.ArrayList;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private Label label;
    @FXML
    private Label label2;
    
    ArrayList<Color> colores = new ArrayList<Color>();
    
    
    public void cambiarColor(ActionEvent event) {
    	Random r = new Random();
    	label2.setTextFill(colores.get(r.nextInt(4)));
    	label.setTextFill(colores.get(r.nextInt(4)));
    }

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
        
        colores.add(Color.RED);
        colores.add(Color.GREEN);
        colores.add(Color.MAGENTA);
        colores.add(Color.TURQUOISE);
        colores.add(Color.PURPLE);
        
    
    }
}