public class segitigaHitung{
	double alas, tinggi;
	
	segitigaHitung(){
		alas = 1.0;
		tinggi = 1.0;
	}
	
	segitigaHitung(double a, double t){
		alas = a;
		tinggi = t;
	}
	
	double luas(){
		return 0.5*alas*tinggi;
	}
}