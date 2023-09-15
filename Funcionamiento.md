# MetodoPlantilla

La caracteristica de este patron de diseño es que la clase padre es la que se encarga de proporcionar un esqueleto o una plantilla en un algoritmo, permitiendo que las subclases son las que proporcionen los detalles concretos de algunos o todos los pasos de dicho algoritmo.
Lo interesante de este patrón es que también da la opción a las subclases de redefinir los pasos de acuerdo con sus necesidades, sin cambiar la estructura de la clase padre.

Estructura Uml Este patrón de diseño se compone de dos clases principales que son, la abstract templete y las clases concretas.
Donde la clase abstract templete es la clase padre que contiene las operaciones que definen los pasos para llevar a cabo la ejecución del algoritmo.
Las clases concretas implementan los métodos abstractos proporcionando una implementación especifica de dicho método.
Client. Que es el que acciona la ejecución del templete

Como ejemplo implemente para la ejecución del patron de diseño templete method 
Por medio de mi clase abstracta Pizza y dos subclases las cuales son pizzaHawaiana y pizzaPepperoni 

Donde la clase abstracta Pizza en la clase padre donde se define la estructura general de la pizza las cuales son 
prepararMasa, aggSalsa, agg ingredientes, hornearPizza

donde tiene los métodos concretos ya definidos
que son preparar masa, agregar salsa, hornearPizza
estas son las que van a heredar de la clase padre 
mientras que el método abstracto 
agregar ingredientes va ser implementado y sobreescrito para definir las características que las diferencian

en la clase pizzaHawaiana se sobreescribe el método y se imprime que se le agrega el jamo la piña y el queso

mientras que en la clase pizzapepperoni solo se agrega pepperoni y queso
ese es el método que los diferencian

y en el client se crea una pizzahawaiana y una pizzapepperoni
y aquí se hace la preparación de la pizza donde primero se crea una pizzahawaiana, se crea el método de la pizzahawaiana, y se prepara a pizza, lo que es la estructura general donde no se puede modificar 

igual con la pizza pepperoni se llama el método que lo diferencia 
y al momento de imprimir podemos observar que allí se prepara la pizza hawaiana 
donde se prepara la masa 
se agrega la salsa y hornear la pizza y aquí se agrega los ingredientes y esto es en lo que diferenciaba la una de la otra 




public final void: indica que una variable es de tipo constante: no admitirá cambios después de su declaración y asignación de valor. 

protected void: se usa un nivel de acceso intermedio que no es ni public ni private, sino algo intermedio que se denomina como “acceso protegido”, expresado con la palabra clave protected, que significa que las subclases sí pueden tener acceso al campo o método.

