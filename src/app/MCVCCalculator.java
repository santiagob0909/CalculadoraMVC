package app;

/**
 * importamos todas las clases necesarias para poder funcionar la calculadora
 */
import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

/** Creamos la MCVCCalculator para poder funcionar el programa */
public class MCVCCalculator {

    public static void main(String [] args){

        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        //CalculatorController theController = new CalculatorController(theView, theModel);
        // Para no generar un error se instancia un objeto de calcularController
        new CalculatorController(theView, theModel);
        theView.setVisible(true);
    }

}
