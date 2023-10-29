package ACMCoder;

public class MyClass {

//    // 这是静态方法。
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    // 如果是非静态方法，要new一个对象给它实例化了才行
//
//    public static void main(String[] args) {
//        int result = add(5, 3); // 调用静态方法
//        System.out.println("结果是: " + result);
//    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(); // 创建一个 MyClass 实例
        int result = myClass.add(5, 3); // 使用实例调用非静态方法
        System.out.println("结果是: " + result);
    }
}
