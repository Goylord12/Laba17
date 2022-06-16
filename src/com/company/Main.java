package com.company;

public class Main {

    // Необходимо реализовать паттерн фабрика для логистической компании. Перевозки могут быть по дороге (класс грузовики),
    //по морю (класс суда), по воздуху (класс самолет). Объекты этих классов должен создавать фабричный метод.

    public static void main(String[] args) {
        IDeliveryFactory kkk = new AirFactory();
        IDeliveryFactory zzz = new SeaFactory();
        IDeliveryFactory bbpe = new RoadFactory();

        IDeliveryMethod train = kkk.createTransport();
        IDeliveryMethod sudno = zzz.createTransport();
        IDeliveryMethod avto = bbpe.createTransport();

        train.getInfo();
        sudno.getInfo();
        avto.getInfo();
    }
}

abstract class IDeliveryFactory{
    public abstract IDeliveryMethod createTransport();
}

class SeaFactory extends IDeliveryFactory{
    public sudno createTransport() {
        return new sudno();
    }
}

class RoadFactory extends IDeliveryFactory{
    public avto createTransport() {
        return new avto();
    }
}

class AirFactory extends IDeliveryFactory {
    public Airplane createTransport() {
        return new Airplane();
    }
}

abstract class IDeliveryMethod{
    public abstract void getInfo();
}

class sudno extends IDeliveryMethod{

    @Override
    public void getInfo() {
        System.out.println("Перевезка на судне");
    }
}

class Airplane extends IDeliveryMethod{

    @Override
    public void getInfo() {
        System.out.println("Перевозка на самолете");
    }
}

class avto extends IDeliveryMethod{

    @Override
    public void getInfo() {
        System.out.println("Перевозка на машине");
    }
}