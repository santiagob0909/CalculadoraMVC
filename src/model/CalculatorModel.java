package model;

/**
 * Creacion de la clase CalculatorModel para poder
 * hacer la operacion (Suma) de los dos numeros (firstNamer, secondNumer)
 */
public class CalculatorModel {
    //
    private int calculationValue;


    //se crea esta funcion para hacer la operacion de los dos numeros
    public void addTwoNumbers(int firstNamer, int secondNumber){
        calculationValue = firstNamer + secondNumber;
    }

    public int getCalculationValue(){
        return calculationValue;
    }
    
}
