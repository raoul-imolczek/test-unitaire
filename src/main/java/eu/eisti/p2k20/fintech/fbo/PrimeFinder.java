package eu.eisti.p2k20.fintech.fbo;

public class PrimeFinder {

	public static int[] getPrimes(int nb) {
		
		int [] nombresPremiers = new int[nb]; // initialisation d’un tableau
		
		nombresPremiers[0] = 2; // 2 est le premier nombre premier
		
		int i = 1; // i est le rang dans le tableau des nombres premiers
		int c = 3; // c est le prochain nombre que l’on va tester
		
		while (i < nb) { // on boucle jusqu’à ce qu’on ait trouvé nb nombres premiers
			boolean estPremier = true; // jusqu’à preuve du contraire un nombre est premier
			for (int d = 0; d < i; d++) { // test de division par les nombres premiers connus
				if (c % nombresPremiers[d] == 0) { // si il est divisible
					estPremier = false; // alors il n’est pas premier
					break; // et cela ne sert à rien de continuer à boucler
				}
			}
			if (estPremier) { // s’il est premier
				nombresPremiers[i] = c; // alors on l’ajoute à la liste
				i++; // et on cherche le prochain nombre premier
			}
			c++; // dans tous les cas, on passe au nombre suivant à tester
		}
		
		return nombresPremiers;
	}
	
}

