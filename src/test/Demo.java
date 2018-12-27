package test;

class A {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }

}

class B extends A{
    public String show(B obj){
        return ("B and B");
    }

    public String show(A obj){
        return ("B and A");
    }
}

class C extends B{

}

class D extends B{

}
//4
//我们知道  向上转型之后 a2原本在B类中定义的方法都没有了  其实a2所能够调用的只有A类中的方法 
//我们现在知道的优先级系数是this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
//所以我们的对象先找本类中的传入b的方法  虽然有  但是无法调用   再去自己的超类中找  该方法没有
//接着再去找传入自己的超类的参数的方法  该方法就是show(A obj)   所以输出B and A
public class Demo {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
    }
}
