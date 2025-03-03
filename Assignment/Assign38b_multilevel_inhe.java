package Assignments_1to100; //Multi-level inheritance using non-static method
class Data_Measurement_size
{
	void bit()
	{
		System.out.println("Bit - Single Binary Digit (1 or 0)");
	}
}
class byte1 extends Data_Measurement_size
{
	void byte_()
	{
	System.out.println("Byte-8 bits");
	}
}
class KiloByte extends byte1
{
	void KB()
	{
		System.out.println("Kilobyte (KB)-1,024 Bytes");
	}
}
class MegaByte extends KiloByte
{
	void MB()
	{
		System.out.println("Megabyte (MB)-1,024 Kilobytes");
	}
}
class GigaByte extends MegaByte
{
	void GB()
	{
		System.out.println("Gigabyte (GB)-1,024 Megabytes");
	}
}
class TetaByte extends GigaByte
{
	void TB()
	{
		System.out.println("Terabyte (TB)-1,024 Gigabytes");
	}
}
class PetaByte extends TetaByte
{
	void PB()
	{
		System.out.println("Petabyte (PB)-1,024 Terabytes");
	}
}
class ExaByte extends PetaByte
{
	void EB()
	{
		System.out.println("Exabyte (EB)-1,024 Petabytes");
	}
}

public class Assign38b_multilevel_inhe extends ExaByte
{
	void Data_Measurement()
	{
		System.out.println("Data Measurement");
	}
	public static void main(String[] args) 
	{
		Assign38b_multilevel_inhe A38b=new Assign38b_multilevel_inhe();
		A38b.bit();
		A38b.byte_();
		A38b.KB();
		A38b.MB();
		A38b.GB();
		A38b.TB();
		A38b.PB();
		A38b.EB();
	}

}








   