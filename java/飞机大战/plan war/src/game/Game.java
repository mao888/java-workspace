package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
class Game extends JPanel {      
	/** 分数*/
	int score;    
	/**背景的y坐标，用来实现背景滚动*/
	int background_y;     //背景的y坐标
	/**控制boss循环发射子弹*/
	int time;   
	/**防止飞机暴毙*/
	int time3;  
	/**boss出现的分数*/
	int bossBurnScore=600;      /////////////////////////////        
	/**特殊子弹数量*/
	int myBulletNum;                     
	/**导弹数量*/
	int myDaodanNum;  
	/**加速道具增加射速的时间*/
	int speedUptime;                     
	/**boss死亡和弹出胜利对话框的时间间隔   */
	int overTime=20;                   
	/**使线程一中各部分运行速度不同*/
	int time2;       
	/**控制添加子弹线程中导弹添加速度*/
	int addmyDaoDanTime;     
	/**超级道具初始数量*/
	int paidanNum=5; /////////////////////////////////////////激光      
	/**窗口*/
	JFrame Game_jfrm;
	/**我的飞机对象*/
	Aircraft aircraft;
	/**boss对象*/
	Boss boss;
	/**实现暂停功能*/
	boolean pause = true;               //画笔开关，飞机阵亡开关关闭,暂停时开关关闭
	ImageIcon background  = new ImageIcon("image/background.png");        //背景图片的添加
	Image im = (new ImageIcon("image/aircraftIcon.png")).getImage();
	/**我的子弹容器*/
	ArrayList<MyBullet> mybullets ;       
	/**敌机容器*/
	ArrayList<Enemy> enemys ;                
	/**敌机子弹容器*/
	ArrayList<EnemyBullet> enemybullets;    
	/**boss子弹容器*/
	ArrayList<BossBullet> bossbullets;    
	/**道具容器*/
	ArrayList<Buff> buffs;  

