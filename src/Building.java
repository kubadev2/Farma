
public class Building
{
    double buyPrice;
    double sellPrice;
    int styCapacity;
    int barnCapacity;
    Farm rand = new Farm();
    int surface;
    public Building(String buildingType)
    {
        switch (buildingType)
        {
            case ("field"):
                this.surface=rand._random()+1;
                break;
            case ("sty"):
                this.styCapacity=rand._random()+1;
                break;
            case ("barn"):
                this.barnCapacity=rand._random()+1;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + buildingType);
        }
    }
}
