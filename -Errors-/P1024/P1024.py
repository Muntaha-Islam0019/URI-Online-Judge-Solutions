test_cases = int(input())

for i in range(test_cases):
    text = input()
    new_text = ''

    for l in text:
        if l.isalpha():
            new_text += chr(ord(l) + 3)
        else:
            new_text += l

    new_text = new_text[::-1]
    half = int((len(new_text) / 2))
    first_part = new_text[0:half]
    second_part = new_text[half:]
    third_part = ''

    for l in second_part:
        third_part += chr(ord(l) - 1)

    encrypted_text = first_part + third_part

    print(encrypted_text)
