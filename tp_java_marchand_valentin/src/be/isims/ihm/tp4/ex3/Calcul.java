package be.isims.ihm.tp4.ex3;

/**
 * Calcul est la classe gérent les calcul
 *
 * @author Marchand Valentin
 * @version 1.0
 */
public class Calcul
{
    private double a;
    private double b;
    private String operation = "";

    public void setA(double a){this.a=a;}
    public void setB(double b){this.b=b;}

    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }

    /**
     * Calcul a avec b selon l'opération
     *
     * @return Résulta du calcul
     */
    public String getCalcul()
    {
        switch (operation)
        {
            case "+":
                a = a + b;
                b = 0;
                operation = "";
                break;
            case "-":
                a = a - b;
                b = 0;
                operation = "";
                break;
            case "*":
                a = a * b;
                b = 0;
                operation = "";
                break;
            case "/":
                a = a / b;
                b = 0;
                operation = "";
                break;
        }
        return String.valueOf(a);
    }
}
