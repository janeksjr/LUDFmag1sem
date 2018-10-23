//Janis Ratnieks jr09103

import java.util.Random;

public class Domino12 { 
	public static void main(String []args){
   	int Z = Integer.parseInt(args[0]);
	String[] kaulini = new String[91];
	
	if (Z>0 && Z<92)
	{
		int counter=0;
		for(int i=0;i<13;i++){//for 1
			//int j = i
			
			System.out.print(i);
			for(int j=i; j<13; j++){
				kaulini[counter]=i+"-"+j+" ";
				System.out.println(kaulini[counter]);				
				counter++;
			}
				

				
}//aiztaisa for1
}//Aiztaisa if	

//Make a shuffle
int rnd;
String rndstr, fake1;
Random rand = new Random();
	for (int i=0; i<91; i++)
{
		fake1=kaulini[i];
		rnd=rand.nextInt(91);
		System.out.println("rnd "+rnd);
		rndstr=kaulini[rnd];
		kaulini[i]=rndstr;
		kaulini[rnd]=fake1;
		
}
int chipc;
chipc=(91-91%Z)/Z;
//System.out.println("ik "+ik);
int co=0;
for (int i=1; i<=Z; i++)
{
	System.out.println("");
	System.out.print(i+". spēlētājam ir: ");
	for (int j=0; j<chipc; j++)
	{
		System.out.print(kaulini[co]);
		co++;
	}


}

}}			
/*public class Komp {
	for(int i=0,i<92;i++){
		System.out.print(i);
	}

}
	
class Kaulins {
	private int pirmais_kv; //pirmā kvadrāta vērtība
	private int otrais_kv; //otrā kvadrāta vērtība
 
 //klases konstruktors
 public Kaulins(int pirmais, int otrais) {
  pirmais_kv = pirmais;
  otrais_kv = otrais;
 }
 
//pārrakstam toString metodi
 public String toString() {
      return pirmais_kv + "-" + otrais_kv;
 }
 } 
}
}
*/

/*
Jūsu uzdevums:
Realizēt un iesūtīt līdz noteiktajam datumam kauliņu izdalīšanas programmu "Domino12.java".

Obligātas prasības:

    Programmai ir jāsaucas Domino12 (tas nozīmē ir jābūt klasei Domino12 ar atbisltošo main() metodi),
    Komplekta kauliņi jāizdala spēlētāju starpā saskaņā ar šeit aprakstītajiem noteikumiem un katram spēlētājam izdalītie kauliņi jāizdrukā teksta formā,
    Pēc izdrukas programmas darbs jābeidz, nepieprasot veikt nekādas papildus darbības (taustiņu nospiešana, informācijas ievads, utt.),
    Vairākkārt darbinot programmu, kauliņu sadalījumam spēlētāju starpā jāatšķiras - t.i. nedrīkst būt tā, ka viens un tas pats spēlētājs vienmēr saņem vienus un tos pašus kauliņus (ērti ir izmantot gadījuma skaitļa ģeneratoru, piemērus skat. lekciju materiālos),
    Savu kodu neiekļaujiet JAVA pakotnē (nelietojiet instrukciju package)!
    Programmai jābūt vienam int tipa ieejas parametram, kura vērtība tiek ievadīta no komandrindas. Piemēram, "java Domino12 4", norāda, ka jāveic kauliņu sadalīšana četriem spēlētājiem, katram no tiem iedalot pa divdesmit diviem kauliņiem. Kā paraugu datu ievadam varat izmantot MD1(pirmais mājas darbs) izmantoto konstrukciju datu ievadam no komandrinas,
    Spēlētājiem vienmēr jāiedala lielākais iespējamais kauliņu skaits (piemēram, pieciem spēlētājiem - pa astoņpadsmit kauliņiem, sešiem  - pa piecpadsmit, utt.),
    Ievvaddatus uz pareizību nav nepieciešams pārbaudīt, tie vienmēr būs veseli skaiļi norādītajā intervālā (0<n<92),
    Kauliņi var tikt attēloti dažādi. Piemēram, 12-9 vai 9-12 ir viens un tas pats kauliņš. Jūs drīkstat kauliņus (šajā nozīmē) attēlot kā Jums ērtāk.

Programmas izdrukas piemērs šešu spēlētāju gadījumam (java Domino12 6):

1.speletajam ir: 6-9 0-12 0-9 3-5 4-10 7-10 2-5 5-11 8-11 0-2 5-12 9-12 5-10 3-9 3-12
2.speletajam ir: 1-11 7-11 0-3 1-9 1-1 5-6 5-5 4-12 4-9 0-1 3-11 6-6 1-2 1-10 2-10
3.speletajam ir: 9-11 4-7 0-6 3-3 2-7 9-10 1-8 0-10 10-10 3-8 1-5 3-7 8-9 3-4 1-7
4.speletajam ir: 0-7 2-8 2-4 12-12 3-10 4-6 7-8 0-11 11-12 2-12 4-5 5-7 10-12 0-8 8-8
5.speletajam ir: 6-7 1-12 6-8 7-7 5-8 8-12 2-2 4-8 4-11 0-5 2-11 8-10 4-4 2-9 6-12
6.speletajam ir: 2-6 7-12 1-3 10-11 1-4 2-3 1-6 11-11*/

