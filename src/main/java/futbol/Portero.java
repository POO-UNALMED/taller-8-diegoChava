package futbol;

public class Portero extends Futbolista {

	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}


	public short getGolesRecibidos() {
		return golesRecibidos;
	}


	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}


	public byte getDorsal() {
		return dorsal;
	}


	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}


	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos;
		
	}
	public int compareTo(Portero p) {
		int diffGol = 0;
		if (this.getGolesRecibidos()>=p.getGolesRecibidos()) {
			diffGol = this.getGolesRecibidos()-p.getGolesRecibidos();
		}
		else {
			diffGol = p.getGolesRecibidos()-this.getGolesRecibidos();
		}
		return diffGol;
	}
	
}
