test_cases = int(input())

for i in range(0, test_cases):

    number_of_shots = int(input())
    movements = []
    hits = 0

    shots = input()
    heights = shots.split()

    moves = input()
    for movement in moves:
        movements.append(movement)

    index = 0
    for k in range(0, number_of_shots):

        if (int(heights[index]) < 3) & (movements[index] == "S"):
            hits += 1
        elif (int(heights[index]) > 2) & (movements[index] == "J"):
            hits += 1

        index += 1

    print(hits)
