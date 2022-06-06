package com.zhao.www.thread;

public class TestLambda {
    //3.静态内部类
    static class Like2 implements ILike{
        @Override
        public void like() {
            System.out.println("lambda like 2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.like();

        like = new Like2();
        like.like();

        //4.局部内部类
        class Like3 implements ILike{
            @Override
            public void like() {
                System.out.println("lambda like 3");
            }
        }

        like = new Like3();
        like.like();

        //5.匿名内部类
        like = new ILike() {
            @Override
            public void like() {
                System.out.println("lambda like 4");
            }
        };
        like.like();

        //6.lambda表达式
        like = ()->{System.out.println("lambda like 5");};
        like.like();
    }

}
//1.定义函数式接口:只包含一个方法的接口
interface ILike{
    void like();
}

//2.实现类
class Like implements ILike{
    @Override
    public void like(){
        System.out.println("i like lambda");
    }
}