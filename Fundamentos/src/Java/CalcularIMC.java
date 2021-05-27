package Java;

public class CalcularIMC {
	public static String imc(double largura, double altura) {
		double bmi = largura / (altura*altura);
	    
	    if (bmi <= 18.5) {
	      return "Underweight";
	    }
	    
	    if (bmi <= 25) {
	      return "Normal";
	    }
	    
	    if (bmi <= 30) {
	      return "Overweight";
	    } 
	    return "Obese";
	}
}
