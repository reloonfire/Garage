
public class Moto extends VeicoloMotore
{
	private String tMotore; //perché non posso fare un enum con i numeri???
	
	public Moto(String marca, String anno, String cilindrata, String tMotore)
	{
		super.setMarca(marca);
		super.setAnno(anno);
		super.setCilindrata(cilindrata);
		this.tMotore=tMotore;
	}

	@Override
	public String toString() {
		return "Moto-- " + super.getMarca() + "   " + super.getAnno() + "   " + super.getCilindrata() + 
				"cc   " + tMotore + " tempi";
	}
	
	
}
