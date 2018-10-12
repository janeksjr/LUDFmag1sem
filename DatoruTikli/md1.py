import numpy as np
import matplotlib.pyplot as plt
from matplotlib.pyplot import style

style.use('dark_background')

########### A #################
# 01010100
telpa=np.arange(0,1,0.0001)
xs=np.array([])
for i in range(len(telpa)):
    if i<1250:
        xs=np.append(xs,0)
    elif i<2500:
        xs=np.append(xs,1)
    elif i<5000:
        xs=np.append(xs,0)
    elif i<8750:
        xs=np.append(xs,1)
    else:
        xs=np.append(xs,0)
Is=np.array([])
Qs=np.array([])
for i in range(len(telpa)):
    if i<2500:
        Is=np.append(Is,-1)
        Qs=np.append(Qs,1)
    elif i<5000:
        Is=np.append(Is,-1)
        Qs=np.append(Qs,-1)
    elif i<7500:
        Is=np.append(Is,1)
        Qs=np.append(Qs,1)
    else:
        Is=np.append(Is,1)
        Qs=np.append(Qs,-1)


plt.plot(telpa, xs)
#Do a fourier transform

a=np.fft.fft(xs)

an=np.array(np.real(a[1:10]/5000))
bn=np.array(np.imag(a[1:10]/5000))
summa=np.zeros(10000)
for i in range(len(an)):
    #plt.plot(telpa, an[i]*np.cos(2*np.pi*(i+1)*telpa)+bn[i]*np.sin(2*np.pi*(i+1)*telpa))
    summa=summa+an[i]*np.cos(2*np.pi*(i+1)*telpa)-bn[i]*np.sin(2*np.pi*(i+1)*telpa)

plt.plot(telpa,summa+0.5)
plt.show()

for i in range(len(an)):
    print(','.join(str(a[i]) for i in range(len(an))))


print(an)
print(bn)


plt.plot(np.sqrt(np.real(a[0:10])**2+np.imag(a[0:10])**2),linewidth=0, marker='*')
plt.show()

######### B ###########

'''
A. (Obligātā daļa uz 7) Patstāvīgi atkārtot gramatā 2.1.1 nodaļā ilustrēto Furje transformāciju, tikai parraidāmā baita vietā ņemt ASCII kodu lielajam burtam, kas sakrīt ar Jūsu vārda trešo burtu (bez garumzīmēm, mīkstinājuma zīmēm). Aprēķināt vismaz pirmās 10 harmonikas un rezultātus attēlot arī grafiski, lai grafiski novērotu sākotnējā signāla pakāpenisku aproksimāciju. (Furje transformāciju skaitliskās vētības visērtāk rēķnāt un grafiski attēlot MS Excel, Mathematica vai tml. vidē)

B. Četru līmeņu digitāls signāls tiek raidīts caur 3 KHz kanalu, kura trokšņu līmenis ir 20dB. Ar Nikvista un Šenona formulām novērtējiet maksimālo datu parraides ātrumu un izvērtējiet kuras formulas rezultāts šajā gadījumā būtu jēņem vērā novērtējot maksimālo iespējamo datu pārraides ātrumu.

C. CDMA uztvērējs uztvēris sekojošu "čipu" virknīti: (-1 +3 -3 +1 -1 -1 -1 -1). Izmantojot attēlā 2-45(b) definētās raidstacijas un to čipu virknites, noskaidrot kuras no raidstacijam A,B,C,D ir raidījušas un kādu bitu (0 vai 1) katra no raidošajām stacijām ir noraidījusi?

D. (Neobligata dala uz 10) Grafiski uzkonstruējiet signāla formu (dažus periodus), kas caur 0-4KHz frekvenču joslu ļautu parraidīt datus ar ātrumu 8Kbps. Pamatojiet, kāpēc jūsu uzkonstruētajam signālam nav būtisku harmoniku augstāku par 4KHz. Kas būtu jāizmaina, lai jūsu uzkonstruēto signālu pārvērstu ierobežotas frekvenču josas radio-signālā (piemēram 100-104KHz)?


'''

bpsk=np.sin(2*np.pi*8*telpa+xs*np.pi)
plt.plot(telpa, bpsk)
plt.show()


I=Is*np.cos(2*np.pi*8*telpa)
Q=Qs*np.sin(2*np.pi*8*telpa)

plt.plot(telpa, (I+Q))
plt.show()





