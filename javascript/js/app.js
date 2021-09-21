alert("Hola mundo!")/*Ventana emergente*/
console.log("Estamos en la consola")

let nombre = "Tony"; /*String*/
var numero = 10; /*Numerica*/
const PI = 3.1416
let hayClases = true;
let esFeriado = true;
console.log((numero+35)+" "+nombre) /*+ concatena*/
console.log(hayClases)
console.log (5>3)


/*Condicionales*/
if(5>3){
    console.log("Es correcto!")
} else{
    console.log("No es correcto!")
}
console.log((5>8)?"Es correcto":"Es incorrecto");/*Ternario*/


if(hayClases == true && esFeriado != true)/*se tiene que cumplir las 2 para que sea true*/{
    console.log('Me conecto a la videollamada')
}else{
    console.log('No me conecto a la llamada')
}


if(25<32 || 12>20){ /* || es "O" hace que algunas de las 2 se cumpla*/
    /**/
    console.log('Se cumple la condicion')
}

let saludo = "¿Hola, como estas? "
let saludar = saludo + nombre

let elemento = document.getElementById("principal")
// console.log(elemento)
elemento.innerHTML= "<h1 class='text-center bg-info'>"+ saludar + "</h1>";