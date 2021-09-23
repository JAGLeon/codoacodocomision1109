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
}else{
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
 document.write("<div class='container'><div class='row' id='principal'><h1 class='text-center bg-info'>"+ saludar + "</h1></div></div>");

 document.write(`
    <div class='container'><div class='row' id='principal'>
    <h1 class='text-center bg-info'> ${saludar} </h1></div></div>"
 `)

// let mensaje = prompt("Menú \n 1. Papas fritas \n 2. Milanesa de pollo \n 3. Milanesa de carne");

// if(mensaje === "1"){
//     elemento.innerHTML="<p>Disfruta de tus papas!</p>";
// }else if(mensaje === "2"){
//     elemento.innerHTML="<p>Disfruta de tu milanesa de pollo!</p>";
// }else if(mensaje === "3"){
//     elemento.innerHTML="<p>Disfruta de tu milanesa de carne!</p>";
// }else{
//     elemento.innerHTML="Su opcion es incorrecta, vuelta a intentar";
// }


// switch (mensaje) {
//     case "1":
//         elemento.innerHTML="<p>Disfruta de tus papas!</p>";
//         break;/*Deja el switch */
//     case "2":
//         elemento.innerHTML="<p>Disfruta de tu milanesa de pollo!</p>";
//         break;
//     case "3":
//         elemento.innerHTML="<p>Disfruta de tu milanesa de carne!</p>";
//         break;

//     default:
//         elemento.innerHTML="Su opcion es incorrecta, vuelta a intentar";
//         break;
// }
// switch (mensaje) {
//     case "1":
//         elemento.innerHTML="<p>Disfruta de tus papas!</p>";
//         break;/*Deja el switch */
//     case "2":
//         elemento.innerHTML="<p>Disfruta de tu milanesa de pollo!</p>";
//         break;
//     case "3":
//         elemento.innerHTML="<p>Disfruta de tu milanesa de carne!</p>";
//         break;

//     default:
//         elemento.innerHTML="Su opcion es incorrecta, vuelta a intentar";
//         let mensaje = prompt("Menú \n 1. Papas fritas \n 2. Milanesa de pollo \n 3. Milanesa de carne");
//     /*Repitiria siempre el proceso hasta que se de un valor correcto*/

// }

let num = parseInt(prompt ("Ingresa el primer numero"));
let num2 = parseInt(prompt ("Ingresa el segundo numero"));


let resultado = "<p>El resultado de : " + num + " y " + num2 + " " + " es: " + (num + num2)+"</p>";
elemento.innerHTML=resultado;
elemento.innerHTML += "Hola";