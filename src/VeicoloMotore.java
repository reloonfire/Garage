
public class VeicoloMotore 
{
	private String marca;
	private String anno;
	private String cilindrata;
	
	
	public String getMarca() 
	{
		return marca;
	}

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	public String getAnno()
	{
		return anno;
	}

	public void setAnno(String anno) 
	{
		this.anno = anno;
	}

	public String getCilindrata() 
	{
		return cilindrata;
	}

	public void setCilindrata(String cilindrata) 
	{
		this.cilindrata = cilindrata;
	}



	@Override
	public String toString() {
		return "VeicoloMotore [marca=" + marca + ", anno=" + anno + ", cilindrata=" + cilindrata + "]";
	}
	
	
}
