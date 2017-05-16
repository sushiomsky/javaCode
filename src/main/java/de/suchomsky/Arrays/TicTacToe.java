package de.suchomsky.Arrays;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by dennis on 09.03.17.
 */
public class TicTacToe extends JFrame implements MouseListener {

private Graphics gDraw;
private fieldValues[][] gameField;
private int round = 0;

/**
 * Create the frame.
 */
public TicTacToe() {
	super();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 300);
	addMouseListener(this);
	gameField = new fieldValues[3][3];
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			gameField[i][j] = fieldValues.NOBODY;
		}
	}
}

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		@Override
		public void run() {
			try {
				final TicTacToe frame = new TicTacToe();
				frame.setVisible(true);
			} catch (final Exception e) {
				e.printStackTrace();
			}
		}
	});
}

@Override
public void paint(Graphics g) {
	g.drawLine(0, 100, 300, 100);
	g.drawLine(0, 200, 300, 200);
	g.drawLine(100, 0, 100, 300);
	g.drawLine(200, 0, 200, 300);
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if (gameField[i][j] == fieldValues.PLAYER_O) {
				g.drawOval(i * 100, j * 100, 99, 99);
				g.fillOval(i * 100, j * 100, 99, 99);

			} else if (gameField[i][j] == fieldValues.PLAYER_X) {
				g.drawLine(i*99+1,j*99+1,i*99+100,j*99+100);
				g.drawLine(i*99+100,j*99+1,i*99+1,j*99+100);
			//	g.drawLine(i*200,j*100,i*100,j*199);
			}
		}
	}
}

@Override
public void mouseClicked(MouseEvent e) {
	System.out.println("X: " + e.getX() + " Y:" + e.getY());
	int x = e.getX() / 100;
	int y = e.getY() / 100;

	if (gameField[x][y] == fieldValues.NOBODY) {
		if (round % 2 == 0) {
			gameField[x][y] = fieldValues.PLAYER_O;
		} else {
			gameField[x][y] = fieldValues.PLAYER_X;
		}
		round++;
	}
}

@Override
public void mousePressed(MouseEvent e) {

}

@Override
public void mouseReleased(MouseEvent e) {

}

@Override
public void mouseEntered(MouseEvent e) {

}

@Override
public void mouseExited(MouseEvent e) {

}

private enum fieldValues {PLAYER_X, PLAYER_O, NOBODY}

}
