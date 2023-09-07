import java.util.Scanner;
public class ArrayTest {
    //直接可以使用模版
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //自动分配变量名  .var
        Scanner scanner = new Scanner(System.in);
        MyTools myTools = new MyTools();

        MyTools mt = new MyTools();
        int[] arr = {10, -1, 8, 0, -34};
        mt.bubble(arr);//找到方法 command+B
        System.out.println("排序后的arr");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        //在idea 当我们run一个文件时，会先编译成。class文件

    }
}
class MyTools{
    int temp = 0;
    public void bubble(int[] arr){
        for(int i = 0 ; i<arr.length-1;i++){//外层循环次数arr.length-1

            for(int j = 0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
        }
    }
}
class Person{//查看层级关系 contol+H
    //生成构造器，command + N
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }
}
