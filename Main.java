public class Main {

    public static void main(String[] args){

    Dog d1  = new Dog("Rotweiller");   
    Bird bird1 = new Bird("Pigeon");
    // Dog rotweiller = new Dog("Rotweiller");

    bird1.makeSound();
    d1.move();

    bird1.fly();


   printSound(d1, bird1);
   printSound(d1);
   printSound(bird1);


    }


    //overloading example
    public static void printSound(Animal animal){

        animal.makeSound();
    }

     public static void printSound(Animal animal, Animal animal2){

        animal.makeSound();
        animal2.makeSound();
     }



    }
    

