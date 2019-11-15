user_input = input()

while user_input != "0 0 0 0":

    split_input = user_input.split()
    moves = 0

    if (split_input[0] == split_input[2]) & (split_input[1] == split_input[3]):
        moves = 0
    elif (split_input[0] == split_input[2]) & (split_input[1] != split_input[3]):
        moves = 1
    elif (split_input[0] != split_input[2]) & (split_input[1] == split_input[3]):
        moves = 1
    elif (split_input[0] != split_input[2]) & (split_input[1] != split_input[3]):
        if abs((int(split_input[0]) - int(split_input[2]))) == abs((int(split_input[1]) - int(split_input[3]))):
            moves = 1
        else:
            moves = 2

    print(moves)

    user_input = input()
