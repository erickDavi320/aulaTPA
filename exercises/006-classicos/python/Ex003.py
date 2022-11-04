from sys import stdin, stdout

number = int(stdin.readline())

for i in range(2, number):
    if number % i == 0:
        stdout.write(f'{number} não é primo\n')
        break
else:
    stdout.write(f'{number} é primo')
