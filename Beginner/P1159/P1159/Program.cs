using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P1159
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                int i = Convert.ToInt32(Console.ReadLine());

                if (i == 0)
                {
                    break;
                }

                int sum = 0;

                for (int count = 1; count <= 5; count++)
                {
                    if (i % 2 == 0)
                    {
                        sum += i;
                        i += 2;
                    } else
                    {
                        sum += (i+1);
                        i += 3;
                    }
                }

                Console.WriteLine(sum);
            }
        }
    }
}
