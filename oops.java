public class oops {
    public static void main(String[] args) {
        oops_inherit obj = new oops_inherit();
        obj.display();
        oops_child child = new oops_child();
        child.display();
    }
}

class oops_inherit {
    public void display() {
        System.out.println("inheritence concept");
    }
}

class oops_child extends oops_inherit {
    public void display() {
        System.out.println("inheritence concept");
    }
}

interface oops_interface {
    public void display();
}

class oops_interface_impl implements oops_interface {
    public void display() {
        System.out.println("inheritence concept");
    }
}