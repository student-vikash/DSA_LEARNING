package package1;

 abstract class Vehicle {
    public abstract int getNoOfWheel();
}
class Bus extends Vehicle
{

    @Override
    public int getNoOfWheel() {
        return 6;
    }
}
class Auto extends Vehicle
{
    public int getNoOfWheel()
    {
        return 3;
    }
}
class Toto extends Vehicle
{
    public int getNoOfWheel()
    {
        return 4;
    }
}


