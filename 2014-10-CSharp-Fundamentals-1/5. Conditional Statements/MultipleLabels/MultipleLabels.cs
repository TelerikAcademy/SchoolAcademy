using System;

class MultipleLabels
{
    static void Main()
    {
        Console.Write("Please enter some animal: ");
        string animal = Console.ReadLine();

        switch (animal)
        {
            case "dog":
            case "cat":
            case "cow":
                Console.WriteLine("MAMMAL");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                Console.WriteLine("REPTILE");
                break;
            case "hawk":
            case "sparrow":
            case "dove":
                Console.WriteLine("BIRD");
                break;
            default:
                Console.WriteLine("I don't know this animal!");
                break;
        }
    }
}
