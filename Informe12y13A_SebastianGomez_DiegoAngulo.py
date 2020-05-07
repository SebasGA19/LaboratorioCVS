# -*- coding: utf-8 -*-
"""
Created on Sun May  3 17:58:27 2020

@author: Repre
"""
import random


# imprime la lista ingresada y su tamaño
def imprimir(lista):
    print("El tamaño de la lista es: "+ str(len(lista)))
    
    for elemento in lista:
        print(elemento)
    

# Crea una lista con tamaño n con elementos aleatorios de otra lista
def generador(lista,n):
    lista1=[]
    for i in range(len(lista)):
        if len(lista1)< n:
            a= random.choice(lista)
            if a not in lista1:
                lista1.append(a)
    
    return lista1 

# Crea una lista a partir de dos listas, esta lista sera llenada aleatoreamente con los elementos de las otras dos listas
def combinador(lista1, lista2):
    combi=[]
    a1=lista1
    b2=lista2
    c=a1
    for i in range(len(b2)):
        c.append(b2[i])
    
    k=len(c)

    while(len(combi)<k ):
        a=random.choice(c);
        combi.append(a)
        c.remove(a);
        
    return combi

# Crea la posibilidad del 10% de agregar una carta premium a la lista ingresada, si se cumplen ciertas condiciones
def loteria(paquete):
    cont=0
    cont2=0
    cont3=0
    for carta in paquete:
        for i in range(len(paquete)):
            if carta==paquete[i]:
                cont=cont+1
        
        for i in range(len(premium)):
            if carta==premium[i]:
                cont2=cont2+1
   
    if cont>0 and cont2<=1:
        if random.randint(0,100)<10:
            a=random.choice(premium)
            while cont3==0:
                for carta in premium:
                    if carta!=a:
                        cont3=cont3+1
            if cont3<=4:
                paquete.append(a)

    return paquete

# Retorna una lista de las cartas premium que obtuvo la baraja ingresada
def premCards(lista):
    prem=[]
    for carta in lista:
        for i in range(len(premium)):
            a=carta
            b=premium[i]
            if a==b:
               prem.append(a)     
               
    return prem
    
# Retorna tuplas de las letras que se repiten en la baraja ingresada
def duplicados(lista):
    dup=[]
    cont= 0
    for carta in lista:
        if carta in dup:
            cont= cont+1
        if carta not in dup:
            dup.append(carta)
    
    return cont
    

def lastDup(lista):
    cards=[]
    
    for elemento in lista:
        cont=0
        if elemento not in cards:
            cont=cont+1
            cards.append([elemento,cont])
        if elemento in cards:
            cont=cont+1
            cards.append([elemento,cont])
    
    return cards

