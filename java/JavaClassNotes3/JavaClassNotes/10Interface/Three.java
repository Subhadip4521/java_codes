interface One
{
public void methodOne();
}

interface Two
{
public void methodTwo();
}

class Three implements One,Two
{
public void methodOne(){
}
public void methodTwo(){
}
}