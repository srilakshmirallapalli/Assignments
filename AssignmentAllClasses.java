
public class AssociationAllClasses {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}

class Online
{
	public void buy()
	{
		System.out.println("In Online--Buy various products and services ");
	}
	public void sell()
	{
		System.out.println("ohh!!we can do Selling as well in online");
	}
	
//	Trading buyShares()
//	{
//		Trading trObj = new Trading();
//		return trObj;
//	}
	
}

class Trading
{
	TwoWheeler bikeObj1 = new TwoWheeler();
	return bikeObj1;
}

class TwoWheeler
{
	public void bikeName()
	{
		System.out.println("Honda offering shares to its staff for Trading ");

	}
}

class Library extends Online
{
	Books bookobj1 = new Books();
	return bookobj1;
}

class Books 
{
	ClassRoom crobj1 = new ClassRoom();
	return crObjj1;
}


class ClassRoom 
{
	ReportCard rptObj1= new ReportCard();
	Guitar gtrObj1 = new Guitar();
	return gtrObj1;
	//return rptObj1;
}

class ReportCard
{
	public void finalResult()
	{
		System.out.println("final exams result is declared");
	}
}

class Guitar 
{
	Restaurant rstrObj1 = new Restaurant;
	return rstrObj1;
}


class Restaurant
{
	public void musician()
	{
		System.out.println("Guitarist plays Guitar for parties held in Restaurant");
	}
	
	public void foodTypes()
	{
		System.out.println("Restaurant serves delicious dishes of various states");

	}
	
	
}

class Food extends Restaurant
{
	Kfc kfcObj1 = new Kfc();
	return Kfc;
}

class Kfc
{
	Branch brObj1 = new Branch();
	return brObj;
}

class Branch
{
//	Feedback fdBckObj1 = new Feedback();
//	return fdbkObj1;
	
	Acquarium acqObj1 = new Acquarium();
	return acqObj1;
}

class Acquarium
{
	public void acq()
	{
		System.out.println("Acquarium available at the branch is full of gold fishes");
	}
}


class Feedback
{
	boolean fbtype = true;
	
	public void Fbtype()
	{
		System.out.println("feedback is taken online"+fbtype);
	}
	
}

class Shirts extends Online
{
	public void buyShirt()
	{
		System.out.println("i have purchased shirt online");
	}
}

class AirCond extends Online
{
	public void buyShirt()
	{
		System.out.println("i have purchased shirt online");
	}
}

class MovieTkt extends Online
{
	public void buyTkt()
	{
		System.out.println("i have purchased movie ticket online");
	}
}

class Gasbill extends Online
{
	public void payBill()
	{
		System.out.println("i have paid gasbill online");
	}
}

class HolidayHome extends Online
{
	public void bookHome()
	{
		System.out.println("i have booked Holiday home in makemytrip");
	}
}
