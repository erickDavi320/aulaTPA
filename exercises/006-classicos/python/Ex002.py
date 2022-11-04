from sys import stdin, stdout

ages = [int(stdin.readline()) for _ in range(15)]
cont = [0]*5

for age in ages:
    if age <= 15:
        cont[0] += 1
    elif age <= 30:
        cont[1] += 1
    elif age <= 45:
        cont[2] += 1
    elif age <= 60:
        cont[3] += 1
    else:
        cont[4] += 1
else:
    j = 1
    for i in cont:
        res = (i * 100) / 15
        stdout.write(f'{j}ª FAIXA ETARIA COM {i} pessoas.\n')
        stdout.write(f'REPRESENTA {res:.1f}% do total.\n\n')
        j += 1
