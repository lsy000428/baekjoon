n = input()
rn = ""
o = -1
for i in n :
    rn = rn + n[o]
    o = o-1

if n == rn:
    print(1)
else :
    print(0)

