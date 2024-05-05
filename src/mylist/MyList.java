package mylist;

public class MyList {

    public static void main(String[] args) {
        List a,b;
        
        a = new List(5);
        a.addRear(10);
        a.display();
        
        a.addRear(20);
        a.display();
        
        a.addRear(30);
        a.display();
        
        a.addRear(40);
        a.display();
        
        a.addFront(50);
        a.display();
        
        a.modus();
        System.out.println("Modus : "+a.modus());
        System.out.println(" ");
        
        a.reverse();
        a.display();
        
        a.delete(30);
        a.display();
        
//        b = new List(5,100);
//        b.display();
    }
}
