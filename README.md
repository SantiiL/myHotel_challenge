# myHotel_challenge

Proyecto de Servicios de Empleados y Departamentos
Descripción del proyecto
Este proyecto consiste en la creación de servicios para administrar la información de los empleados y departamentos de una empresa. Se utiliza el patrón de diseño Repository para acceder a los datos en una base de datos relacional y los servicios son desarrollados con Java y Spring Boot.

La estructura del proyecto está compuesta por los siguientes paquetes:

* ` model `:contiene las clases de entidades de la base de datos.
* ` repository `: contiene los repositorios para acceder a los datos en la base de datos.
* ` service `: contiene los servicios que proveen la lógica de negocios y utilizan los repositorios para acceder a los datos.
* ` controller `: contiene los controladores que proporcionan los puntos finales para acceder a los servicios.

#Descripción de Endpoints

##Los siguientes son los endpoints disponibles en el proyecto:

### Endpoints para Empleados
* GET `/employees/countSegmentA`: devuelve la cantidad de empleados con un salario menor a 3500.

* GET `/employees/countSegmentB`: devuelve la cantidad de empleados con un salario entre 3500 y 8000.

* GET `/employees/countSegmentC`: devuelve la cantidad de empleados con un salario mayor o igual a 8000.

* GET `/employees/managersHiredMoreThan15YearsAgo`: devuelve la información de los gerentes que han sido contratados hace más de 15 años.

* GET `/employees/employeeInfoGroupedByCountry`: devuelve la información agrupada por país: cantidad empleados, salario promedio, salario más alto, salario más bajo, promedio años antigüedad.

### Endpoints para Departamentos
* GET `/departments/countEmployeesInSegmentA`: devuelve la cantidad de empleados en el segmento A agrupados por departamento.

* GET `/departments/countEmployeesInSegmentB`: devuelve la cantidad de empleados en el segmento B agrupados por departamento.

* GET `/departments/countEmployeesInSegmentC`: devuelve la cantidad de empleados en el segmento C agrupados por departamento.

* GET `/departments/employeeWithHighestSalary`: devuelve la información del empleado con el sueldo más alto por departamento.