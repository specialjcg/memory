package memory;

public class Carte 
{
	/*membres*/
	private int val;
	private int info;

	
	/*CST*/
	public Carte()
	{
		val=0;
	}
	
	public Carte(int v) 
	{
		this.val=v;
		//this.info=0;		// Valeur info : 0=> cach� 1> revel� 2=> trouv�
	}
	
	/*METHODES*/
	public int getVal() 
	{
		return val;
	}
	
	public int getInfo()
	{
		return info;
	}

	public void setVal(int val)
	{
		this.val = val;
	}

	public void setInfo(int info)
	{
		this.info = info;
	}
	
	public String reveleCarte(){
		if (this.info == 0){
			
			return "*";
		}
		else {
			Integer temp = this.getVal();
			return temp.toString();
		}
	}

}
