
public class OrganizarArray {

	public static void main(String[] args) {
		int[] numeros = { 2, 5, 4, 1, 20, 0 };
		int aux;
		
		for(int k = 0; k < numeros.length; k++ ) {
			System.out.println(numeros[k]);
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			for (int j = i + 1; j < numeros.length; j++) {
				
				if (numeros[i] > numeros[j]) {
					System.out.println("posição i" + numeros[i] + " e " + "posição j " + numeros[j]);
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}

		}

		for (int l = 0; l < numeros.length; l++) {
			System.out.print(numeros[l] + ",");
		}
	}
	

}
