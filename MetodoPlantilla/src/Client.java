
public class Client {
    public static void main(String[] args) {
        //Crear una pizza hawaiana y una pizza pepperoni
        Pizza pizzaHawaiana = new PizzaHawaiana();
        Pizza pizzaPepperoni = new PizzaPepperoni();

        //Preparar las pizzas
        System.out.println("Preparando Pizza Hawaiana...");
        pizzaHawaiana.prepararPizza();

        System.out.println("Preparando Pizza Pepperoni...");
        pizzaPepperoni.prepararPizza();
    }
}