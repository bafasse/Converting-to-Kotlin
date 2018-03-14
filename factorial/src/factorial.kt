import java.util.Scanner

fun fact (x: Int): Int
{
    if (x <= 1)
        return 1;
    else
    {
        return x * fact(x - 1);
    }
}
fun main(args: Array<String>)
{
    val a = Scanner(System.`in`)
    println("Type in a number to find the factorial of it: ")
    //var x = 10;

    var integer: Int = a.nextInt();
    var y = fact(integer); // figuring out how to use lambdas
    println("$integer! is equal to $y");
}