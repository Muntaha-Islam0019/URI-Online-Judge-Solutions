test_cases = int(input())

for i in range(0, test_cases):

    summation = 0
    numbers = input()

    led = {
        "0": 6,
        "1": 2,
        "2": 5,
        "3": 5,
        "4": 4,
        "5": 5,
        "6": 6,
        "7": 3,
        "8": 7,
        "9": 6
    }

    for number in numbers:
        summation += led[number]

    print(f"{summation} leds")
