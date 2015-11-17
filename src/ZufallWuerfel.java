public class ZufallWuerfel {

	public static void main(String[] args) {

		/*
		 * int eins = 0; int zwei = 0; int drei = 0; int vier = 0; int fuenf =
		 * 0; int sechs = 0;
		 * 
		 * for (int zahl = 0; zahl < 50; zahl++) { int x =
		 * Zufall.getZufallInt(1, 6); if (x == 1) { eins++; } else { if (x == 2)
		 * { zwei++; } else { if (x == 3) { drei++; } else { if (x == 4) {
		 * vier++; } else { if (x == 5) { fuenf++; } else { if (x == 6) {
		 * sechs++; } } } } }
		 * 
		 * } } System.out.println("Anzahl der Einsen: " + eins);
		 * System.out.println("Anzahl der Zweien: " + zwei);
		 * System.out.println("Anzahl der Dreien: " + drei);
		 * System.out.println("Anzahl der Vieren: " + vier);
		 * System.out.println("Anzahl der Fuenfen: " + fuenf);
		 * System.out.println("Anzahl der Sechsen: " + sechs);
		 */

		int[] einArray = new int[6];
		for (int i = 0; i < 50; i++) {
			int x = Zufall.getZufallInt(1, 6);

			einArray[x - 1] = einArray[x - 1] + 1;
		}
		for (int y = 0; y < 6; y++) {
			System.out.println(Zeichen(y) + ": " + einArray[y]);
		}

	}

	public static String Zeichen(int x) {

		String s = "";

		if (x == 0) {
			s = "Einsen";
		} else {
			if (x == 1) {
				s = "Zweien";
			} else {
				if (x == 2) {
					s = "Dreien";
				} else {
					if (x == 3) {
						s = "Vieren";
					} else {
						if (x == 4) {
							s = "Fünfen";
						} else {
							if (x == 5) {
								s = "Sechsen";
							}
						}
					}
				}
			}
		}

		return s;

	}

}
