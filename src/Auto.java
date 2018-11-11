
public class Auto extends VeicoloMotore
{
	enum Alimentazione {Diesel,Benzina};
	
	private String nPorte;
	private Alimentazione alimentazione;
	
	public Auto(String marca, String anno, String cilindrata, String nPorte, Alimentazione alimentazione)
	{
		super.setMarca(marca);
		super.setAnno(anno);
		super.setCilindrata(cilindrata);
		this.nPorte=nPorte;
		this.alimentazione=alimentazione;
	}

	@Override
	public String toString() {
		return "Auto-- " + super.getMarca() + "   " + super.getAnno() + "   " + super.getCilindrata() + 
				"cc   " + nPorte + " porte   " + alimentazione;
	}
	
	
}
