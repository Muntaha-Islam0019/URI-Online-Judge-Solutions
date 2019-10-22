using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P1164
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = Convert.ToInt32(Console.ReadLine());

            while (N > 0)
            {
                int X = Convert.ToInt32(Console.ReadLine());
                int sum = 0;

                for (int count = 1; count < X; count++)
                {
                    if (X % count == 0)
                    {
                        sum += count;
                    }
                }

                if (sum == X)
                {
                    Console.WriteLine("{0} eh perfeito", X);
                } else
                {
                    Console.WriteLine("{0} nao eh perfeito", X);
                }

                N--;
            }
        }
    }
}
