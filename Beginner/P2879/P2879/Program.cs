using System;

namespace P2879
{
    class Program
    {
        static void Main()
        {
            int testCases = Convert.ToInt32(Console.ReadLine());
            int counter = 0;

            for (int i = 0; i < testCases; i++)
            {
                if (Convert.ToInt32(Console.ReadLine()) != 1)
                    counter++;
            }
            
            Console.WriteLine(counter);
        }
    }
}