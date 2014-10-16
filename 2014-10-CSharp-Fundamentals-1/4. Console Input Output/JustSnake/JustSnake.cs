using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;

class JustSnake
{
    struct Position
    {
        public int X, Y;
        public Position(int x, int y)
        {
            this.X = x;
            this.Y = y;
        }
    }

    static void Main(string[] args)
    {
        // List with snake elements
        Queue<Position> snakeElements = new Queue<Position>();

        // Random generator for snake food
        Random randomGenerator = new Random();

        // The snake speed
        double sleepTime = 100;

        // Available move directions
        Position[] moveDirections = new Position[]
        {
            new Position(1, 0), // Right
            new Position(0, 1), // Down
            new Position(-1, 0), // Left
            new Position(0, -1), // Up
        };

        // Current direction
        int currentDirection = 0; // 0 = right, 1 = down, 2 = left, 3 = up
            
        // Console settings
        Console.CursorVisible = false;
        Console.BufferHeight = Console.WindowHeight;

        // First snake and screen initialize
        Position food = new Position(
            randomGenerator.Next(1, Console.WindowWidth - 1),
            randomGenerator.Next(1, Console.WindowHeight - 1));
        for (int i = 0; i <= 6; i++)
        {
            snakeElements.Enqueue(new Position(i, 0));
        }
        foreach (var item in snakeElements)
        {
            Console.SetCursorPosition(item.X, item.Y);
            Console.ForegroundColor = ConsoleColor.DarkGray;
            Console.Write("*");
        }
        Position snakeHead = snakeElements.Last();
        Console.SetCursorPosition(snakeHead.X, snakeHead.Y);
        Console.ForegroundColor = ConsoleColor.Gray;
        Console.Write("@");

        while (true)
        {
            // Read user key
            if (Console.KeyAvailable)
            {
                ConsoleKeyInfo pressedKey = Console.ReadKey();
                if (pressedKey.Key == ConsoleKey.RightArrow)
                    if (currentDirection != 2) currentDirection = 0;
                if (pressedKey.Key == ConsoleKey.DownArrow)
                    if (currentDirection != 3) currentDirection = 1;
                if (pressedKey.Key == ConsoleKey.LeftArrow)
                    if (currentDirection != 0) currentDirection = 2;
                if (pressedKey.Key == ConsoleKey.UpArrow)
                    if (currentDirection != 1) currentDirection = 3;
            }

            // Write snake food
            Console.SetCursorPosition(food.X, food.Y);
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.Write("+");

            // Previous snake head
            Position prevSnakeHead = snakeElements.Last();

            // New snake head
            Position newSnakeHead = new Position(
                prevSnakeHead.X + moveDirections[currentDirection].X,
                prevSnakeHead.Y + moveDirections[currentDirection].Y);

            // Check constraints
            if (newSnakeHead.X >= Console.WindowWidth ||
                newSnakeHead.X < 0 ||
                newSnakeHead.Y >= Console.WindowHeight ||
                newSnakeHead.Y < 0 ||
                snakeElements.Contains(newSnakeHead))
            {
                // Game is over
                Console.SetCursorPosition(0, 0);
                Console.ForegroundColor = ConsoleColor.Gray;
                Console.WriteLine("Game over!!! Your points: {0}", snakeElements.Count);
                return;
            }

            // Write new snake head
            Console.SetCursorPosition(prevSnakeHead.X, prevSnakeHead.Y);
            Console.ForegroundColor = ConsoleColor.DarkGray;
            Console.Write("*");

            // Add new snake element and draw it on the console
            snakeElements.Enqueue(newSnakeHead);
            Console.SetCursorPosition(newSnakeHead.X, newSnakeHead.Y);
            Console.ForegroundColor = ConsoleColor.Gray;
            Console.Write("@");

            // Check if the snake is on food
            if (newSnakeHead.X == food.X && newSnakeHead.Y == food.Y)
            {
                // Feed the snake (the snake is eating)
                food = new Position(
                    randomGenerator.Next(1, Console.WindowWidth - 1),
                    randomGenerator.Next(1, Console.WindowHeight - 1));
                Console.SetCursorPosition(food.X, food.Y);
                Console.ForegroundColor = ConsoleColor.Yellow;
                Console.Write("+");
            }
            else
            {
                // Remove last snake element (the snake is moving)
                Position p = snakeElements.Dequeue();
                Console.SetCursorPosition(p.X, p.Y);
                Console.ForegroundColor = ConsoleColor.DarkGray;
                Console.Write(" ");
            }

            // Slow the motion
            Thread.Sleep((int)sleepTime);

            // Change the speed
            sleepTime -= 0.05;
        }
    }
}
