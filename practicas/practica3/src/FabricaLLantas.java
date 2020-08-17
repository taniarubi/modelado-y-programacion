public class FabricaLLantas extends AbstractFactory{
	
	@Override
	public Object getComponente(String tipoComponente){
		return getLLanta(tipoComponente);
	}

	public LLanta getLLanta(String tipoLLanta){
		if(tipoLLanta == null){
			return null;
		} else if(tipoLLanta.equalsIgnoreCase("simple")){
			return new LLantaSimple();
		} else if(tipoLLanta.equalsIgnoreCase("deportiva")){
			return new LLantaDeportiva();
		} else if(tipoLLanta.equalsIgnoreCase("offroad")){
			return new LLantaOffroad();
		} else if(tipoLLanta.equalsIgnoreCase("oruga")){
			return new LLantaOruga();
		}
		return null;
	}	
}