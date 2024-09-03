interface Left
{
public void methodOne();
}
interface Right
{
public void methodOne(int i);
}
class Test1 implements Left,Right
{
public void methodOne()
{
}
public void methodOne(int i)
{
}
}