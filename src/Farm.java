import java.util.Random;

public class Farm
{
    double surface;
    double styCapacity;
    double barnCapacity;
    double price;

    int sty;
    int barn;
    int field;

    public int _random()
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);
        return randomNumber+1;
    }
    public Farm ()
    {
        this.sty = _random()+1;
        this.barn = _random()+1;
        this.field = _random()+1;
        Building[] buildings = new Building[this.sty + this.barn + this.field];

        int i = 0;
        for (int j = 0; j < this.sty; j++)
        {
            buildings[j]= new Building("sty");
            i++;
        }
        for (int j = i; j < this.barn; j++)
        {
            buildings[j]=new Building("barn");
            i++;
        }
        for (int j = i; j < this.sty; j++)
        {
            buildings[j]=new Building("field");
            i++;
        }


    }
}
