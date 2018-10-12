//Janis Ratnieks, jr09103

public class MD1 { 
	public static void main(String []args){
   	int Z = Integer.parseInt(args[0]);
	int N = Integer.parseInt(args[1]);
	String plus="+ ";
	String blank=" ";

	if((N > 0) && (N < 30) && (Z>0) && (Z<20)){
		for (int i = 0; i < Z; i++) { //Zfor
			for (int j=0; j<N; j++){
				System.out.print(" ");
			}
				for(int iZ=Z-1-i; iZ>0; iZ--){
					System.out.print(" ");
				}
			for (int k=i+1; k>0; k--){
			//String bl=new char[Z];
			System.out.print("+ ");
			
			}
			System.out.println("");
		}//aizver Zfor

//lineals
        	for (int i=1; i<71; i++) {
			System.out.print(i%10);
		}
	}//aizver if
	else{
		System.out.println("DATI NAV KOREKTI!");
	}		

}//aizver main
}//aizver class


