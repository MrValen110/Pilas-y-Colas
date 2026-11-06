import sys

class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None #Puntero
class Pila:
    def __init__(self):
        self.cabeza = None #Al inicio está vacía
    def apilar(self, nodo):
        nuevo = Nodo(nodo)
        if self.cabeza is None:
            self.cabeza = nuevo
            return 1
        if c < 5:
            nuevo.siguiente = self.cabeza
            self.cabeza = nuevo
            return 1
        else:
            print("La batería explotará en 3, 2, 1...")
            sys.exit()
            return 1
    def sacar(self):
        if self.cabeza is None:
            return
        out = self.cabeza
        self.cabeza = out.siguiente
    def mostrar_lista(self):
        actual = self.cabeza
        while actual is not None:
            print(f"[{actual.dato}]")
            actual = actual.siguiente
        print("Fin de la lista")    
lim = 5

c = 0

j = Pila()
m = [1, 2, 3, 4, 5]
for e in m:
    c = c + j.apilar(e)
j.mostrar_lista()
j.apilar(6)
j.sacar()
j.mostrar_lista()