# Retorna una lista de tuplas con la cantidad de veces que cada palabra inicia con una letra del abecedario
def abcInicial(lista):
    abece=['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    cont=0
    listOflist=[]
    lista1=lista
    for i in range(len(lista1)):
        lista1[i]=lista[i].lower()
        
    for i in range(len(abece)):
        for carta in lista1:
            if abece[i]== carta[0]:
                cont=cont+1
        listOflist.append([abece[i],cont])
        cont=0
    return listOflist

# Imprime la carta con la longitud mas larga y la mas corta 
def minMAX(lista):
    lista1=lista
    for i in range(len(lista1)):
        for j in range(i+1,len(lista1)):
            if len(lista1[i]) > len(lista1[j]):
                lista1[i], lista1[j] = lista1[j], lista1[i]
    a=lista[0]
    b=lista[-1]
    print("La carta con la longitud mas larga es :"+str(b)+" y la carta con la longitud mas corta es: "+str(a))
    
# Retorna una lista de cartas que terminan con las letras que inician las cartas premium de la baraja 
def inicioPremium(lista):
    
    prem=[]
    for carta in lista:
        for i in range(len(premium)):
            if carta == premium[i]:
               prem.append(carta)
    cont=0
    obt= [carta[0] for carta in prem]
    
    obt=[element.lower() for element in obt]
    
    for carta in lista:
            for i in range(len(obt)):
                if carta[-1]==obt[i]:
                    cont =cont+1
    
    a=[]
    if len(obt)==0:
        a.append("No hay cartas premium")
    
    if len(obt)!=0:
        a.append(cont)
        
    return a

# Retorna una lista de tuplas de la cantidad de veces que se usa cada letra del abecedario en la baraja
def abc(lista):
    abece=['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    cont=0
    listOflist=[]
    lista1=[]
    
    for i in range(len(lista)):
        lista1.append(lista[i].lower())
    
    for i in range(len(abece)):
        for carta in lista1:
            for letra in carta:
                if abece[i]==letra:
                    cont=cont+1
        listOflist.append([abece[i],cont])
        cont=0
    return listOflist

# Retorna una lista de tuplas de las letras que salen consecutivamente en las cartas de la baraja
def letrasRep(lista):
    cont=0

    rep=[]
    for cartas in lista:
        for i in range(len(cartas)-1):
            if cartas[i]==cartas[i+1]:
                a=cartas[i]
                cont=cont+1
                rep.append([a,cont])
        cont=0
    return rep 
## Declaracion de variables y llamado a las funciones

cartas = ["Payne" , "Hendrix" , "Stone" , "Coffey" , "Whitaker"  , "Pope" , "Bleach" , "Arc" , "Fleming" , "Hardin" , "Robiar" , "Mccullough" , "Mooney" , "Reynolds" , "Short" , "Stanton" , "Deadman" , "Stonehammer" , "Smith" , "Patrick" , "Crane" , "Cargane" , "Powers" , "Wade" , "Joseph" , "Savage" , "Houston" , "Merritt" , "Nuke" , "Barnett" , "Acosta" , "Duke" , "Sellers" , "Blake" , "Schneider" , "Stone" , "Cannon" , "Garrison" , "Randall" , "Leon" , "Buck" , "Shannon" , "Delaney" , "Mckinney" , "Dodademocles" , "Flowers" , "Whitehead" , "Kirby" , "Park" , "Shannon" , "Vlad" , "Pepin" , "Mcguire" , "Murray" , "Rush" , "Aramis" , "Fletcher" , "Mcfadden" , "Deleon" , "Luke" , "Lindsay" , "Payne" , "Gerbvo" , "Hubbard" , "Burnett" , "Bryan" , "Ratliff" , "Carlson" , "Parsons" , "Deadmeat" , "Crimson" , "Wilson" , "Terry" , "Hancock" , "Hightower" , "Burns" , "Austin" , "Nightwalker" , "Thetis" , "Owen" , "Tate" , "Simmons" , "Grant" , "Barber" , "Talos" , "Ashes" , "Alston" , "Clayton" , "Mcbride" , "Huffman" , "Lightbringer" , "Blankenship" , "Higgins" , "Saint" , "Graham" , "Hodor" , "Ellison" , "Roberts" , "Odom" , "Mann"] 
premium = ["AIVLIS", "LEIRBAG", "NAILUJ", "SOLRAC", "ANAID"]

imprimir(cartas)
imprimir(premium)

# Se crea el jugador con la funcion generador
jugador= generador(cartas, 10)

# Se crea el juego con las funcion combinador combinando las cartas y premium
juego=combinador(cartas,premium)
# Se crean 3 mazos de 5 cartas a partir del juego
sobre_uno=generador(juego,5)
sobre_dos=generador(juego,5)
sobre_tres=generador(juego,5)

# Se combinan los 3 paquetes
paqueteNoterminado=combinador(sobre_uno,sobre_dos)
paquete=combinador(paqueteNoterminado,sobre_tres)

# Se crea el jugador final combinando las cartas del jugador con el paquete
jugadorf=combinador(jugador,paquete)
# Por ultimo se le permite jugar la loteria al jugador por una posible carta premium mas
jugadorf=loteria(jugadorf)

print("Las cartas del jugador son: ")
print(jugadorf)
print("Las cartas premium del jugador son: ")
print(premCards(jugadorf))
print("La cantidad de cartas repetidas del jugador fueron: ")
print(duplicados(jugadorf))

print("La cantidad de veces que esta cada elemento es : ")
print(lastDup(jugadorf))

print(minMAX(jugadorf))
print("La cantidad de cartas que terminan con la letra que inician las cartas premium de la baraja son:")
print(inicioPremium(jugadorf))
print("La cantidad de letras consecutivas en la baraja son :")
print(letrasRep(jugadorf))
print("La cantidad de veces que esta cada palabra del abecedario es: ")
print(abc(jugadorf))
print("La cantidad de veces que cada carta inicia con cada letra del abecedario es : ")
print(abcInicial(jugadorf))