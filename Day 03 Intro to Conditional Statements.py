if __name__ == '__main__':
    N = int(input())

    if N%2 != 0 or ((N > 5 and N < 21) and N%2 == 0):
        print("Weird")
    else:
        print("Not Weird")