interface One
{
void methodOne();
}
class Two 
{
public void methodTwo(){
}
}
class Three1 extends Two implements One
{
public void methodOne(){
}
}