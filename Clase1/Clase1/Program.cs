using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Clase1
{
    class Program
    {
        static void Main(string[] args)
        {
            //string minombre;
            //Console.WriteLine("Escribe tu nombre puto :3");
            //minombre = Console.ReadLine();
            //Console.WriteLine("Hola {0} Bienvenido a la ute PUTITO", minombre);
            //Console.ReadLine();
            try
            {
                Console.WriteLine("Escriba el prime numero");
                string temp = Console.ReadLine();
                int i = Int32.Parse(temp);
                Console.WriteLine("Escriba el segundo numero");
                temp = Console.ReadLine();
                int j = Int32.Parse(temp);
                int k = i / j;
                Console.WriteLine("La respuesta es: {0}", k);
            }
             catch (Exception e) {
                Console.WriteLine("Excepcion lanzada: {0}", e);
            }
        }
       
    }
}
