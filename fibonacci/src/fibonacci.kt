import java.util.Scanner

fun fib(n: Int) :Int
{
    //1. Base Case(s)
	if (n <= 2) return 1;

	//2. Recursive Case(s)
	else
	{
		return fib(n - 1) + fib(n - 2);
	}
}

fun main(args: Array<String>)
{
    val input = Scanner(System.`in`)
    println("Enter number ")
    val num: Int = input.nextInt()
    var x = 10
    val y = fib(num)
    println("The fibonacci sequence of $num is $y ")
}