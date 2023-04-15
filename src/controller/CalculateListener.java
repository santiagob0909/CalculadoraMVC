package controller;

/**
 * importamos las clases java.awt necesarias para poder hacer la 
 * funcion necesaria del programa
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculateListener implements ActionListener {
    /**
     * Las variables finales solo se usan en aquellos valores que sabemos de
     * antemano que no van a variar, o sea, que permaneceran durante la
     * ejecucion del programa.  
     */
    private final CalculatorController calculatorController;

    /**
     * @param calculatorController
    */
    CalculateListener(CalculatorController calculatorController) {
        this.calculatorController = calculatorController;
    }

    /**
     * Las acciones envolventes con la vista con un bloque de prueba en caso de que los numeros no se hayan introducido correctamente
     */
    public void actionPerformed(ActionEvent e) {
        int firstNumber;
        int secondNumber = 0;
        try{
            firstNumber = this.calculatorController.theView.getFirstNumber();
            secondNumber = this.calculatorController.theView.getSecondNumber();
        
            this.calculatorController.theModel.addTwoNumbers(firstNumber, secondNumber);
            this.calculatorController.theView.setCalcSolution(this.calculatorController.theModel.getCalculationValue());
        }catch (NumberFormatException ex) {
            System.out.println(ex);
            this.calculatorController.theView.displayErroMessage(" Ingrese dos numeros enteros");
        }

    }

} 

    

