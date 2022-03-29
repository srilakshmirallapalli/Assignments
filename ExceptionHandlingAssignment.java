import java.time.LocalDateTime;

public class MachineTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started.....");
		
		WashMachine wmObj1 = new WashMachine("Bosch", 7, 60);
		WashMachine wmObj2 = new WashMachine("IFB", 5, 120);
		WashMachine wmObj3 = new WashMachine("Samsung", 6, 80);
		
				
		try
		{
			wmObj1.run();
			
		}
		catch(TimeLimitException e)
		{
			System.out.println("Time limite Exceeded..stop.."+e);
		}
		
		try
		{
			wmObj2.run();
		}
		catch(TimeLimitException e)
		{
			System.out.println("Time limite Exceeded..stop..");
		}
		
		try
		{
			wmObj3.run();
		}
		catch(TimeLimitException e)
		{
			System.out.println("Time limite Exceeded..stop..");
		}
		
		
		System.err.println("washing machine object1"+wmObj3);
		
		System.out.println("end of main.....");
	}
		
}

class TimeLimitException extends Exception
{
	TimeLimitException(String str)
	{
	super(str);
	}
}

class Machine
{
	
}
class WashMachine extends Machine
{
	String model;
	int capacity;
	int runTime;
	public WashMachine(String model, int capacity, int runTime) {
		super();
		this.model = model;
		this.capacity = capacity;
		this.runTime = runTime;
	}
	@Override
	public String toString() {
		return "WashMachine [model=" + model + ", capacity=" + capacity + ", runTime=" + runTime + "]";
	}
	
	void run() throws TimeLimitException {
		System.out.println(model+" machine started running....");
		for(int i=1;i<=30;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double value= Math.random()%10;
			if(value>0.60) {
				TimeLimitException TimeLtEx = new TimeLimitException("Oh!!! You exceeded the time..stop..");
				throw TimeLtEx;
			}
			System.out.println(model+" has capacityof "+capacity+" started running for"+i+"th time at"+LocalDateTime.now());
		}
		System.out.println(model+" machine has finished its turn....");
	}
}
