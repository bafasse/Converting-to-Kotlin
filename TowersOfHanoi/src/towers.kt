import java.util.Scanner

fun tower(count: Int, src: Char, dest: Char, extra: Char)
{
    if (count != 1)
    {
        tower(count - 1, src  , extra, dest);
		tower(1        , src  , dest , extra);
		tower(count - 1, extra, dest , src);
    }
}

fun main(args: Array<String>)
{
    tower(25, 'A', 'B', 'C')
}