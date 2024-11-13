# Clase base Empleado
class Empleado:
    def __init__(self, nombre, id, salarioBase):
        self._nombre = nombre         
        self._id = id                  
        self._salarioBase = salarioBase  

    # Método para calcular el salario base
    def calcularSalario(self):
        return self._salarioBase

    # Getters y Setters para nombre
    def getNombre(self):
        return self._nombre

    def setNombre(self, nombre):
        self._nombre = nombre

    # Getters y Setters para id
    def getId(self):
        return self._id

    def setId(self, id):
        self._id = id

    # Getters y Setters para salarioBase
    def getSalarioBase(self):
        return self._salarioBase

    def setSalarioBase(self, salarioBase):
        self._salarioBase = salarioBase


class EmpleadoTiempoCompleto(Empleado):
    def calcularSalario(self):
        # Salario con un bono del 10%
        return self._salarioBase * 1.10


class EmpleadoMedioTiempo(Empleado):
    def calcularSalario(self):
        # Salario con 50% del salario base
        return self._salarioBase * 0.50


class EmpleadoPorHoras(Empleado):
    def __init__(self, nombre, id, salarioBase, tarifaPorHora):
        super().__init__(nombre, id, salarioBase)
        self._horasTrabajadas = 0     
        self._tarifaPorHora = tarifaPorHora 

    def setHorasTrabajadas(self, horas):
        self._horasTrabajadas = horas

    def calcularSalario(self):
        return self._horasTrabajadas * self._tarifaPorHora



if __name__ == "__main__":
   
    empleado1=EmpleadoTiempoCompleto("Carlos Pérez", "EMP001", 3000.0)
    empleado2=EmpleadoMedioTiempo("Ana López", "EMP002", 3000.0)
    empleado3=EmpleadoPorHoras("Luis Martínez", "EMP003", 3000.0, 15.0) 

    empleado3.setHorasTrabajadas(120)  

    empleados=[empleado1, empleado2, empleado3]

    for empleado in empleados:
        print(f"Empleado: {empleado.getNombre()}, ID: {empleado.getId()}, Salario calculado: ${empleado.calcularSalario():.2f}")
