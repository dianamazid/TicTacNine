import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Box5 extends JFrame implements ActionListener {

	private JFrame board = new JFrame("Tic Tac Nine");

	private JButton one = new JButton("");
	private JButton two = new JButton("");
	private JButton three = new JButton("");
	private JButton four = new JButton("");
	private JButton five = new JButton("");
	private JButton six = new JButton("");
	private JButton seven = new JButton("");
	private JButton eight = new JButton("");
	private JButton nine = new JButton("");
	private JFrame close = new JFrame();
	private boolean XgoesFirst;
	private boolean playerTurn;
	private int[][] checkWin;
	private String whoWon;
	private int counter;
	private int winner;
	private TicTacNine ttn;
	private Icon nada;
	private Icon david;

	public Box5(String box, boolean turn, TicTacNine t) {

		ttn = t;
		nada = new ImageIcon("basit.jpg");
		david = new ImageIcon("dave.jpg");
		XgoesFirst = true;

		if (turn) {
			counter = 1;
			winner = 0;

			playerTurn = turn;
			board.setTitle(box);

			board.setSize(300, 300);
			board.setLayout(new GridLayout(3, 3));

			board.add(one);
			board.add(two);
			board.add(three);
			board.add(four);
			board.add(five);
			board.add(six);
			board.add(seven);
			board.add(eight);
			board.add(nine);

			one.addActionListener(this);
			two.addActionListener(this);
			three.addActionListener(this);
			four.addActionListener(this);
			five.addActionListener(this);
			six.addActionListener(this);
			seven.addActionListener(this);
			eight.addActionListener(this);
			nine.addActionListener(this);

			one.setBackground(Color.GREEN);
			two.setBackground(Color.RED);
			three.setBackground(Color.BLUE);
			four.setBackground(Color.PINK);
			five.setBackground(Color.WHITE);
			six.setBackground(Color.ORANGE);
			seven.setBackground(Color.YELLOW);
			eight.setBackground(Color.MAGENTA);
			nine.setBackground(Color.GRAY);

			board.setVisible(turn);
		}

	}

	public String getWhoWon() {
		return whoWon;
	}
	
	public Icon getDavid() {
		return david;
	}
	
	public Icon getNada() {
		return nada;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// drawing X's and O's

		if (XgoesFirst == true) {
			if (e.getSource() == one && one.getText() == "") {
				Font currentFont = one.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				one.setFont(newFont);
				one.setText("X");
				XgoesFirst = false;
				counter++;
			} else if (e.getSource() == two && two.getText() == "") {
				Font currentFont = two.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				two.setFont(newFont);
				two.setText("X");
				XgoesFirst = false;
				counter++;
			} else if (e.getSource() == three && three.getText() == "") {
				Font currentFont = three.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				three.setFont(newFont);
				three.setText("X");
				XgoesFirst = false;
				counter++;
			} else if (e.getSource() == four && four.getText() == "") {
				Font currentFont = four.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				four.setFont(newFont);
				four.setText("X");
				XgoesFirst = false;
				counter++;
			} else if (e.getSource() == five && five.getText() == "") {
				Font currentFont = five.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				five.setFont(newFont);
				five.setText("X");
				XgoesFirst = false;
				counter++;
			} else if (e.getSource() == six && six.getText() == "") {
				Font currentFont = six.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				six.setFont(newFont);
				six.setText("X");
				XgoesFirst = false;
				counter++;
			} else if (e.getSource() == seven && seven.getText() == "") {
				Font currentFont = seven.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				seven.setFont(newFont);
				seven.setText("X");
				XgoesFirst = false;
				counter++;
			} else if (e.getSource() == eight && eight.getText() == "") {
				Font currentFont = eight.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				eight.setFont(newFont);
				eight.setText("X");
				XgoesFirst = false;
				counter++;
			} else if (e.getSource() == nine && nine.getText() == "") {
				Font currentFont = nine.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				nine.setFont(newFont);
				nine.setText("X");
				XgoesFirst = false;
				counter++;
			}

		} else {
			if (e.getSource() == one && one.getText() == "") {
				Font currentFont = one.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				one.setFont(newFont);
				one.setText("O");
				XgoesFirst = true;
				counter++;
			} else if (e.getSource() == two && two.getText() == "") {
				Font currentFont = two.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				two.setFont(newFont);
				two.setText("O");
				XgoesFirst = true;
				counter++;
			} else if (e.getSource() == three && three.getText() == "") {
				Font currentFont = three.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				three.setFont(newFont);
				three.setText("O");
				XgoesFirst = true;
				counter++;
			} else if (e.getSource() == four && four.getText() == "") {
				Font currentFont = four.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				four.setFont(newFont);
				four.setText("O");
				XgoesFirst = true;
				counter++;
			} else if (e.getSource() == five && five.getText() == "") {
				Font currentFont = five.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				five.setFont(newFont);
				five.setText("O");
				XgoesFirst = true;
				counter++;
			} else if (e.getSource() == six && six.getText() == "") {
				Font currentFont = six.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				six.setFont(newFont);
				six.setText("O");
				XgoesFirst = true;
				counter++;
			} else if (e.getSource() == seven && seven.getText() == "") {
				Font currentFont = seven.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				seven.setFont(newFont);
				seven.setText("O");
				XgoesFirst = true;
				counter++;
			} else if (e.getSource() == eight && eight.getText() == "") {
				Font currentFont = eight.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				eight.setFont(newFont);
				eight.setText("O");
				XgoesFirst = true;
				counter++;
			} else if (e.getSource() == nine && nine.getText() == "") {
				Font currentFont = nine.getFont();
				Font newFont = new Font("Arial", Font.PLAIN, 45);
				nine.setFont(newFont);
				nine.setText("O");
				counter++;
				XgoesFirst = true;
			}
		}

		// check for win
		if ((one.getText() == "X" && two.getText() == "X" && three.getText() == "X")
				|| (four.getText() == "X" && five.getText() == "X" && six.getText() == "X")
				|| (seven.getText() == "X" && eight.getText() == "X" && nine.getText() == "X")
				|| (one.getText() == "X" && four.getText() == "X" && seven.getText() == "X")
				|| (two.getText() == "X" && five.getText() == "X" && eight.getText() == "X")
				|| (three.getText() == "X" && six.getText() == "X" && nine.getText() == "X")
				|| (one.getText() == "X" && five.getText() == "X" && nine.getText() == "X")
				|| (three.getText() == "X" && five.getText() == "X" && seven.getText() == "X")) {
			this.whoWon = "Player 1";
			JOptionPane.showMessageDialog(Box5.this, "Player 1 Wins!");

			Font currentFont = nine.getFont();
			Font newFont = new Font("Arial", Font.PLAIN, (int) ((double) 1/2));
			ttn.five.setFont(newFont);
			ttn.five.setText("X");
			
			ttn.five.setIcon(david);

			this.dispose();
			board.dispose();
			ttn.checkFullWin();

		} else if ((one.getText() == "O" && two.getText() == "O" && three.getText() == "O")
				|| (four.getText() == "O" && five.getText() == "O" && six.getText() == "O")
				|| (seven.getText() == "O" && eight.getText() == "O" && nine.getText() == "O")
				|| (one.getText() == "O" && four.getText() == "O" && seven.getText() == "O")
				|| (two.getText() == "O" && five.getText() == "O" && eight.getText() == "O")
				|| (three.getText() == "O" && six.getText() == "O" && nine.getText() == "O")
				|| (one.getText() == "O" && five.getText() == "O" && nine.getText() == "O")
				|| (three.getText() == "O" && five.getText() == "O" && seven.getText() == "O")) {
			this.whoWon = "Player 2";
			JOptionPane.showMessageDialog(Box5.this, "Player 2 Wins!");

			Font currentFont = nine.getFont();
			Font newFont = new Font("Arial", Font.PLAIN, (int) ((double) 1/2));
			ttn.five.setFont(newFont);
			ttn.five.setText("O");
			ttn.five.setIcon(nada);

			this.dispose();
			board.dispose();
			ttn.checkFullWin();
		} else if (counter == 10) {
			JOptionPane.showMessageDialog(Box5.this, "It's a tie!");
		}
	}

}
