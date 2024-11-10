def main():
    nums = [3, 8, 5, 2]
    res = 0
    
    for x in nums:
        if x > res:
            res = x
    
    print(res)

if __name__ == "__main__":
    main()