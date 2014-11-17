using System;
using System.IO;

class ExtractingSubstrings
{
    static string ExtractExtension(string fileName)
    {
        string extension = "";
        int dotIndex = fileName.LastIndexOf('.');
        if (dotIndex != -1)
        {
            extension = fileName.Substring(dotIndex + 1);
        }
        return extension;
    }

    static string ExtractFileName(string path)
    {
        char dirSlash = Path.DirectorySeparatorChar;
        int slashIndex = path.LastIndexOf(dirSlash);
        string fileName = path.Substring(slashIndex + 1);
        return fileName;
    }

    static string ExtractPath(string fullFileName)
    {
        char dirSlash = Path.DirectorySeparatorChar;
        int slashIndex = fullFileName.LastIndexOf(dirSlash);
        string path = "";
        if (slashIndex != -1)
        {
            path = fullFileName.Substring(0, slashIndex);
        }
        return path;
    }

    static void Main()
    {
        string fileName = @"C:\Pics\Rila2005.jpg";
        Console.WriteLine("Full file name: {0}", fileName);

        string pathOnly = ExtractPath(fileName);
        Console.WriteLine("Path: {0}", pathOnly);

        string fileNameOnly = ExtractFileName(fileName);
        Console.WriteLine("File name only: {0}", fileNameOnly);

        string extension = ExtractExtension(fileName);
        Console.WriteLine("File extenson: {0}", extension);
    }
}
