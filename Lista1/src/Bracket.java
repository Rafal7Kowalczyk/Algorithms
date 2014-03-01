public class Bracket extends StacksBracket {
	int glzagniezdzenia = 0;
	int zagniezdzenie = 0;
	int wartoscWyrazenia = 1;

	public Bracket(int rozmiar) {
		super(rozmiar);
	}

	public void nawiasyOK(String wyr) {

		for (int i = 0; i < wyr.length(); i++) {
			if (wyr.charAt(i) == '(' || wyr.charAt(i) == '['
					|| wyr.charAt(i) == '{')
				super.push(wyr.charAt(i));
			else if (wyr.charAt(i) == ')') {
				if (super.liczbaelnastosie() > glzagniezdzenia) {
					glzagniezdzenia = super.liczbaelnastosie();
				}
				if (super.top() == '(')
					super.pop();
				else {
					wartoscWyrazenia = 0;
					super.pop();
				}
			} else if (wyr.charAt(i) == ']') {

				if (super.liczbaelnastosie() > glzagniezdzenia) {
					glzagniezdzenia = super.liczbaelnastosie();
				}
				if (super.top() == '[')
					super.pop();
				else {
					wartoscWyrazenia = 0;
					super.pop();
				}
			} else if (wyr.charAt(i) == '}') {

				if (super.liczbaelnastosie() > glzagniezdzenia) {
					glzagniezdzenia = super.liczbaelnastosie();
					;
				}
				if (super.top() == '{')
					super.pop();
				else {
					wartoscWyrazenia = 0;
					super.pop();
				}
			}
		}
		// if (super.top() == 0)
		System.out.println(wartoscWyrazenia);
		// if(wartoscWyrazenia==1)
		System.out.println(glzagniezdzenia);
		// else
		System.out.println("0");
	}

	public static void main(String args[]) {
		Bracket bracket = new Bracket(20);
		bracket.nawiasyOK("()");
	}
}
