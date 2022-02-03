import javax.swing.JOptionPane;

public class PicerijasKods {
	
	public static String[] izvKlientu(String[] Klients) {
		
		Klients[0] = JOptionPane.showInputDialog("Ievadiet vardu");
		Klients[1] = JOptionPane.showInputDialog("Ievadiet telefonu");
		Klients[2] = JOptionPane.showInputDialog("Ievadiet adresi");
		Klients[3] = JOptionPane.showInputDialog("Ievadiet Vecumu");
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
		JOptionPane.showMessageDialog(null,"PASUTITAJS\nVards: "+Klients[0]+"\nTalrunis: "+Klients[1]+"\nAdrese: "+Klients[2]+"\nVecums: "+Klients[3]+"\nPASUTIJUMS\nPiegade: "+piegade+"\nCena:"+cena);
	}

	public static void main(String[] args) {
		double cena = 0;
		boolean piegade = false;
		String[] Klients = new String[4];
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
					picVeids = JOptionPane.showInputDialog("Picas veids\nSiera | 1-Studentu | 2-Hawaju | 3-Meksikanu | 4-BBQ");
					picVeids = picVeids.toLowerCase();
				}while(!picVeids.equals("siera") && !picVeids.equals("1") && !picVeids.equals("2") && !picVeids.equals("3") && !picVeids.equals("4"));
				
				do {
					papPied = JOptionPane.showInputDialog("Papildus picas piedevas\n1-Extra siers | 2-Extra merce | 3-Nav");
					papPied = papPied.toLowerCase();
				}while(!papPied.equals("1") && !papPied.equals("2") && !papPied.equals("3"));
				
				do {
					dzeriens = JOptionPane.showInputDialog("Dzeriens\n 1-Kola | 2-Udens | 3-Fanta");
					dzeriens = dzeriens.toLowerCase();
				}while(!dzeriens.equals("1") && !dzeriens.equals("2") && !dzeriens.equals("3"));
				
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
