import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicTacNine implements ActionListener {

	Icon images;
	private JButton exit, restart;
	private JPanel panel = new JPanel();
	private JFrame board = new JFrame("Tic Tac Nine");
	public JButton one = new JButton("");
	public JButton two = new JButton("");
	public JButton three = new JButton("");
	public JButton four = new JButton("");
	public JButton five = new JButton("");
	public JButton six = new JButton("");
	public JButton seven = new JButton("");
	public JButton eight = new JButton("");
	public JButton nine = new JButton("");
	private Box1 bone = new Box1("Box1", false, this);
	private Box2 btwo = new Box2("Box2", false, this);
	private Box3 bthree = new Box3("Box3", false, this);
	private Box4 bfour = new Box4("Box4", false, this);
	private Box5 bfive = new Box5("Box5", false, this);
	private Box6 bsix = new Box6("Box6", false, this);
	private Box7 bseven = new Box7("Box7", false, this);
	private Box8 beight = new Box8("Box8", false, this);
	private Box9 bnine = new Box9("Box9", false, this);

	public TicTacNine() {
		// David is X's, Nada is O's
		
		panel.setSize(750, 625);
		board.setSize(750, 625);
		panel.setLayout(new GridLayout(3, 3));

		one.setBounds(0, 0, 200, 200);
		// one.setBackground(Color.blue);
		two.setBounds(200, 0, 200, 200);
		three.setBounds(400, 0, 200, 200);
		four.setBounds(0, 200, 200, 200);
		five.setBounds(200, 200, 200, 200);
		six.setBounds(400, 200, 200, 200);
		seven.setBounds(0, 400, 200, 200);
		eight.setBounds(200, 400, 200, 200);
		nine.setBounds(400, 400, 200, 200);

		board.add(one);
		board.add(two);
		board.add(three);
		board.add(four);
		board.add(five);
		board.add(six);
		board.add(seven);
		board.add(eight);
		board.add(nine);

		one.setIcon(images);

		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);

		one.setBackground(Color.CYAN);
		two.setBackground(Color.CYAN);
		three.setBackground(Color.CYAN);
		four.setBackground(Color.CYAN);
		five.setBackground(Color.CYAN);
		six.setBackground(Color.CYAN);
		seven.setBackground(Color.CYAN);
		eight.setBackground(Color.CYAN);
		nine.setBackground(Color.CYAN);

		restart = new JButton("RESTART");
		restart.setBounds(620, 250, 100, 50);
		board.add(restart); // adds the button to the screen
		restart.addActionListener(this); // actionlistner when restart is
											// clicked

		exit = new JButton("EXIT"); // create an exit button
		exit.setBounds(620, 350, 100, 50);
		board.add(exit); // adds the exit button to the screen
		exit.addActionListener(this); // actionlistener when exit is clicked

		board.add(panel);
		board.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == one && one.getText() == "") { // restarts when
															// clicked
			this.bone = new Box1("Box 1", true, this);

		} else if (e.getSource() == two && two.getText() == "") {
			this.btwo = new Box2("Box 2", true, this);
		} else if (e.getSource() == three && three.getText() == "") {
			this.bthree = new Box3("Box 3", true, this);
		} else if (e.getSource() == four && four.getText() == "") {
			this.bfour = new Box4("Box 4", true, this);
		} else if (e.getSource() == five && five.getText() == "") {
			this.bfive = new Box5("Box 5", true, this);
		} else if (e.getSource() == six && six.getText() == "") {
			this.bsix = new Box6("Box 6", true, this);
		} else if (e.getSource() == seven && seven.getText() == "") {
			this.bseven = new Box7("Box 7", true, this);
		} else if (e.getSource() == eight && eight.getText() == "") {
			this.beight = new Box8("Box 8", true, this);
		} else if (e.getSource() == nine && nine.getText() == "") {
			this.bnine = new Box9("Box 9", true, this);
			checkFullWin();
		} else if (e.getSource() == restart) { // restarts when clicked
			board.dispose(); // disposes the actions performed on the board
			new TicTacNine();

		} else if (e.getSource() == exit) { // exits the game
			System.exit(0);
		}

		// big game winner checker

	}

	public void checkFullWin() {
//		if ((one.getIcon().equals(bone.getDavid()) && two.getIcon().equals(btwo.getDavid()) && three.getIcon().equals(bthree.getDavid()))
//				|| (four.getIcon().equals(bfour.getDavid()) && five.getIcon().equals(bfive.getDavid()) && six.getIcon().equals(bsix.getDavid()))
//				|| (seven.getIcon().equals(bseven.getDavid()) && eight.getIcon().equals(beight.getDavid()) && nine.getIcon().equals(bnine.getDavid()))
//				|| (one.getIcon().equals(bone.getDavid()) && four.getIcon().equals(bfour.getDavid()) && seven.getIcon().equals(bseven.getDavid()))
//				|| (two.getIcon().equals(btwo.getDavid()) && five.getIcon().equals(bfive.getDavid()) && eight.getIcon().equals(beight.getDavid()))
//				|| (three.getIcon().equals(bthree.getDavid()) && six.getIcon().equals(bsix.getDavid()) && nine.getIcon().equals(bnine.getDavid()))
//				|| (one.getIcon().equals(bone.getDavid()) && five.getIcon().equals(bfive.getDavid()) && nine.getIcon().equals(bnine.getDavid()))
//				|| (three.getIcon().equals(bthree.getDavid()) && five.getIcon().equals(bfive.getDavid()) && seven.getIcon().equals(bseven.getDavid()))) {

		if ((one.getText() == "X" && two.getText() == "X" && three.getText() == "X")
				|| (four.getText() == "X" && five.getText() == "X" && six.getText() == "X")
				|| (seven.getText() == "X" && eight.getText() == "X" && nine.getText() == "X")
				|| (one.getText() == "X" && four.getText() == "X" && seven.getText() == "X")
				|| (two.getText() == "X" && five.getText() == "X" && eight.getText() == "X")
				|| (three.getText() == "X" && six.getText() == "X" && nine.getText() == "X")
				|| (one.getText() == "X" && five.getText() == "X" && nine.getText() == "X")
				|| (three.getText() == "X" && five.getText() == "X" && seven.getText() == "X")) {
			
			JOptionPane.showMessageDialog(board, "PLAYER ONE WINS IT ALL!");

			int answ = JOptionPane.showConfirmDialog(null, null, "Wanna go again?", JOptionPane.YES_NO_OPTION);

			if (answ == JOptionPane.YES_OPTION) {
				board.dispose(); // disposes the actions performed on the board
				new TicTacNine();
			} else {
				JOptionPane.showMessageDialog(null, "k w/e, I don't even care tbh.");
				System.exit(0);
			}

		}

//		else if ((one.getIcon().equals(bone.getNada()) && two.getIcon().equals(btwo.getNada()) && three.getIcon().equals(bthree.getNada()))
//				|| (four.getIcon().equals(bfour.getNada()) && five.getIcon().equals(bfive.getNada()) && six.getIcon().equals(bsix.getNada()))
//				|| (seven.getIcon().equals(bseven.getNada()) && eight.getIcon().equals(beight.getNada()) && nine.getIcon().equals(bnine.getNada()))
//				|| (one.getIcon().equals(bone.getNada()) && four.getIcon().equals(bfour.getNada()) && seven.getIcon().equals(bseven.getNada()))
//				|| (two.getIcon().equals(btwo.getNada()) && five.getIcon().equals(bfive.getNada()) && eight.getIcon().equals(beight.getNada()))
//				|| (three.getIcon().equals(bthree.getNada()) && six.getIcon().equals(bsix.getNada()) && nine.getIcon().equals(bnine.getNada()))
//				|| (one.getIcon().equals(bone.getNada()) && five.getIcon().equals(bfive.getNada()) && nine.getIcon().equals(bnine.getNada()))
//				|| (three.getIcon().equals(bthree.getNada()) && five.getIcon().equals(bfive.getNada()) && seven.getIcon().equals(bseven.getNada()))) {

		else if ((one.getText() == "O" && two.getText() == "O" && three.getText() == "O")
				|| (four.getText() == "O" && five.getText() == "O" && six.getText() == "O")
				|| (seven.getText() == "O" && eight.getText() == "O" && nine.getText() == "O")
				|| (one.getText() == "O" && four.getText() == "O" && seven.getText() == "O")
				|| (two.getText() == "O" && five.getText() == "O" && eight.getText() == "O")
				|| (three.getText() == "O" && six.getText() == "O" && nine.getText() == "O")
				|| (one.getText() == "O" && five.getText() == "O" && nine.getText() == "O")
				|| (three.getText() == "O" && five.getText() == "O" && seven.getText() == "O")) {
			JOptionPane.showMessageDialog(board, "PLAYER 2 COOL 4 U!");

			int answ = JOptionPane.showConfirmDialog(null, "Wanna go again?", null, JOptionPane.YES_NO_OPTION);

			if (answ == JOptionPane.YES_OPTION) {
				board.dispose(); // disposes the actions performed on the board
				new TicTacNine();
			} else {
				JOptionPane.showMessageDialog(null, "k w/e, I don't even care tbh.");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		TicTacNine ttn = new TicTacNine();

	}
}