	/**
	 * 创造游戏界面
	 * 开启线程
	 */
	Game() {
		enemybullets = new ArrayList<EnemyBullet>();      
		//利用new创建新的敌机子弹容器对象，并用enemybullets指向他
		mybullets =new ArrayList<MyBullet>();                    
		aircraft = new Aircraft(250, 480);
		enemys = new ArrayList<Enemy>();
		bossbullets = new ArrayList<BossBullet>();
		buffs = new ArrayList<Buff>();
		boss = new Boss();     
		Game_jfrm = new JFrame("飞机大战");
		Game_jfrm.setIconImage(im);
		Game_jfrm.setLayout(null);
		Game_jfrm.setSize(600,650);
		ListenerAircraft listeneraircraft = new ListenerAircraft(this);  
		Game_jfrm.addKeyListener(listeneraircraft);      //把监听者listeneraircraft向事件源Game_jfrm（实际上是）注册
		this.setSize(600,700);
		this.setLayout(null);
		Game_jfrm.add(this);
		Game_jfrm.setLocationRelativeTo(null);//窗口剧中
		Game_jfrm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);   //单机窗口的关闭按钮结束程序
		Game_jfrm.setResizable(false);        //窗口大小固定
		Game_jfrm.addWindowListener(new WindowAdapter(){         
			public void windowClosing(WindowEvent e) {
				pause=false;
				int n=JOptionPane.showConfirmDialog(null, "是否结束游戏", "请选择",JOptionPane.YES_NO_OPTION);

				if(n==JOptionPane.YES_OPTION) {
					Game_jfrm.dispose();
					new StartJframe();
				}else {
					pause=true;
				}
			}
		});
		new Thread1().start();
		new Thread2().start();
		new Thread3().start();
		Game_jfrm.setVisible(true);          //窗口可视化
		
	}
	/**
	 * 画笔
	 */
	
	public  void paint(Graphics g) {
		if(pause==true&&overTime>1) {
			//			super.paint(g);
			drawbackground(g);
			drawString(g);
			aircraft.drawaircraft(g);  //画战机
			if(score>=bossBurnScore) {
				boss.drawboss1(g);
			}
			for(int i=0;i<mybullets.size();i++) {     //我的飞机发射子弹
				MyBullet bullet=mybullets.get(i);
				bullet.drawbullet(g);
				if(mybullets.get(i).bulletSize().intersects(boss.bossSize())&&boss.life>0) {     //我的子弹打boss
					switch(mybullets.get(i).bulletType)
					{
					case 1:
					case 2:
					case 3:  boss.life--;  break;
					case 4:
					case 5:
					case 6:  boss.life-=5;  break;
					}
					if(boss.life<=0) score+=400;     
					mybullets.remove(mybullets.get(i));     //击中boss后移除我的子弹
				}
				for(int j=0;j<enemys.size()&&i<mybullets.size();j++) {     //我的子弹打敌机
					if(mybullets.get(i).bulletSize().intersects(enemys.get(j).enemySize())  //我的子弹碰敌机
							) {
						switch(mybullets.get(i).bulletType)
						{
						case 1:
						case 2:
						case 3:  
						case 4:  enemys.get(j).life--;  break;
						case 5:
						case 6:  enemys.get(j).life-=7;  break;
						case 7:  enemys.get(j).life-=7;  break;
						}
						if(mybullets.get(i).bulletType!=7) {
							mybullets.remove(mybullets.get(i));        //我的子弹击中敌机后，我的子弹被移除
						}
					}
					if(enemys.get(j).life<=0) {   		
						enemys.get(j).time--;      //敌人生命值为零后 敌人对象中的time逐渐减到零，此过程中爆炸图片一值在重画
					}
					if(enemys.get(j).time<=0) {     //敌人对象中的time为零后移除
						switch(enemys.get(j).enemy_type)
						{
						case 1:   score+=5;   break;
						case 2:   score+=10;  break;
						case 3:   score+=15;  break;
						case 4:   score+=15;
						}
						enemys.remove(enemys.get(j));	    //敌机死亡后移除

					}
				}	
			}
			for(int i =0 ; i<mybullets.size();i++) {     //我的子弹越界移除
				if(mybullets.get(i).y<-50) {
					mybullets.remove(mybullets.get(i));
				}
			}
			for(int i=0;i<buffs.size();i++) {    //获得buff
				Buff buff=buffs.get(i);
				buff.drawBuff(g);
				if(buffs.get(i).buffSize().intersects(aircraft.aircraftSize())) {
					switch(buffs.get(i).buffType)
					{
					case 1:    myBulletNum=50;   break;
					case 2:    myDaodanNum=25;   break;
					case 3:    aircraft.life++;  break;
					case 4:    
						if(aircraft.life>aircraft.Life) {} 
						else aircraft.life=aircraft.Life;
						break;
					case 5:    speedUptime=100;  break;
					case 6:    paidanNum+=1; 
					}
					buffs.remove(buffs.get(i));
				}
			}
			time3++;
			if(boss.bossSize().intersects(aircraft.aircraftSize())&&time3%15==0)  
				aircraft.life--;
			for(int i=0;i<enemys.size();i++) {     //增加敌机
				Enemy enemy=enemys.get(i);
				enemy.drawenemy(g);
				boolean rem = true;
				if(enemys.get(i).enemySize().intersects(aircraft.aircraftSize())) {
					aircraft.life--;
					score+=5;
					enemys.remove(enemys.get(i));
					rem = false;
				}
				if(rem) {
					if(enemys.get(i).y>600) {
						enemys.remove(enemys.get(i));
					}
				}
			}
			for(int i = 0;i<enemybullets.size();i++) {      //敌人发射子弹
				EnemyBullet enemybullet = enemybullets.get(i);
				enemybullet.drawenemy_bullet(g);
				boolean hit=false;
				if(	enemybullets.get(i).enemyBulletSize().intersects(aircraft.aircraftSize())) {
					aircraft.life-=1;
					hit=true;
				}
				for(int j = 0;j<mybullets.size();j++) {
					if(mybullets.get(j).bulletSize().intersects(enemybullets.get(i).enemyBulletSize())) {
						if(mybullets.get(j).bulletType==7) hit=true;
					}
				}
				if(enemybullets.get(i).y>600||hit) {   //敌人子弹击中我和敌人子弹越界后的移除
					enemybullets.remove(enemybullets.get(i));
				}
			}
			if(score>=bossBurnScore) {        //boss发射子弹
				for(int i = 0;i<bossbullets.size();i++) {
					BossBullet bossbullet = bossbullets.get(i);
					bossbullet.drawenemy_bullet(g);
					boolean bossHit=false;
					if(	bossbullets.get(i).bossBulletSize().intersects(aircraft.aircraftSize())) {
						aircraft.life-=1;
						bossHit=true;
					}
					for(int j = 0;j<mybullets.size();j++) {
						if(mybullets.get(j).bulletSize().intersects(bossbullets.get(i).bossBulletSize())) {
							if(mybullets.get(j).bulletType==7) bossHit=true;
						}
					}
					if(bossbullets.get(i).y>600||bossHit) {   //敌人子弹击中我和敌人子弹越界后的移除
						bossbullets.remove(bossbullets.get(i));
					}
				}
			}

			if(boss.life<=0) overTime--;
			if(overTime==1) {
//				overTime-=100;
				// boss死亡后弹出胜利对话框   
				int n = JOptionPane.showConfirmDialog(null, "你胜利了\n是否再来一局？","", JOptionPane.YES_NO_OPTION);
				if(n==JOptionPane.YES_OPTION) {
					Game_jfrm.dispose();    //关闭游戏窗口
					new Game();             //打开新的游戏窗口
				}else  {
					//					System.exit(0);
					Game_jfrm.dispose();
					new StartJframe();  //打开开始界面窗口
				}
			}
		}

		if(aircraft.life<0) {          // 阵亡后后弹出失败对话框
			int n = JOptionPane.showConfirmDialog(null, "很遗憾  您已阵亡\n是否重新开始？","", JOptionPane.YES_NO_OPTION);
			if(n==JOptionPane.YES_OPTION) {
				Game_jfrm.dispose();//关闭游戏窗口
				new Game();        //打开新的游戏窗口
			} else {
				Game_jfrm.dispose();//关闭游戏窗口
				//								System.exit(0);
				new StartJframe();   //打开开始界面窗口
			}
		}

	}
	/**
	 * 添加道具
	 * 添加敌机 
	 * 添加敌机子弹
	 * 添加boss子弹
	 * @author 王贺祥
	 *
	 */
	class Thread1 extends Thread{

		public void run() {
			while(true) {
				try {                                        
					if(pause==true&&aircraft.life>=0&&boss.life>=0) {
						time2++;
						//添加buff
						if(score<100) {
							if(time2%170==0) addbuff();
						}else if(score<300) {
							if(time2%150==0) addbuff();
						}else if(score<500) {
							if(time2%130==0) addbuff();
						}else {
							if(time2%100==0) addbuff();
						}

						//添加敌机
						if(score<bossBurnScore) {
							
						}
						
						if(boss.life>0&&score<bossBurnScore) {
							if(score<100) {
								if(time2%12==0) addenemy();
							}else if(score<300) {
								if(time2%10==0) addenemy();
							}else if(score<500) {
								if(time2%9==0) addenemy();
							}else if(score<800){
								if(time2%8==0) addenemy();  
							}
						}else if(boss.life>0&&score>bossBurnScore){
							if(time2%40==0) addenemy();
						}

						//添加敌机子弹
						if(time2%9==0) addenemybullets();
						//boss在不同的时间发射不同类型的子弹，循环
						
						if(boss.life>0&&score>=bossBurnScore&&boss.time>200&&time2%2==0)	{
							time++;
							if(time<=17) {    
								addbossbullets(1);
								addbossbullets(2);	
								addbossbullets(3);
							}else if(time>50&&time<65) {
								addbossbullets(4);
								addbossbullets(5);	
							}else if(time>105&&time<120) {
								addbossbullets(1);
								addbossbullets(2);	
								addbossbullets(3);
							}else if(time==130){
								time = 0;
							}
						}
					}
					sleep(100);
				}catch (Exception e) {
				}
			}
		}

	}
	/**
	 * 添加我的各种子弹线程
	 * @author 王贺祥
	 *
	 */
	class Thread2 extends Thread{
		//添加我的子弹线程
		public void run() {
			while(true) {
				try {				
					if(pause==true&&aircraft.life>=0) {  
						addmybullets(1);
						addmybullets(2);
						if(myBulletNum>0) {           //添加散射子弹
							addmybullets(3);
							addmybullets(4);
							myBulletNum--;
						}
						if(myDaodanNum>0) {           //添加导弹
							addmyDaoDanTime++;
							if(addmyDaoDanTime%3==0) {
								addmybullets(5);
								addmybullets(6);
								myDaodanNum--;
							}
						}
					}
					if(speedUptime>0)  { speedUptime--; sleep(150);}   //添加我的子弹的时间间隔
					else if(speedUptime<=0) sleep(300);
				}catch (Exception e) {
				}
			}
		}
	}
	/**
	 * 使画笔重画
	 * @author 王贺祥
	 *
	 */
	class Thread3 extends Thread{
		//添加我的子弹线程
		public void run() {
			while(true) {
				try {	
					if(aircraft.life>=0&&pause==true&&overTime>1)
						repaint();
					sleep(13);
				}catch (Exception e) {
				}
			}
		}
	}
	/**
	 * 画游戏界面中左上角的字体
	 * @param g
	 */
	public void drawString(Graphics g) {
		g.setFont(new Font("楷体",Font.ITALIC,15));     
		g.setColor(Color.GREEN);                     
		g.drawString("你的分数: "+score, 20, 20);
		g.drawString("你的生命: ", 20, 40);
		g.drawString("*"+paidanNum, 45, 65);
	}
	/**
	 * 背景滚动
	 * @param g  画笔对象
	 */
	public void drawbackground(Graphics g) {                 
		if(background_y>=650) 		background_y=0;
		g.drawImage(background.getImage(), 0, background_y     ,600,650, null);
		g.drawImage(background.getImage(), 0, background_y-650 ,600,650, null);
		background_y++;
	}
	/**
	 * 实例化一个子弹，并添加到mybullets容器里面
	 * @param i 传入子弹类型
	 */
	public void addmybullets(int i) {       
		MyBullet aircraft_bullet=new MyBullet( aircraft.x, aircraft.y,i);
		mybullets.add(aircraft_bullet);
	}
	/**
	 * 添加相应的敌机
	 * 不同分数段不同敌机出现的概率不同
	 */
	public void addenemy() {    
		int random =(int) (100*Math.random());
		if(score<=100) {
			if(random<70) {
				addEnemy(3,1);
			}else if(random<85) {
				addEnemy(3,2);
			}else if(random<93) {
				addEnemy(5,3);
			}else {
				addEnemy(5,4);
			}
		}else if(score<=550) {
			if(random<45) {
				addEnemy(4,1);
			}else if(random<70) {
				addEnemy(4,2);
			}else if(random<85) {
				addEnemy(5,3);
			}else {
				addEnemy(5,4);
			}
		}else if(score<=800) {
			if(random<30) {
				addEnemy(5,1);
			}else if(random<60) {
				addEnemy(5,2);
			}else if(random<75) {
				addEnemy(7,3);
			}else {
				addEnemy(7,4);
			}
		}else {
			if(random<15) {
				addEnemy(6,1);
			}else if(random<50) {
				addEnemy(6,2);
			}else if(random<70) {
				addEnemy(8,3);
			}else {
				addEnemy(8,3);
			}
		}
	}
	/**
	 * 实例化一个敌机对象，并添加到enemys里面
	 * @param enemyLife 敌人血量
	 * @param enemyType 敌人类型
	 */
	public void addEnemy(int enemyLife,int enemyType) {   //添加敌机
		int random_x=(int)(600*Math.random());
		Enemy enemy = new Enemy(random_x,-10,enemyLife,enemyType);  
		enemys.add(enemy);
	}
	/**
	 * 不同的敌人添加不同类型的子弹
	 */
	public void addenemybullets() {     //添加敌机子弹
		for(int i=0;i<enemys.size();i++) {
			switch(enemys.get(i).enemy_type) {

			case 1:    break;
			case 2:
				EnemyBullet enemybullet = new EnemyBullet(enemys.get(i).x,enemys.get(i).y, 1);
				if(enemys.get(i).bulletNum<2)   enemybullets.add(enemybullet);
				enemys.get(i).bulletNum++;
				break;
			case 3:
				EnemyBullet enemybullet1 = new EnemyBullet(enemys.get(i).x,enemys.get(i).y, 2);
				if(enemys.get(i).bulletNum<3)   enemybullets.add(enemybullet1);
				enemys.get(i).bulletNum++;
				break;
			case 4:
				EnemyBullet enemybullet2 = new EnemyBullet(enemys.get(i).x,enemys.get(i).y, 3);
				if(enemys.get(i).bulletNum<6)   enemybullets.add(enemybullet2);
				enemys.get(i).bulletNum++;
				EnemyBullet enemybullet3 = new EnemyBullet(enemys.get(i).x,enemys.get(i).y, 4);
				if(enemys.get(i).bulletNum<6)   enemybullets.add(enemybullet3);
				enemys.get(i).bulletNum++;
			}
		}
	}
	/**
	 * 实例化一个boss子弹对象，并添加到容器bossbullets里面
	 * @param i boss子弹类型
	 */
	public void addbossbullets(int i) {   //添加boss子弹
		BossBullet  bossbullet = new BossBullet(boss.x, boss.y,i);	
		bossbullets.add(bossbullet);
	}
	/**
	 * 实例化一个道具子弹对象，并添加到容器buffs里面
	 * @param i 道具类型
	 */
	public void addBuff(int i) {      //添加buff
		int buff_x=(int)(550*Math.random());
		Buff buff = new Buff(buff_x, -10,i);
		buffs.add(buff);
	}
	/**
	 * 线程里面调用这个方法，
	 * 在这个方法里面，调用添加道具方法，添加不同道具的概率不同
	 */
	public void addbuff() {    
		int buffType=(int)(100*Math.random());         //随机判断出现的buff类型
		if(buffType<25)   addBuff(1);
		else if(buffType<50) addBuff(2);
		else if(buffType<65) addBuff(3);
		else if(buffType<75) addBuff(4);
		else if(buffType<90) addBuff(5);
		else addBuff(6);

	}
}

