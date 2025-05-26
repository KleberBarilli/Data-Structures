def execute(index):
    arr = [1, 2, 3, 4, 5]
    print(f"Array: {arr}")
    print(f"Accessing index \033[33m{index}\033[0m")
    print(f"Value: \033[32m{arr[index]}\033[0m\n")

    return arr[index]