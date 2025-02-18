// ISADORA CARVALHO E KEVIN CARRIE

// MENU HAMBURGUER

function myFunction() {

    var x = document.getElementById("myTopnav");
    
    if (x.className === "topnav") {
      
        x.className += " responsive";
    
    } else {
      
        x.className = "topnav";
        x.style.display = "block";
    
    }

}

document.querySelector(".icon").onclick = myFunction;


// AUTOMATIC SLIDESHOW IMAGES

let slideIndex = 0;
showSlides();

function showSlides() {
    
    let i;
    let slides = document.getElementsByClassName("mySlides");
    
    for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";  
    }

    slideIndex++;

    if (slideIndex > slides.length) {slideIndex = 1}    
    
    slides[slideIndex-1].style.display = "block";  
    
    setTimeout(showSlides, 3000); 
  
}

// TABS

function openTab(evt, tabName) {
    
    let tabcontent, tabbuttons, buttons;

    tabcontent = document.getElementsByClassName("tabs");
    for (let i = 0; i < tabcontent.length; i++) {

        tabcontent[i].style.display = "none"; 
    
    }

    tabbuttons = document.getElementsByClassName("tabButton");

    for (let i = 0; i < tabbuttons.length; i++) {
        tabbuttons[i].className = tabbuttons[i].className.replace(" active", "");
    }

    document.getElementById(tabName).style.display = "block"; 

    evt.currentTarget.className += " active"; 

}

buttons = document.getElementsByClassName("tabButton");

buttons[0].addEventListener("click", function (event) { openTab(event, 'Reservas'); });
buttons[1].addEventListener("click", function (event) { openTab(event, 'Viagens'); });
buttons[2].addEventListener("click", function (event) { openTab(event, 'Passeios'); });
