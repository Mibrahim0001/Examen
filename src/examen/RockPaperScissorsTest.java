package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {

	@Test
	void test1() {
		String computerChoice = "Rock";
		String userChoice = "Rock";
		String respuesta = RockPaperScissors.checkGame(userChoice, computerChoice);
		String esperado = "It's a tie!";
		
		assertEquals(respuesta, esperado);
	}
	@Test
	void test2() {
		String computerChoice = "Scissors";
		String userChoice = "Rock";
		String respuesta = RockPaperScissors.checkGame(userChoice, computerChoice);
		String esperado = "You win this round!";
		
		assertEquals(respuesta, esperado);
	}
	@Test
	void test3() {
		String computerChoice = "Rock";
		String userChoice = "Paper";
		String respuesta = RockPaperScissors.checkGame(userChoice, computerChoice);
		String esperado = "You win this round!";
		
		assertEquals(respuesta, esperado);
	}
	@Test
	void test4() {
		String computerChoice = "Paper";
		String userChoice = "Rock";
		String respuesta = RockPaperScissors.checkGame(userChoice, computerChoice);
		String esperado = "Computer wins this round!";
		
		assertEquals(respuesta, esperado);
	}
	

}
