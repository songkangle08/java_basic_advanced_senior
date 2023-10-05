/**
 * ClassName：Comment,
 * Package: PACKAGE_NAME,
 * Desc:,
 *
 * @Create: 2023/10/5 17:41,
 * @Author: skl,
 */

/*

1. java中的注释的种类：
单行注释  多行注释   文档注释（java特有）

2. 单行注释，多行注释的作用：
   1. 多程序中的代进行解释说明
   2. 对程序进行调试

3. 注意：
   1. 单行注释和多行注释中声明的信息，不参与编译。换句话说，编译后的字节码文件中不包含单行注释和多行注释中的信息
   2. 多行注释不能嵌套使用

4. 文档注释
文档注释内容可以被jdk提供的工具javadoc所解析，生成一套以网页文件形式体现的改程序的说明文档
javadoc -d mydoc -author -version 文件名.java
* */

/**
 这是我的第一个java程序。
 @author skl
 @version 1.0
*/
public class Comment {
    public static void main(String[] args){
        // 单行注释

        /*
           多行注释
        */

        /*
        * 文档注释
        *
        * */
    }
}
