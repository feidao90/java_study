package com.feidao.demo;

class Outer{
    public class InnerTools{    //内部类
        public int add(int a, int b){
            return a+b;
        }
    }

    private InnerTools tool = new InnerTools();

    public void add(int a, int b,int c){
        tool.add(tool.add(a,b),c);
    }
}


public class test {
    public static void main(String args[]){
        Outer o = new Outer();
        o.add(1,2,3);
        Outer.InnerTools tool = new Outer().new InnerTools();
    }
}

class A{
    public static class B{
        int v;
    }
}

class Tester{
    public void test(){
        A.B b = new A.B();
        b.v = 1;
    }
}

class A1{
    private int a1;
    private static int a2;

    public static class B1{
        int b2 = a2;
        int b3 = new A1().a1;
    }
}

class A2{
    public static class B{
        int v1;
        static int v2;

        public static class C{
            static int v3;

            private int  test006(){
                return v3 + 1;
            }
            public static void test007(){
                C a = new  A2.B.C();
                a.test006();
            }
        }
    }
}