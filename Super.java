//super 
//inheritance can be implemented by extend keyword
class Super {
    public void display() {
        System.out.println("Super class method");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        super.display(); // Call the superclass method
        System.out.println("Sub class method");
    }
}

class DemoSub extends Sub {
    @Override
    public void display() {
        super.display(); // Call the superclass method
        System.out.println("DemoSub class method");
    }

    public static void main(String[] args) {
        DemoSub demo = new DemoSub();
        demo.display();
    }
}