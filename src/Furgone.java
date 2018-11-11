
public class Furgone extends VeicoloMotore
{

	private String cCarico;
	
	public Furgone(String marca, String anno, String cilindrata, String cCarico) 
	{
		super.setMarca(marca);
		super.setAnno(anno);
		super.setCilindrata(cilindrata);
		this.cCarico=cCarico;
	}

	@Override
	public String toString() {
		return "Furgone-- " + super.getMarca() + "   " + super.getAnno() + "   " + super.getCilindrata() + 
				"cc   " + cCarico + "Kg";
	}

	

	
}
