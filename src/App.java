//class Abstract ada 
//Inheritance untuk tugas pbo
//Encapsulation
//Overriding 
//Overloading

abstract class peminjaman{
    void denda(){}
    void pengembalian(){}
}

class PBO extends peminjaman{
    //decorator
    @Override
    void denda(){

    }
}

class Parent{
    //modifier
    public int x;

    void print(String tipeAnggota, int bayar){
        System.out.println("Print Parent");
    }

    void print(String tipeAnggota){
        System.out.println("Print Parent");
    }

    void print(){
        System.out.println("Print 2");
    }
}

class A extends Parent{

    
    void print(){
System.out.println("Print A");
    }

    void test(){
        print();
        x = 5;
    }
}

class B extends A{
    void test2(){
        print();
    }
}

public class App extends Parent{

public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        parent.print();
        parent.print("mahasiswa");

        A a = new A();
        a.print();

        
    }
}