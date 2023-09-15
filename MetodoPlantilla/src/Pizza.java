public abstract class Pizza {

    //Metodo abstracto que define la estructura general de la pizza
    public final void prepararPizza(){
        prepararMasa();
        agregarSalsa();
        agregarIngredientes();
        hornearPizza();
    }

    //Metodos concretos que iran sobreescritos por las subclases
    protected void prepararMasa(){
        System.out.println("Preparando masa...");
    }
    protected void agregarSalsa(){
        System.out.println("Agregando salsa...");
    }

    //Metodo abstracto que debe ser implementado por las subclases
    protected abstract void agregarIngredientes();

    protected void hornearPizza(){
        System.out.println("Horneando pizza...");
    }

}
