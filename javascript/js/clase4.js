let elemento = document.getElementById("principal");
// console.log(elemento)
// alert (elemento)
let btn = document.getElementById("btn");

window.addEventListener('load',function(){});
function uno(){
    alert('Estamos en onload')
}

btn.addEventListener('click',
function inicio(){alert('Estamos llamando a la funcion')})

window.addEventListener('load',
function(){
    elemento.innerHTML=`<form>
    <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Email address</label>
      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
      <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
      <label for="exampleInputPassword1" class="form-label">Password</label>
      <input type="password" class="form-control" id="exampleInputPassword1">
    </div>
    <div class="mb-3 form-check">
      <input type="checkbox" class="form-check-input" id="exampleCheck1">
      <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>
    <button id="btn" type="submit" class="btn btn-primary">Entrar</button>
  </form>`
})