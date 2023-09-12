package com.hspedu.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog dog=new Dog("小黄");
        Cat cat=new Cat("小花");
        Pig pig=new Pig("佩奇");
        Bone bone = new Bone("排骨");
        Fish fish = new Fish("青花鱼");
        Rice rice = new Rice("炒饭");
        tom.feed(dog,bone);
        tom.feed(pig,rice);

        tom.feed(cat,fish);

    }
}

class Food{
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Fish extends Food{
    public Fish(String name) {
        super(name);
    }
}
class Rice extends Food{
    public Rice(String name) {
        super(name);
    }
}
class Bone extends Food{
    public Bone(String name) {
        super(name);
    }

}
class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
}

class Pig extends Animal{
    public Pig(String name) {
        super(name);
    }
}

class Master{
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //使用多态机制，可以统一的管理主人喂食的问题，
    //animal的编译类型是Animal，可以指向/接收 Animail子类的对象。
    //food的编译类型是Food，可以指向/接收 Food子类的对象。
    public void feed(Animal animal,Food food){
        System.out.println("主人"+name+"给"+animal.getName()+"吃"+food.getName());
    }
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人"+name+"给"+dog.getName()+"吃"+bone.getName());
//    }
//    public void feed(Cat cat,Fish fish){
//        System.out.println("主人"+name+"给"+cat.getName()+"吃"+fish.getName());
//    }
    //如果动物很多，事物很多
    //feed方法很多，不利于管理和维护

}