# -*- coding: utf-8 -*-
"""
Created on Thu Mar 26 17:37:43 2020

@author: Repre
"""
x1=int(input("Ingrese x1"))
y1=int(input("Ingrese y1"))
x2=int(input("Ingrese x2"))
y2=int(input("Ingrese y2"))
d=((x2-x1)**2+(y2-y1)**2)**0.5
print("La distancia entre los dos puntos es:",(d))

#%%
n1=float(input("Ingrese la primera nota:"))
n2=float(input("Ingrese la segunda nota:"))
n3=float(input("Ingrese la tercera nota:"))
n4=float(input("Ingrese la cuarta nota:"))
n5=float(input("Ingrese la quinta nota:"))
nf=n1*0.15+n2*0.2+n3*0.15+n4*0.3+n5*0.2
if nf<2.0:
    print("Usted no puede hablitar la materia")
elif nf>=2.0 and nf<3.0:
    print("Usted puede habilitar la materia")
elif nf>=3.0 and nf<4.5:
    print("Usted aprobo la materia")
else:
    print("Felicitacion, logro una excelente calificacion") 