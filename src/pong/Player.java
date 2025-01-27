package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	
	public boolean right, left;
	public int x, y, widght, height;

	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.widght  = 40;
		this.height  = 5;
	}
	
	public void tick() {
		if(right) {
			x++;
		}
		else if(left) {
			x--;
		}
		if(x+widght > Game.WIDTH) {
			x = Game.WIDTH - widght;
		}
		else if(x < 0) {
			x = 0;
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, widght, height);
	}
}