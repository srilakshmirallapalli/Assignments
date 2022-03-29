import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class ThreadTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WashingMachine w1 = new WashingMachine("Bosch", 100, 200);
		WashingMachine w2 = new WashingMachine("IFB", 300, 400);
		WashingMachine w3 = new WashingMachine("Samsung", 500, 600);
	

	
		Thread t1 = new Thread(w1); //4
		Thread t2 = new Thread(w2);
		Thread t3 = new Thread(w3);

		t1.start(); 
		t2.start(); 
		t3.start();

	}
}

class TypeOfMachine
{
	}
class WashingMachine extends Frame implements Runnable
{
	String name;
	TextField t = new TextField(40);
	public WashingMachine(String name, int x, int y) {
		super();
		this.name = name;
		setSize(300, 400);
		setLocation(x, y);
		setLayout(new FlowLayout());
		add(t);
		setVisible(true);
	}

	public void run() 
	{ 
		for(int i=1;i<3000;i++)
	
			t.setText("/t"+name+" Machine is running..."+i);

	} 
}

class Message extends Thread
{
	String msg;

	public Message(String msg)
	{
		super();
		this.msg = msg;
	}

	public void run() 
	{ 
		for(int i=1;i<300;i++) {
			try 
			{
				Thread.sleep(10);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(""+msg+i);
	}
}

}	
