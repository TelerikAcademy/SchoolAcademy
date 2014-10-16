http://en.wikipedia.org/wiki/Tetris
Standard tetris - 16 rows, 10 columns
	color landed[16, 10]


Tetriminos (http://en.wikipedia.org/wiki/Tetris#Colors_of_Tetriminos)
    I ****  (red)
    
    J ***   (blue)
        *
        
    L ***   (orange)
      *
      
    O **    (yellow)
      **
      
    S  **   (magenta)
      **
      
    T ***   (cyan)
      *
      
    Z **    (lime)
       **


Gravity (http://en.wikipedia.org/wiki/Tetris#Gravity)
	Original algorithm (with floating)
	Algorithm with chain reactions


Scoring (http://tetris.wikia.com/wiki/Scoring)
	1 line at once = 100 x level
	2 lines at once = 300 x level
	3 lines at once = 500 x level
	4 lines at once = 800 x level


UI (http://en.wikipedia.org/wiki/ASCII http://www.theasciicode.com.ar/extended-ascii-code/block-graphic-character-ascii-code-219.html)
    ***********************
    *..........*   Next   *
    *..........*    **    *
    *..........*    **    *
    *..........*          *
    *..........*          *
    *..........*  Score:  *
    *..........*  100000  *
    *..........*          *
    *..........*  Level:  *
    *..........*    8     *
    *..........*          *
    *..........* Controls *
    *..........*    ^     *
    *..........*   < >    *
    *..........*    v     *
    *..........*  space   *
    ***********************
	Console.Title = "Tetris";
	Console.WindowWidth = 23;
	Console.BufferWidth = 23;
	Console.WindowHeight = 18;
	Console.BufferHeight = 18;
    Console.OutputEncoding = System.Text.Encoding.GetEncoding(1252);


Sound
    static void PlaySound()
    {
        const int soundLenght = 100;
        Console.Beep(1320, soundLenght * 4);
        Console.Beep(990, soundLenght * 2);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(1188, soundLenght * 2);
        Console.Beep(1320, soundLenght);
        Console.Beep(1188, soundLenght);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(990, soundLenght * 2);
        Console.Beep(880, soundLenght * 4);
        Console.Beep(880, soundLenght * 2);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(1320, soundLenght * 4);
        Console.Beep(1188, soundLenght * 2);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(990, soundLenght * 6);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(1188, soundLenght * 4);
        Console.Beep(1320, soundLenght * 4);
        Console.Beep(1056, soundLenght * 4);
        Console.Beep(880, soundLenght * 4);
        Console.Beep(880, soundLenght * 4);
        Thread.Sleep(soundLenght * 2);
        Console.Beep(1188, soundLenght * 4);
        Console.Beep(1408, soundLenght * 2);
        Console.Beep(1760, soundLenght * 4);
        Console.Beep(1584, soundLenght * 2);
        Console.Beep(1408, soundLenght * 2);
        Console.Beep(1320, soundLenght * 6);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(1320, soundLenght * 4);
        Console.Beep(1188, soundLenght * 2);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(990, soundLenght * 4);
        Console.Beep(990, soundLenght * 2);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(1188, soundLenght * 4);
        Console.Beep(1320, soundLenght * 4);
        Console.Beep(1056, soundLenght * 4);
        Console.Beep(880, soundLenght * 4);
        Console.Beep(880, soundLenght * 4);
        Thread.Sleep(soundLenght * 4);
        Console.Beep(1320, soundLenght * 4);
        Console.Beep(990, soundLenght * 2);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(1188, soundLenght * 2);
        Console.Beep(1320, soundLenght);
        Console.Beep(1188, soundLenght);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(990, soundLenght * 2);
        Console.Beep(880, soundLenght * 4);
        Console.Beep(880, soundLenght * 2);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(1320, soundLenght * 4);
        Console.Beep(1188, soundLenght * 2);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(990, soundLenght * 6);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(1188, soundLenght * 4);
        Console.Beep(1320, soundLenght * 4);
        Console.Beep(1056, soundLenght * 4);
        Console.Beep(880, soundLenght * 4);
        Console.Beep(880, soundLenght * 4);
        Thread.Sleep(soundLenght * 2);
        Console.Beep(1188, soundLenght * 4);
        Console.Beep(1408, soundLenght * 2);
        Console.Beep(1760, soundLenght * 4);
        Console.Beep(1584, soundLenght * 2);
        Console.Beep(1408, soundLenght * 2);
        Console.Beep(1320, soundLenght * 6);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(1320, soundLenght * 4);
        Console.Beep(1188, soundLenght * 2);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(990, soundLenght * 4);
        Console.Beep(990, soundLenght * 2);
        Console.Beep(1056, soundLenght * 2);
        Console.Beep(1188, soundLenght * 4);
        Console.Beep(1320, soundLenght * 4);
        Console.Beep(1056, soundLenght * 4);
        Console.Beep(880, soundLenght * 4);
        Console.Beep(880, soundLenght * 4);
        Thread.Sleep(soundLenght * 4);
        Console.Beep(660, soundLenght * 8);
        Console.Beep(528, soundLenght * 8);
        Console.Beep(594, soundLenght * 8);
        Console.Beep(495, soundLenght * 8);
        Console.Beep(528, soundLenght * 8);
        Console.Beep(440, soundLenght * 8);
        Console.Beep(419, soundLenght * 8);
        Console.Beep(495, soundLenght * 8);
        Console.Beep(660, soundLenght * 8);
        Console.Beep(528, soundLenght * 8);
        Console.Beep(594, soundLenght * 8);
        Console.Beep(495, soundLenght * 8);
        Console.Beep(528, soundLenght * 4);
        Console.Beep(660, soundLenght * 4);
        Console.Beep(880, soundLenght * 8);
        Console.Beep(838, soundLenght * 16);
        Console.Beep(660, soundLenght * 8);
        Console.Beep(528, soundLenght * 8);
        Console.Beep(594, soundLenght * 8);
        Console.Beep(495, soundLenght * 8);
        Console.Beep(528, soundLenght * 8);
        Console.Beep(440, soundLenght * 8);
        Console.Beep(419, soundLenght * 8);
        Console.Beep(495, soundLenght * 8);
        Console.Beep(660, soundLenght * 8);
        Console.Beep(528, soundLenght * 8);
        Console.Beep(594, soundLenght * 8);
        Console.Beep(495, soundLenght * 8);
        Console.Beep(528, soundLenght * 4);
        Console.Beep(660, soundLenght * 4);
        Console.Beep(880, soundLenght * 8);
        Console.Beep(838, soundLenght * 16);
    }

