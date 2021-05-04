package com.karan.practice.practice.java8.ececuters;

class TestSomething {

    private TestSomething() {

    }

    static TestSomething something;

    public static TestSomething getInstance() {
        if (something == null)
            something = new TestSomething();
        return something;
    }

}


class Test{
    public static void main(String[] args) {
        System.out.println(TestSomething.getInstance());
    }


}


