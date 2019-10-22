test_cases = int(input())

for i in range(test_cases):
    text = input()

    for j in range(0, len(text)):
        if text[j].isalpha():
            text[j] = chr(ord(text[j]) + 3)

    text = text[::-1]
    half = int((len(text) / 2))
    first_part = text[0:half]
    second_part = text[half:]

    for k in range(0, len(second_part)):
        second_part[k] = chr(ord(second_part[k]) - 1)

    encrypted_text = first_part + second_part

    print(encrypted_text)
