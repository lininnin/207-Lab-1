public class Main {
    public static void main(String[] args) {
        //FizzBuzz.getI(5);
        FizzBuzz.main(new String[0]);
    }
}
/*
  问题说明：
  在 Main.main 中写 FizzBuzz.main(); 会出错，因为 Java 的 main 方法有严格的签名：

      public static void main(String[] args)

  所以调用时必须传入一个 String[] 参数。直接写 FizzBuzz.main(); 会提示编译错误。

  正确的做法：
      使用 FizzBuzz.main(new String[0]);
      这表示调用 FizzBuzz 的 main 方法，传入一个空的字符串数组作为参数，符合 main 方法的签名。

  示例代码：

  // FizzBuzz.java
  public class FizzBuzz {
      public static void main(String[] args) {
          for (int i = 1; i <= 15; i++) {
              if (i % 15 == 0) System.out.println("FizzBuzz");
              else if (i % 3 == 0) System.out.println("Fizz");
              else if (i % 5 == 0) System.out.println("Buzz");
              else System.out.println(i);
          }
      }
  }

  // Main.java
  public class Main {
      public static void main(String[] args) {
          FizzBuzz.main(new String[0]);  // 正确调用方式
      }
  }

  小结：
  - 错误写法：FizzBuzz.main();   // 缺少 String[] 参数，编译错误
  - 正确写法：FizzBuzz.main(new String[0]);   // 传入空参数数组，符合 Java 要求

  拓展建议：
  - 如果你希望更灵活调用，可以将 FizzBuzz 的打印逻辑提取到一个非 static 方法中，
    然后由 Main 创建 FizzBuzz 的对象来调用。
*/

