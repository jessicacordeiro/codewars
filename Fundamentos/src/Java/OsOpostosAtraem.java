/*Timmy e Sarah acham que estão apaixonados, mas perto de onde moram, 
 * eles só saberão quando colherem uma flor cada um. Se uma das flores tiver 
 * um número par de pétalas e a outra tiver um número ímpar de pétalas, isso significa que 
 * eles estão apaixonados.

Escreva uma função que pegará o número de pétalas de cada flor e retornará verdadeiro 
se eles estiverem apaixonados e falso se não estiverem.*/

package Java;

public class OsOpostosAtraem {
	
	public static boolean isLove(final int flower1, final int flower2) {
	      
		if (flower1 %2 == 0 && flower2 %2 == 0 || flower1 %2 != 0 && flower2 %2 != 0 ) {
		      return false;
		}  
		return true; 
	}
}
