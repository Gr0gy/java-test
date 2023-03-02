t= int( input("Число секунд: "))
sec = t % 60
men = (t-sec)//60
chas = men//60
men -= chas * 60 
print(chas, "ч.", men, "мин.", sec, "с")