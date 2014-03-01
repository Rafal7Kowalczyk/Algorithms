public class StacksBracket {

	char[] tab;
	int rozmiar;
	int wskaznik = 0;

	public StacksBracket(int rozmiar) {
		this.rozmiar = rozmiar;
		tab = new char[rozmiar];
	}

	public void push(char c) {
		if (wskaznik < rozmiar) {
			// ++wskaznik;
			tab[wskaznik] = c;

		} else {
			char[] tab1 = new char[2 * rozmiar];
			for (int i = 0; i < wskaznik; i++) {
				tab1[i] = tab[i];
				tab1[wskaznik] = c;

			}
		}
		wskaznik++;

	}

	public Character top() {

		if (wskaznik != 0)
			return tab[wskaznik];
		else {
			System.out.println("Pusty stos");
			return ' ';
		}
	}

	public void pop() {
		if (wskaznik > 0)
			wskaznik--;
		else
			System.out.println("Na stosie nic juz nie ma");
	}

	public int liczbaelnastosie() {
		int liczba = 0;
		top();
		while (wskaznik >= 0) {
			wskaznik--;
			liczba++;
		}

		return liczba;
	}

}
