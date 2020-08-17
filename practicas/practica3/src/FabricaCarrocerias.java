public class FabricaCarrocerias extends AbstractFactory{
	
	@Override
	public Object getComponente(String tipoComponente){
		return getCarroceria(tipoComponente);
	}

	public Carroceria getCarroceria(String tipoCarroceria){
		if(tipoCarroceria == null){
			return null;
		} else if(tipoCarroceria.equalsIgnoreCase("casual")){
			return new CarroceriaCasual();
		} else if(tipoCarroceria.equalsIgnoreCase("camion")){
			return new CarroceriaCamion();
		} else if(tipoCarroceria.equalsIgnoreCase("deportiva")){
			return new CarroceriaDeportiva();
		}

		return null;
	}	
}