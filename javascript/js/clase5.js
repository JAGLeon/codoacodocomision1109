let elemento = document.querySelector("#principal");

/*Arreglos */

let mascotas = [];

// Asignando valores posiciones/indices

// mascotas[0]= "Loro";
// mascotas[1] = "Perro";
//{propietario,especie,raza,edad,peso,imagen,tipoConsulta}
const agregarMascotas=(mascota)=>{
    let datos = document.querySelectorAll("input");
    console.log(datos[6].checked);
    let consulta = "";
    if(datos[6].checked){
        consulta="urgencia";
    }else{
        consulta="consulta"
    };
        console.log(consulta)
     mascota = {
        propietarios:datos[0].value,
        especie:datos[1].value,
        raza:datos[2].value,
        edad:datos[3].value,
        peso:datos[4].value,
        src:datos[5].value,
        consulta:consulta
    };
    mascotas.push(mascota);
    mostrarMascotas();
};

const mostrarMascotas=()=>{
// function mostrarMascotas(){};
    for(let a = 0; a < mascotas.length; a++){
        elemento.innerHTML+=
        `<div class="card" style="width: 18rem;">
        <img src="data:image/jpeg;base64,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" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Propietario ${mascotas[a].propietario}</h5>
          <p class="card-text">Especie ${mascotas[a].especie}</p>
          <p class="card-text">Raza ${mascotas[a].raza}</p>
          <p class="card-text">Edad ${mascotas[a].edad}</p>
          <p class="card-text">Peso ${mascotas[a].peso}</p>
          <p class="card-text">Tipo de consulta: ${mascotas[a].consulta}</p>
          <a href="#" class="btn btn-primary">Agregar otra mascota</a>
        </div>
      </div>`;
    }
};
// elemento.innerHTML= `<h2> ${mascotas} </h2>`;
// elemento.innerHTML= `<h2> ${mascotas.length} Mascotas ${mascotas} </h2>`;
const CrearFormulario=()=>{
    elemento.innerHTML=`
    <form>
    <div class="mb-3">
      <label for="prop" class="form-label">
      Propietario
      </label>
      <input type="text" class="form-control" id="prop">
      <div id="emailHelp" class="form-text"></div>
    </div>
    <div class="mb-3">
      <label for="especie" class="form-label">
      Especie
      </label>
      <input type="text" class="form-control" id="especie">
    </div>
    <div class="mb-3">
    <label for="raza" class="form-label">
    Raza
    </label>
    <input type="text" class="form-control" id="raza">
    </div>
    <div class="mb-3">
    <label for="edad" class="form-label">
    Edad
    </label>
    <input type="text" class="form-control" id="edad">
    </div>
    <div class="mb-3">
    <label for="peso" class="form-label">
    Peso
    </label>
    <input type="text" class="form-control" id="peso">
    </div>
    <div class="mb-3">
    <label for="img" class="form-label">
    img
    </label>
    <input type="text" class="form-control" id="img">
    </div>
    <div class="mb-3 form-check">
        <input type="radio" class="form-check-input" name="tipo" id="urgencia">
        <label class="form-check-label" for="urgencia">Urgencia</label>
    </div>
    <div class="mb-3 form-check">
        <input type="radio" class="form-check-input" name="tipo" id="consulta">
        <label class="form-check-label" for="consulta">Consulta</label>
    </div>
    
    <button type="button" class="btn btn-primary" id="btn">Agregar datos de tu mascota</button>
  </form>`;
  document.getElementById("btn").addEventListener('click',agregarMascotas);
};
CrearFormulario();