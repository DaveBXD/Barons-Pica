import javax.swing.JOptionPane;

public class PicerijasKods {
	
	public static String[] izvKlientu(String[] Klients) {
		
		Klients[0] = JOptionPane.showInputDialog("Ievadiet vardu");
		Klients[1] = JOptionPane.showInputDialog("Ievadiet telefonu");
		Klients[2] = JOptionPane.showInputDialog("Ievadiet adresi");
		
		return Klients;
	}
	
	public static double cenasApr(double cena, String veids, String piedevas, String dzeriens, boolean piegade) {
		
		if(veids.equals("siera") || veids.equals("studentu")) {
			cena+=5.99;
		}else {
			cena+=6.99;
		}
		
		if(!piedevas.equals("nav")) {
			cena+=0.89;
		}
		
		if(dzeriens.equals("kola")) {
			cena+=1.50;
		}else if(dzeriens.equals("udens")) {
			cena+=0.79;
		}
		
		if(piegade = true) {
			cena+=1.99;
		}
		return cena;
	}
	
	public static void apstkatit(double cena, boolean piegade, String[] Klients) {
		JOptionPane.showMessageDialog(null,"PASUTITAJS\nVards: "+Klients[0]+"\nTalrunis: "+Klients[1]+"\nAdrese: "+Klients[2]+"\n\nPASUTIJUMS\nPiegade: "+piegade+"\nCena:"+cena);
	}

	public static void main(String[] args) {
		double cena = 0;
		boolean piegade = false;
		String[] Klients = new String[3];
		String picVeids = "";
		String papPied = "";
		String dzeriens = "";
		String pagPiegade ;
		
		String izvele;
		
		do {
			izvele = JOptionPane.showInputDialog("1-Pasutit | 2-Apskatit pasutijumu | stop-beigt darbu");
			izvele = izvele.toLowerCase();
			
			switch(izvele) {
			case "1":
				izvKlientu(Klients);
				
				do {
					pagPiegade = JOptionPane.showInputDialog("Vai vajadziga piegade?\nja | ne");
					pagPiegade = pagPiegade.toLowerCase();
				}while(!pagPiegade.equals("ja") && !pagPiegade.equals("ne"));
				if(pagPiegade.equals("ja")) {
					piegade = true;
				}else {
					piegade = false;
				}
				
				do {
					picVeids = JOptionPane.showInputDialog("Picas veids\nSiera | Studentu | Hawaju | Meksikanu | BBQ");
					picVeids = picVeids.toLowerCase();
				}while(!picVeids.equals("siera") && !picVeids.equals("studentu") && !picVeids.equals("hawaju") && !picVeids.equals("meksikanu") && !picVeids.equals("bbq"));
				
				do {
					papPied = JOptionPane.showInputDialog("Papildus picas piedevas\n1-Extra siers | 2-Extra merce | Nav");
					papPied = papPied.toLowerCase();
				}while(!papPied.equals("1") && !papPied.equals("2") && !papPied.equals("nav"));
				
				do {
					dzeriens = JOptionPane.showInputDialog("Dzeriens\nKola | Udens | Nav");
					dzeriens = dzeriens.toLowerCase();
				}while(!dzeriens.equals("kola") && !dzeriens.equals("udens") && !dzeriens.equals("nav"));
				
				cena = cenasApr(cena,picVeids,papPied,dzeriens,piegade);
				
				JOptionPane.showMessageDialog(null,"Pasutisana pabeigta!\nCena: "+cena);
				break;
			
			case "2":
				apstkatit(cena,piegade,Klients);
				break;
				
			case "stop":
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Darbiba nepastav!");
			}
		}while(!izvele.equals("stop"));
		
		

	}

}
