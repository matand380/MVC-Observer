package Controller;

import Model.Model;
import com.example.mvcobserver.HelloApplication;
import com.example.mvcobserver.HelloController;
import javafx.fxml.FXMLLoader;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {
    Model model;
    HelloController helloController;

    public Controller(Model model, HelloController helloController) {
        this.model = model;
        model.addObserver(this);
        this.helloController = helloController;
        helloController.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == model) {
            int result = model.getResult();
            helloController.display(result);
        } else {
            if (o == helloController) {
                model.calculate();
            }
        }
    }


}
