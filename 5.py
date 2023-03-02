nam = int(input("Введите номер урока: "))
fleng1 = 8
fleng2 = 30
nleng2 = fleng2 + nam * 45 + (nam-1)*10
nleng1 = nleng2 // 60
nleng2 -= nleng1 * 60 
nleng1 += fleng1  
print(nleng1, "-", nleng2,sep="")