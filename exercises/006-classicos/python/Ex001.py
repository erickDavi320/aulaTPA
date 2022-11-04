from sys import stdout
for i in range(1, 11):
    stdout.write(f'\nTABUADA DO {i}:\n')
    for j in range(1, 11):
        stdout.write(f'{i} x {j} = {i*j}\n')
