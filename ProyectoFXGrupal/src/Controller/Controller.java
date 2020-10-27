package Controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class Controller {

    @FXML
    private Label label;
    @FXML
    private Label label2;
    
    @FXML
    private Button fechaButton;
    @FXML
    private Label fechaLabel;
    @FXML 
    private Button buttonSquare;
    @FXML
    private Shape square;
    
    
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
        
        fechaButton.setOnMouseClicked(event -> {
        	fechaLabel.setText(new Date().toString());
        });
        
        Random r = new Random();
        buttonSquare.setOnMouseClicked(event -> {
        	square.setRotate(square.getRotate() + 20);
        	square.setFill(colores.get(r.nextInt(4)));
        });
        
    
    }
}