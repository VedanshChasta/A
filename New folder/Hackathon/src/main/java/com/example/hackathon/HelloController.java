package com.example.hackathon;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javax.swing.*;
import com.googlecode.javacv.cpp.opencv_core;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
import com.googlecode.javacv.*;
import org.opencv.core.Core;
//
public class HelloController {
    //FXLM Declarations
    @FXML
    private Label label1;


    //Others
    static {System.loadLibrary(Core.NATIVE_LIBRARY_NAME);}


    //Methods
    @FXML
    protected void onHelloButtonClick() {
        label1.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void ev() {
        try {
            opencv_core.IplImage a = cvLoadImage("");
            final CanvasFrame canvas = new CanvasFrame("Demo");
            canvas.showImage(a);
            canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}