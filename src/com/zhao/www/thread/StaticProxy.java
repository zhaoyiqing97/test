package com.zhao.www.thread;

public class StaticProxy {
    public interface HouseSubject{
        public void rentHouse();
    }
    public static class RealHouseSubject implements HouseSubject{
        @Override
        public void rentHouse() {
            System.out.println("我是房主，卖房子");
        }
    }
    public static class HouseProxy implements HouseSubject{
        @Override
        public void rentHouse() {
            //广告
            this.ad();

            //创建房屋主人，让真实主人出租
            RealHouseSubject realHouseSubject = new RealHouseSubject();
            realHouseSubject.rentHouse();

            //卖出房子之后撤销广告
            this.backad();
        }
        private void ad(){
            System.out.println("广告，出租");
        }
        private void backad(){
            System.out.println("房子已经出租，撤销广告");
        }
    }
    public static class User {
        public static void main(String[] args) {
            HouseProxy proxy = new HouseProxy();
            proxy.rentHouse();
        }
    }
}

