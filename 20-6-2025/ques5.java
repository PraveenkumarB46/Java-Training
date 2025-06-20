//. this and super
class Parent { int x = 10; }
class Child extends Parent {
    int x = 20;
    void show() {
        System.out.println("x = " + this.x);
        System.out.println("Parent x = " + super.x);
    }
}
