package controller;


import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
    CalculatorView theView;
    CalculatorModel theModel;

    /**
     * Avisa a la Vista que siempre que el boton calcular se hace clic se ejecuta el
     * metodo actionPerfoimed en la clase interna CalculaterListener
     * 
     * @param theView
     * @param theModel
     */
    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new CalculateListener(this));
    }
}
