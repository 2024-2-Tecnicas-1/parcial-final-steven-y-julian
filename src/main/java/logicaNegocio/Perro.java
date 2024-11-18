package logicaNegocio;

public class Perro extends Animal implements Domestico{
    
    protected TipoHabitat habitat;

    public Perro() {
         this.habitat = TipoHabitat.TERRESTRE;
    }


    @Override
    public String emitirSonido() {
        return "Ladrido";
    }


    @Override
    public String obtenerDieta() {
        return "Omnivoro";
    }

    @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }
    
    @Override
    public String interactuarConHumano(){
        return "El perro mueve la cola y ladra de felicidad";
    }
    

}
