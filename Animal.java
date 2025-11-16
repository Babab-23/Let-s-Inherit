class Animal{
    void eat(){
        System.out.println("eating..Animal class..eat method");
    }

}
//child class
class lion extends Animal{
    void roar(){
        System.out.println("Roar..Lion class..roar method");
    }

}
//child of child
class Babylion extends lion{
    void weep(){
        System.out.println("weeping..Babylion class..weeping method");

    }

}
class Main{
    public static void main(String args[]){
    Babylion obj=new Babylion();//object of child of child class
    obj.weep();
    obj.roar();
    obj.eat();
    }
}