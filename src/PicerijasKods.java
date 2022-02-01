import javax.swing.JOptionPane;

public class PicerijasKods {
	
	public static String[] izvKlientu(String[] Klients) {
		
		Klients[0] = JOptionPane.showInputDialog("Ievadiet vardu");
		Klients[1] = JOptionPane.showInputDialog("Ievadiet telefonu");
		Klients[2] = JOptionPane.showInputDialog("Ievadiet adresi");
		
		return Klients;
	}

	public static void main(String[] args) {
		double cena = 0;
		boolean piegade;
		String[] Klients = new String[3];
		String picVeids;
		String papPied;
		String dzeriens;
		String pagPiegade;
		
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
					papPied = JOptionPane.showInputDialog("Papildus picas piedevas\nExtra siers | Extra merce | Nav");
					papPied = papPied.toLowerCase();
				}while(!papPied.equals("Extra siera") && !papPied.equals("Extra merce") && !papPied.equals("Nav"));
				
				do {
					dzeriens = JOptionPane.showInputDialog("Dzeriens\nKola | Udens | Nav");
					dzeriens = dzeriens.toLowerCase();
				}while(!dzeriens.equals("kola") && !dzeriens.equals("udens") && !dzeriens.equals("nav"));
				
				break;
			
			case "2":
				//apstkatit();
				break;
				
			case "stop":
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Darbiba nepastav!");
			}
		}while(!izvele.equals("stop"));
		
		

	}

}
