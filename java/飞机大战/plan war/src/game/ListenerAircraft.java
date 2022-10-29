package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 * 飞机的监听者
 * @author 王贺祥
 *
 */
class ListenerAircraft extends KeyAdapter {
	Game game;
	public ListenerAircraft(Game game) {
		this.game = game;
	}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.game.aircraft.dir_up=true;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.game.aircraft.dir_down=true;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.game.aircraft.dir_left=true;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.game.aircraft.dir_right=true;
		}
	}
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.game.aircraft.dir_up=false;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.game.aircraft.dir_down=false;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.game.aircraft.dir_left=false;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.game.aircraft.dir_right=false;
		}

		if(e.getKeyCode() == KeyEvent.VK_SPACE&&game.pause==true) {
			this.game.pause=false;
		}else if(e.getKeyCode() == KeyEvent.VK_SPACE&&game.pause==false) {
			this.game.pause=true;
		}
		if(e.getKeyCode() == KeyEvent.VK_B&&game.paidanNum>0) {
			game.addmybullets(7);
			game.paidanNum--;
		}
	}
}
