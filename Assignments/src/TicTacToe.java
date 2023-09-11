import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
	private JButton[][] buttons;
	private char[][] board;
	private char currentPlayer;
	private boolean gameOver;
	private int xWins;
	private int oWins;

	private JLabel playerLabel;
	private JLabel xWinsLabel;
	private JLabel oWinsLabel;

	public TicTacToe() {
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(false); // Disable window resizing

		buttons = new JButton[3][3];
		board = new char[3][3];
		currentPlayer = 'X';
		gameOver = false;
		xWins = 0;
		oWins = 0;

		JPanel boardPanel = new JPanel();
		boardPanel.setLayout(new GridLayout(3, 3));
		boardPanel.setBackground(Color.BLACK); // Set background color

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j] = new JButton();
				buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
				buttons[i][j].addActionListener(this);
				buttons[i][j].setBackground(Color.pink); // Set button color
				buttons[i][j].setForeground(Color.black); // Set button text color
				buttons[i][j].setFocusPainted(false); // Remove button focus border
				boardPanel.add(buttons[i][j]);
				board[i][j] = ' ';
			}
		}

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());

		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetGame();
			}
		});
		resetButton.setFocusPainted(false); // Remove button focus border
		resetButton.setBackground(Color.LIGHT_GRAY); // Set button color

		buttonPanel.add(resetButton);

		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new FlowLayout());

		playerLabel = new JLabel("Current Player: " + currentPlayer);
		playerLabel.setForeground(Color.WHITE); // Set label text color
		playerLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

		xWinsLabel = new JLabel("Player X Wins: " + xWins);
		xWinsLabel.setForeground(Color.WHITE); // Set label text color
		xWinsLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

		oWinsLabel = new JLabel("Player O Wins: " + oWins);
		oWinsLabel.setForeground(Color.WHITE); // Set label text color
		oWinsLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

		infoPanel.add(playerLabel);
		infoPanel.add(xWinsLabel);
		infoPanel.add(oWinsLabel);
		infoPanel.setBackground(Color.BLACK); // Set background color

		add(boardPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.NORTH);
		add(infoPanel, BorderLayout.SOUTH);

		pack();
		setSize(400, 400); // Set a specific size for the frame
		setLocationRelativeTo(null); // Center the window on the screen
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();

		if (!gameOver) {
			if (button.getText().equals("")) {
				button.setText(Character.toString(currentPlayer));
				button.setEnabled(false);

				int row = -1;
				int col = -1;

				// Find the button's position in the array
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (button.equals(buttons[i][j])) {
							row = i;
							col = j;
							break;
						}
					}
				}

				if (row != -1 && col != -1) {
					board[row][col] = currentPlayer;

					if (isWinningMove(row, col)) {
						playerLabel.setText("Player " + currentPlayer + " wins!");
						gameOver = true;
						if (currentPlayer == 'X') {
							xWins++;
							xWinsLabel.setText("Player X Wins: " + xWins);
						} else {
							oWins++;
							oWinsLabel.setText("Player O Wins: " + oWins);
						}
						showWinningDialog(currentPlayer);
					} else if (isBoardFull()) {
						playerLabel.setText("It's a draw!");
						gameOver = true;
						showDrawDialog();
					} else {
						currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
						playerLabel.setText("Current Player: " + currentPlayer);
					}
				}
			}
		}
	}

	public boolean isWinningMove(int row, int col) {
		// Check row
		if (board[row][0] == board[row][1] && board[row][0] == board[row][2] && board[row][0] != ' ') {
			return true;
		}
		// Check column
		if (board[0][col] == board[1][col] && board[0][col] == board[2][col] && board[0][col] != ' ') {
			return true;
		}
		// Check diagonals
		if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ')
				|| (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != ' ')) {
			return true;
		}
		return false;
	}

	public boolean isBoardFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public void resetGame() {
		resetBoard();
		xWins = 0;
		oWins = 0;
		xWinsLabel.setText("Player X Wins: " + xWins);
		oWinsLabel.setText("Player O Wins: " + oWins);
		gameOver = false;
	}

	public void resetBoard() {
		currentPlayer = 'X';
		playerLabel.setText("Current Player: " + currentPlayer);
		gameOver = false;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j].setText("");
				buttons[i][j].setEnabled(true);
				board[i][j] = ' ';
			}
		}
	}

	public void showWinningDialog(char player) {
		String message = "Player " + player + " wins!";
		JOptionPane.showMessageDialog(this, message, "Game Over", JOptionPane.INFORMATION_MESSAGE);
	}

	public void showDrawDialog() {
		String message = "It's a draw!";
		JOptionPane.showMessageDialog(this, message, "Game Over", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TicTacToe();
			}
		});
	}
}
