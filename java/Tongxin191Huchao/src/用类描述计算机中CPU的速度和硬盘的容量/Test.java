package 用类描述计算机中CPU的速度和硬盘的容量;

public class Test {

	/*
	 * 创建CPU对象cpu
	 */
	public static void main(String args[]) {

		CPU cpu = new CPU();
		/*
		 * speed设置为2200
		 */
		cpu.setSpeed(2200);
		/*
		 * 创建HardDisk对象disk
		 */
		HardDisk disk = new HardDisk();
		/*
		 * amout设置为200
		 */
		disk.setAmount(200);
		/*
		 * 创建PC对象pc
		 */
		PC pc = new PC();
		/*
		 * 调用setCPU(CPU c)方法，调用时实参是cpu
		 */
		pc.setCPU(cpu);
		/*
		 * 调用setHardDisk(HardDisk h)方法，调用时实参是disk
		 */
		pc.setHardDisk(disk);

		pc.show();

	}

}
