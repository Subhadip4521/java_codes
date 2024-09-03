/*
Def1: Any service requirement specification (srs) is called an interface.
Example1: Sun people responsible to define JDBC API and database vendor will 
provide implementation for that.

Def2: From the client point of view an interface define the set of services what is 
expecting. From the service provider point of view an interface defines the set of 
services what is offering. Hence an interface is considered as a contract between client 
and service provider.
Example: ATM GUI screen describes the set of services what bank people offering, at 
the same time the same GUI screen the set of services what customer is expecting hence 
this GUI screen acts as a contract between bank and customer.

Def3: Inside interface every method is always abstract whether we are declaring or not 
hence interface is considered as 100% pure abstract class.
Summery def: Any service requirement specification (SRS) or any contract between 
client and service provider or 100% pure abstract classes is considered as an interface.

Note1:
Whenever we are implementing an interface compulsory for every method of that 
interface we should provide implementation otherwise we have to declare class as 
abstract in that case child class is responsible to provide implementation for remaining 
methods.

Note2: 
Whenever we are implementing an interface method compulsory it should be declared 
as public otherwise we will get compile time error.
*/
A class can implements any no. Of interfaces at a time.

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


A class can extend a class and can implement any no. Of interfaces simultaneously.

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


An interface can extend any no. Of interfaces at a time.

interface One
{
void methodOne();
}

interface Two
{
void methodTwo();
}
interface Three extends One,Two
{
}
