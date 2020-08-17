//Armas: arpones, lanzallamas, lanzas, sierra, metralleta
//arpones: 30, 1500
//lanzallamas: 65, 3500
//lanzas: 20, 1000
//sierra: 50, 2500
//metralleta: 100, 5000
public class FabricaArmas extends AbstractFactory{

	@Override
	public Object getComponente(String tipoComponente){
		return getArma(tipoComponente);
	}

	public Arma getArma(String tipoArma){
		if(tipoArma == null){
			return null;
		} else if(tipoArma.equalsIgnoreCase("arpones")){
			return new ArmaArpon();
		} else if(tipoArma.equalsIgnoreCase("lanza llamas")){
			return new ArmaLanzaLlamas();
		} else if(tipoArma.equalsIgnoreCase("lanzas")){
			return new ArmaLanzas();
		}else if(tipoArma.equalsIgnoreCase("sierra")){
			return new ArmaSierra();
		}else if(tipoArma.equalsIgnoreCase("metralleta")){
			return new ArmaMetralleta();
		}
		return null;
		
	}

}