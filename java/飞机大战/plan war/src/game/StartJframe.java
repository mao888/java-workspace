package game;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * 游戏的开始界面
 * @author 王贺祥
 *
 */
class StartJframe {
	JFrame start_jfrm;
	JPanel jpan ;
	JLabel lab;
	JButton bt1;
	JButton bt2;
	JButton bt3;
	ButtonListener buttonListener;
	ImageIcon start_background  = new ImageIcon("image/start_background.png");
	Image im = (new ImageIcon("image/aircraftIcon.png")).getImage();
	/**
	 * 创造一个窗口（游戏界面），里面有三个按钮
	 */
	StartJframe(){	
		buttonListener = new ButtonListener();
		start_jfrm = new JFrame("飞机大战");//创建框架对象game_jfrm
		jpan = new JPanel();
		lab = new JLabel (start_background);
		bt1 = new JButton("开始游戏");//添加按钮“开始游戏”
		bt2 = new JButton("游戏说明");//添加按钮“游戏说明”
		bt3 = new JButton("退出游戏");//添加按钮“退出游戏”
		start_jfrm.setIconImage(im);
		start_jfrm.setLayout(null);       //取消默认的边界布局管理器
		start_jfrm.setSize(600,500);  
		start_jfrm.setLocationRelativeTo(null);//窗口剧中
		start_jfrm.setResizable(false); 
		jpan.setBounds(0,0,600,500);  
		jpan.add(lab);
		bt1.setBounds(250, 280, 90, 30);
		bt2.setBounds(250, 320, 90, 30);
		bt3.setBounds(250, 360, 90, 30);
		bt1.addActionListener(buttonListener);
		bt2.addActionListener(buttonListener);
		bt3.addActionListener(buttonListener);
		start_jfrm.add(bt1);
		start_jfrm.add(bt2);
		start_jfrm.add(bt3);
		start_jfrm.add(jpan);
		start_jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //设置单击窗口上关闭按钮的处理方式为EXIT_ON_CLOSE结束程序运行
		start_jfrm.setVisible(true);       //将窗口显示出来
	}
	/**
	 * 实现ActionListener接口的内部类
	 * @author 王贺祥
	 *
	 */
	class ButtonListener implements ActionListener{         //三个按钮的监听
		public void actionPerformed(ActionEvent e) {
			JButton batton = (JButton)e.getSource();
			if(batton==bt1) {
				start_jfrm.dispose();
				new Game();
			}else if(batton==bt2) {
				JOptionPane.showMessageDialog(null, "↑ ↓ ← →分别控制战机上下左右移动\n空格键暂停\nB键使用超级武器  超级武器有数量限制，游戏中会出现增加超级武器数量的道具\n游戏中还有各种增益道具\n控制你的战斗机消灭入侵者吧","游戏说明",JOptionPane.PLAIN_MESSAGE);
			}else if(batton==bt3) {
				int n = JOptionPane.showConfirmDialog(null, "是否要退出游戏？","", JOptionPane.YES_NO_OPTION);  //对话框的弹出
				if(n==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		}
	}
}


