//abstraction
abstract class Animal {

    //instance variable(attribute)
    private String name;

     //Constructor
    public Animal(String name) {
        this.name = name;
    }

    //public methods to access private attributes
    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //abstract methods
    abstract void makeSound();
    abstract void move();

    
   
    


   
}