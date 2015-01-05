using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using System.Xml.Linq;
using Newtonsoft.Json;

namespace XMLtoJSON
{
    class Program
    {
        static void Main()
        {

            var path = "..\\..\\data.xml";
            if (!(File.Exists(path)))
            {
                GenerateXmlWithData(path);
            }
            var doc = XDocument.Load(path);

            string json = JsonConvert.SerializeXNode(doc,Newtonsoft.Json.Formatting.Indented);

            Console.WriteLine(json);

            XDocument xml = JsonConvert.DeserializeXNode(json);
            Console.WriteLine(xml.ToString());

        }

        static void GenerateXmlWithData(string path)
        {
            var doc = new XDocument();

            int count = 15;

            var usersElement = new XElement("users");

            for (int i = 0; i < count; i++)
			{
                usersElement.Add(new XElement("user",
                    new XAttribute("id", i+1),
                    new XElement("username", "User #" + (i+1)),
                    new XElement("password", "slojna-" + i + "-parola")
                    ));
			}

            usersElement.Add(new XAttribute("last-user-id", count));
            doc.Add(usersElement);

            doc.Save(path);
        }
    }
}
