package examen;

import java.util.*;
/**
 * Clase donde se almacena la logica del juego
 * 
 * @author Muhammad Ibrahim
 * @version 1.0.0
 */
public class RockPaperScissors {
	/**
	 * Variable donde se almacenan las opciones del juego
	 */
	public static final List<String> opcionList = Arrays.asList("Rock", "Paper", "Scissors");
	private static int keyboard = 0;
	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * Constructor por defecto de la clase
	 */
	public RockPaperScissors() {
	}
	
	/**
	 * Metodo main  de la clase, para iniciar el juego
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> optionList = opcionList;
		do {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			System.out.print("Enter your choice (Rock(1), Paper(2), or Scissors(3)): ");
			keyboard = scanner.nextInt();
			scanner.nextLine();
		} while (keyboard < 1 || keyboard > 3);
		String computerChoice = optionList.get(new Random().nextInt(3));
		String userChoice = optionList.get(keyboard - 1);
		System.out.println("Your chose: " + userChoice + "\nComputer chose: " + computerChoice);
		System.out.println(RockPaperScissors.checkGame(userChoice, computerChoice));
		scanner.close();
	}
	
	/**
	 * Metodo para comprobar el ganador del partido
	 * @param userChoice la eleccion del juegador
	 * @param computerChoice la eleccion de la maquina
	 * @return Si ha ganado la maquina o el jugador
	 */
	public static String checkGame(String userChoice, String computerChoice) {
		String gameResult = "";
		if (userChoice.equals(computerChoice)) {
			gameResult = "It's a tie!";
		} else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
			gameResult = "You win this round!";
		} else {
			gameResult = "Computer wins this round!";
		}
		return gameResult;
	}
}