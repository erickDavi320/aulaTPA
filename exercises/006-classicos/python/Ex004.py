from sys import stdin, stdout


def main():
    number = int(stdin.readline())
    stdout.write(f'{[fibonacci_of(n) for n in range(number)]}')


def fibonacci_of(n):
    if n in {0, 1}:
        return n
    return fibonacci_of(n - 1) + fibonacci_of(n - 2)


if __name__ == "__main__":
    main()
