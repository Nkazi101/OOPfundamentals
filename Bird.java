class Bird extends Animal implements Flyable {

    public Bird(String name){
        super(name);
    }

    @Override
void makeSound(){
System.out.println(getName() + " is chirping");
}

@Override
void move(){
System.out.println(getName() + "is flying");
}

@Override
public void fly(){
System.out.println(getName() + " flies");
}
    
}
