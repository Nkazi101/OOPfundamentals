class Dog extends Animal {


public Dog(String name){
    super(name);
}

//overriding the abstract methofs of Animal class
@Override
void makeSound(){
System.out.println(getName() + " is barking");
}

@Override
void move(){
System.out.println(getName() + " is running");
}
    
}
