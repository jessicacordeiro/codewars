/*Timmy e Sarah acham que est�o apaixonados, mas perto de onde moram, 
 * eles s� saber�o quando colherem uma flor cada um. Se uma das flores tiver 
 * um n�mero par de p�talas e a outra tiver um n�mero �mpar de p�talas, isso significa que 
 * eles est�o apaixonados.

Escreva uma fun��o que pegar� o n�mero de p�talas de cada flor e retornar� verdadeiro 
se eles estiverem apaixonados e falso se n�o estiverem.*/

package Java;

public class OsOpostosAtraem {
	
	public static boolean isLove(final int flower1, final int flower2) {
	      
		if (flower1 %2 == 0 && flower2 %2 == 0 || flower1 %2 != 0 && flower2 %2 != 0 ) {
		      return false;
		}  
		return true; 
	}
}
