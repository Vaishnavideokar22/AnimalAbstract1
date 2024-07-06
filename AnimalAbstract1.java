abstract class Animal{
    abstract void Sleep();
    abstract void Eat();
}
class Lion extends Animal{
    void Sleep(){
        System.out.println("The Lion Sleeps In The Jungle");
    }
    void Eat(){
        System.out.println("The Lion eats Deer");
    }
} 
class Tiger extends Animal{
    void Sleep(){
        System.out.println("The Tiger Sleeps In The Jungle");
    }
    void Eat(){
        System.out.println("The Tiger Eats Deer");
    }
}
class Deer extends Animal{
    void Sleep(){
        System.out.println("The Deer Sleeps In The Jungle");
    }
    void Eat(){
        System.out.println("The Deer Eats Grass");
    }
}


public class AnimalAbstract1 {
    public static void main(String[] args) {
        
        Lion l1 = new Lion();
        l1.Sleep();
        l1.Eat();

        Tiger t1 = new Tiger();
        t1.Sleep();
        t1.Eat();

        Deer d1 = new Deer();
        d1.Sleep();
        d1.Eat();
        
    }
    
}
