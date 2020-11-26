package test;

interface Vehicle
{
	public int getNoOfWheels();
class DefaultVehicle implements Vehicle
	{
		public int getNoOfWheels()
		{
			return 2;
		}
	}
}
class Bus implements Vehicle
{
	public int getNoOfWheels()
	{
		return 6;
	}
}

 class Ballia 
{
	public static void main(String[] args) 
	{
	Vehicle.DefaultVehicle d=new Vehicle.DefaultVehicle();
	System.out.println(d.getNoOfWheels());
	
	EnumOrdinalDemo b =new EnumOrdinalDemo();
	System.out.println(d.getNoOfWheels());
	}

}
