public class java21 {
    //复习
    //public class HelloWorld{}
    // public表示可以公开访问；class表示这是一个类；HelloWorld是这个类的名字，每个单词开头字母大写

    //public static void main(){}
    //这是主方法
    //System.out.println()
    //会在控制台输出，println表示打印数据到控制台并输出

    //都有共同状态的一些东西，我们可以设计为 类
    //这些状态叫做 属性；属性命名规则为，小写，如果后面还有单词则后面的单词开头字母大写，如：moveSpeed
    //根据这个类为模板的具体的东西叫做 对象
    //一个对象能做的一些事情就叫做 方法

    //方法
    //无参数无返回类型的方法——void keng(){}
    //无参数有返回类型的方法——
    // float getAmmor(){
    //  return Ammor;
    //  }
    //有参数无返回类型的方法——
    //void recovery(float blood){
    //  hp = hp + blood;
    //  }
    //有的方法不需要返回值就把返回类型改为void

    //8种基本类型
    //整型（4种）：byte short int long
    //字符型（1种）：char     只能放一个字符
    //浮点型（2种）：float double      默认的小数就是double型的
    //布尔型（1种）：boolean       存放的数值的false true
    //String类型 String str = "123321";

    //类型转换
    //类型转换有低精确度向高精确度转换和高向低转换
    //低转高随便转
    //long l = 50;
    //int i = 50;
    //l = i;
    //高转低要强制转
    //byte b = 5;
    //int i = 10;
    //b = (byte)i;
    //整形和整形运算的时候，如果两边的值都小于等于int的，那类型就会变成int型。如：short a =5; short b = 5;a+b是int型

    //命名规则
    //变量命名只能使用字母 数字 $ _
    //变量第一个字符 只能使用 字母 $ _
    //变量第一个字符 不能使用数字
    //注：_ 是下划线，不是-减号或者—— 破折号
    //命名使用完整的单词命名，不要用缩写
    //不能使用关键字，但是可以包含关键字

    //作用域
    //当一个变量被声明在类下面，这个变量就叫属性，其作用域就是从变量声明的位置开始的整个类
    //如果一个类是被声明在方法上的，就叫做参数，其作用域为该方法内所有代码，其他方法不能访问，类也不能访问
    //声明在方法内的变量，叫局部变量，其作用域在声明开始的位置，到整个块结束的位置

    //final
    //当一个变量被final修饰的时候，这个变量只有一次赋值的机会
    //final int i = 5;
    //int i = 10//会出错
    //final int i;
    //i = 10;
    //i = 11;//会出错，因为上面已经赋值过了

    //算术操作符
    // + - * /
    // %取余
    // ++ -- 自增自减
    // i++ 先取值，再运算
    // ++i 先运算，再取值

    //Scanner类
    //import java.util.Scannner;表示导入这个类
    //Scanner s = new Scanner(System.in);
    //int a = s.nextInt();
    //float b = s.nextFloat();
    //String c = s.nextLine();

    //关系操作符
    // > < >= <= == !=

    //逻辑操作符
    //长路与& 和短路与&& 都为真时才为真，一假就假；长路与两侧都会计算，短路与前面错了后面就不计算了
    //长路或| 和短路或|| 都为假时才是假，一真就真；长路或两侧都会计算，短路或前面对了后面就不计算了
    //取反！ 真变假，假变真
    //异或^  不同返回真，相同返回假
    //任何数和自己进行异或 都等于 0
    //任何数和0 进行异或 都等于自己

    //位操作符
    //二进制
    //int i = 5;
    //String b = (Integer.toBinaryString(i));
    //取非~
    //5 的二进制是 00000101
    //所以取非即为 11111010
    //System.out.println(~i);

    //三元操作符
    //表达式?值1:值2
    //如果表达式为真 返回值1
    //如果表达式为假 返回值2

    //if条件语句
    //if(表达式1){
    //  表达式2；
    //}
    //如果表达式1的值是true,
    //就执行表达式2
    //if else
    //else if

    //switch语句
    //switch相当于else if的另一种表达方式
    //switch(day){
    //case 1:
    //case 2:
    //  System.out.println("星期一");
    //  break;
    //case 3:
    //  System.out.println("星期二");
    //  break;
    //default:
    //  System.out.println("这个是什么鬼？");
    //      }

    //while语句
    //while(i<5){
    //            System.out.println(i);
    //            i++;
    //        }
    //条件为true时重复执行
    //
    //do while语句
    //do{
    //            System.out.println(i);
    //            i++;
    //        } while(i<5);
    //条件为true时重复执行，至少执行一次

    //阶乘
    //int fac = 1;
    //while(num > 1){
    //  fac = num * fac;
    //  num--;
    //}

}
