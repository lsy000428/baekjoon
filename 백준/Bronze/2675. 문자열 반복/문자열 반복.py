n = int(input())
for _ in range(n) :
    a, a2= input().split()
    a = int(a)
    for i in range(len(a2)) :
        print(a*a2[i], end="")
    print()  # 줄넘김
        
    
