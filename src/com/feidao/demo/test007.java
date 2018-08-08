package com.feidao.demo;

class A007{
    public static class B{
        int v1;
        static int v2;

        public static class C1{
            static int v3;
            int v4;
        }
    }
}

public class test007 {
    public void test(){
        A007.B b = new A007.B();
        A007.B.C1 c = new A007.B.C1();

        b.v1 = 1;
        b.v2 = 1;
        A007.B.v2 = 1;
        A007.B.C1.v3 = 1;
    }
}


class Anew{
    public void method(){
        class B{
            int v1;
            int v2;

            class C{
                int v3;
            }
        }
        B b = new B();
        B.C c = b.new C();
    }
}