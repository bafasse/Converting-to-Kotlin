import java.util.Scanner

fun power(x: Double, n: Int): Double
{
    if (n == 0)
        return 1.0
    else if (n == 1)
        return x
    else if (n % 2 == 0)
    {
        val temp: Double = power(x, n / 2)
        return temp * temp
    }
    else
    {
        val temp: Double = power(x, n / 2)
        return x * temp * temp
    }
}

fun main(args: Array<String>)
{
    val input1 = Scanner(System.`in`)
    val input2 = Scanner(System.`in`)
    println("Enter a number followed but the power ")
    val base: Double = input1.nextDouble()
    val pow: Int = input2.nextInt()
    val x = power(base, pow)
    println("$base raised to the $pow power is: $x")
}